package game;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

// -------------------------------------------------------------------------
/**
 * Saves data to a save file or loads data from a pre-existing one.
 * 
 * @author Armaan
 * @version 2026.09.14
 */
public class SaveManager {
    
    private String fileName;

    // ----------------------------------------------------------
    /**
     * Create a new SaveManager object.
     * 
     * @param fileName
     *            The name of the save file.
     */
    public SaveManager(String fileName) {
        this.fileName = fileName;
    }


    // ----------------------------------------------------------
    /**
     * Saves player data to a save file.
     * 
     * @param player
     *            The player whose data will be saved.
     * @throws IOException
     *             if the save file cannot be written to.
     */
    public void save(Player player) throws IOException {
        Path saveFile = Path.of("saves", fileName + ".txt");

        String data = player.getWeek() + "\n" + player.getHappiness() + "\n"
            + player.getMotivation() + "\n" + player.getAcademicPerformance();

        Files.writeString(saveFile, data);
    }


    // ----------------------------------------------------------
    /**
     * Loads player data from a pre-existing save file.
     * 
     * @return a Player object with the data from the save file.
     * @throws IOException
     *             If the save file cannot be read.
     */
    public Player load() throws IOException {
        Player player = new Player();

        if (saveExists()) {
            Path saveFile = Path.of("saves", fileName + ".txt");

            List<String> lines = Files.readAllLines(saveFile);

            player.setWeek(Integer.parseInt(lines.get(0)));
            player.setHappiness(Integer.parseInt(lines.get(1)));
            player.setMotivation(Integer.parseInt(lines.get(2)));
            player.setAcademicPerformance(Integer.parseInt(lines.get(3)));
        }

        return player;
    }


    // ----------------------------------------------------------
    /**
     * Checks whether a save exists or not.
     * 
     * @return true if a file exists, false otherwise.
     */
    public boolean saveExists() {
        return Files.exists(Path.of("saves", fileName + ".txt"));
    }
}
