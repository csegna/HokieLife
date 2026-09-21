package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// -------------------------------------------------------------------------
/**
 * Test class for EventManager.
 *
 * @author Corbin
 * @version 2026.09.20
 */
class EventManagerTest {

    private EventManager manager;

    // ----------------------------------------------------------
    /**
     * Set up for all test methods. Runs before every test.
     */
    @BeforeEach
    void setUp() {
        manager = new EventManager();
    }


    // ----------------------------------------------------------
    /**
     * Checks if the manager created events in the constructor.
     */
    @Test
    void testConstructorCreatesEvents() {
        assertTrue(manager.getEventCount() > 0);
    }


    // ----------------------------------------------------------
    /**
     * Tests if the week given is a valid index.
     */
    @Test
    void testGetCurrentEventValidWeek() {
        Event event = manager.getCurrentEvent(1);
        assertNotNull(event);
    }


    // ----------------------------------------------------------
    /**
     * Tests an invalid week.
     */
    @Test
    void testGetCurrentEventInvalidWeekZero() {
        assertNull(manager.getCurrentEvent(0));
    }


    // ----------------------------------------------------------
    /**
     * Tests an invalid week.
     */
    @Test
    void testGetCurrentEventInvalidWeekTooHigh() {
        assertNull(manager.getCurrentEvent(99));
    }


    // ----------------------------------------------------------
    /**
     * Tests if the event count matches the actual size. Should be 15.
     */
    @Test
    void testGetEventCountMatchesActualSize() {
        assertEquals(15, manager.getEventCount());
    }
}
