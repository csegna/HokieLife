package game;

import java.util.ArrayList;

/**
 * Represents one weekly situation, with a prompt and available choices.
 * Placeholder implementation — Eyal owns the real version.
 */
public class Event {
    //~ Fields ................................................................
    private String prompt;
    private ArrayList<Choice> choices;

    //~ Constructors ..........................................................
    /**
     * Creates an event with a situation prompt and its choices.
     *
     * @param prompt the situation text shown to the player
     * @param choices the available choices for this event
     */
    public Event(String prompt, ArrayList<Choice> choices) {
        this.prompt = prompt;
        this.choices = choices;
    }

    //~ Public Methods ........................................................
    /**
     * Returns the event's prompt text.
     *
     * @return the situation text
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * Returns the list of choices for this event.
     *
     * @return the available choices
     */
    public ArrayList<Choice> getChoices() {
        return choices;
    }
}