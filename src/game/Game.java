package game;

import java.io.IOException;

import java.util.InputMismatchException;
import java.util.Scanner;

// -------------------------------------------------------------------------
/**
 * The main class, Game, where the main loop and conditions will be run.
 * 
 * @author armaan
 * @version 09.20.2026
 */
public class Game {
    private EventManager eventManager;
    private SaveManager saveManager;
    private Player player;

    /**
     * Creates a new Game object.
     * 
     * @throws IOException
     *             if the save file cannot be written to.
     */
    private Game() throws IOException {
        eventManager = new EventManager();
        saveManager = new SaveManager("stats");
        player = saveManager.load();
    }

    // ----------------------------------------------------------
    /**
     * Plays the current week.
     * 
     * @param scanner
     *            The scanner which will read input.
     */
    private void playWeek(Scanner scanner) {
        Event currentEvent = eventManager.getCurrentEvent(player.getWeek());

        // Print statistics.
        System.out.println("Week: " + player.getWeek() + "\n" + "Happiness: "
            + player.getHappiness() + "\n" + "Motivation: " + player
                .getMotivation() + "\n" + "Academic performance: " + player
                    .getAcademicPerformance() + "\n");

        // Print prompt.
        System.out.println(currentEvent.getPrompt());

        // Print choices.
        for (Choice choice : currentEvent.getChoices()) {
            System.out.println(choice.getText());
        }

        // Get response.
        int response = 0;

        while (response != 1 && response != 2) {
            System.out.print("Enter your choice (1 or 2): ");

            try {
                response = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
        }

        Choice playerChoice = currentEvent.getChoices().get(response - 1);

        // Finally, increment relevant data.
        player.applyChoice(playerChoice);
        player.advanceWeek();

        // Print this new line for formatting.
        System.out.println("\n");
    }

    // ----------------------------------------------------------
    /**
     * Checks if the game is over.
     * 
     * @returns a boolean indicating if the game is over.
     */
    private boolean isGameOver() {
        return player.getWeek() > 15;
    }

    // ----------------------------------------------------------
    /**
     * Gets the outcome of the game.
     * 
     * @returns the message depending on whether you win or lose.
     */
    private String getOutcome() {
        if (player.getAcademicPerformance() >= 70 && player
            .getMotivation() >= 50 && player.getHappiness() >= 50) {
            return "You pass!";
        }
        return "You failed...";

    }

    // ----------------------------------------------------------
    /**
     * The entry point.
     * 
     * @param args
     *             Default parameter.
     * @throws IOException
     *             if the save file cannot be written to.
     */
    public static void main(String[] args) throws IOException {
        Game game = new Game();

        // Print welcome message.
        System.out.println("Welcome to Hokie Life!\n\n"
            + "Today is your first day as a Freshman at Virginia Tech.\n"
            + "Can you survive your first semester?\n\n"
            + "Every week, You will be prompted two choices for an event.\n"
            + "Every choice either increments or decrements a statistics.\n\n"
            + "Your statistics are: \n"
            + "Happiness, motivation, and academic performance.\n\n"
            + "By the end of fifteen weeks, or one semester, you must have "
            + "these values to pass.\n" + "Happiness >= 50\n"
            + "Motivation >= 50\n" + "Academic performance >= 70\n\n");

        if (game.saveManager.saveExists()) {
            System.out.println("Save file found! Loading data...");
        }
        Scanner scanner = new Scanner(System.in);

        while (!game.isGameOver()) {
            game.playWeek(scanner);

            // Save after a week.
            game.saveManager.save(game.player);
        }
        
        System.out.println(game.getOutcome());
    }

}
