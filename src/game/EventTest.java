package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

// -------------------------------------------------------------------------
/**
 * Test class for Event.
 *
 * @author Armaan
 * @version 2026.09.20
 */
class EventTest {

    private Event event;
    private ArrayList<Choice> testChoices;

    // ----------------------------------------------------------
    /**
     * Set up for all test methods. Runs before every test.
     */
    @BeforeEach
    void setUp() {
        testChoices = new ArrayList<Choice>();
        testChoices.add(new Choice("Test choice", 1, 1, 1));
        event = new Event("Test event", testChoices);
    }


    // ----------------------------------------------------------
    /**
     * Checks the getPrompt() method.
     */
    @Test
    void testGetPrompt() {
        assertEquals(event.getPrompt(), "Test event");
    }


    // ----------------------------------------------------------
    /**
     * Tests the getChoices() method.
     */
    @Test
    void testGetChoices() {
        assertEquals(event.getChoices(), testChoices);
    }
}
