package game;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// -------------------------------------------------------------------------
/**
 * Test class for SaveManager.
 *
 * @author Armaan
 * @version 2026.09.20
 */
class SaveManagerTest {

    private SaveManager saveManager;
    private final String testFileName = "testSave";

    // ----------------------------------------------------------
    /**
     * Set up for all test methods. Runs before every test.
     *
     * @throws IOException
     *             if the saves directory cannot be created.
     */
    @BeforeEach
    void setUp() throws IOException {
        Files.createDirectories(Path.of("saves"));
        saveManager = new SaveManager(testFileName);
    }

    // ----------------------------------------------------------
    /**
     * Cleans up the test save file after every test so that
     * duplicate files are not created.
     *
     * @throws IOException
     *             if the test save file cannot be deleted.
     */
    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Path.of("saves", testFileName + ".txt"));
    }

    // ----------------------------------------------------------
    /**
     * Tests saveExists() when no save file exists.
     */
    @Test
    void testSaveExistsWhenNoSave() {
        assertFalse(saveManager.saveExists());
    }

    // ----------------------------------------------------------
    /**
     * Tests save() and saveExists().
     *
     * @throws IOException
     *             if the player cannot be saved.
     */
    @Test
    void testSaveAndSaveExists() throws IOException {
        Player player = new Player();

        saveManager.save(player);

        assertTrue(saveManager.saveExists());
    }

    // ----------------------------------------------------------
    /**
     * Tests that save() correctly stores the player's data.
     *
     * @throws IOException
     *             if the player cannot be saved or the file cannot be read.
     */
    @Test
    void testSaveContents() throws IOException {
        Player player = new Player();

        player.setWeek(5);
        player.setHappiness(80);
        player.setMotivation(70);
        player.setAcademicPerformance(90);

        saveManager.save(player);

        Path saveFile = Path.of("saves", testFileName + ".txt");
        String data = Files.readString(saveFile);

        String expected = "5\n80\n70\n90";

        assertEquals(expected, data);
    }

    // ----------------------------------------------------------
    /**
     * Tests that load() returns a player with the saved data.
     *
     * @throws IOException
     *             if the save file cannot be written or read.
     */
    @Test
    void testLoad() throws IOException {
        Player original = new Player();

        original.setWeek(7);
        original.setHappiness(60);
        original.setMotivation(75);
        original.setAcademicPerformance(85);

        saveManager.save(original);

        Player loaded = saveManager.load();

        assertEquals(7, loaded.getWeek());
        assertEquals(60, loaded.getHappiness());
        assertEquals(75, loaded.getMotivation());
        assertEquals(85, loaded.getAcademicPerformance());
    }

    // ----------------------------------------------------------
    /**
     * Tests load() when no save file exists.
     * A new default Player should be returned.
     *
     * @throws IOException
     *             if the save file cannot be read.
     */
    @Test
    void testLoadWithoutSave() throws IOException {
        Player player = saveManager.load();

        assertNotNull(player);
    }
}
