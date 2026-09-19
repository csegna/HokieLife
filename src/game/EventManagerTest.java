package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EventManagerTest 
{

    private EventManager manager;

    @BeforeEach
    void setUp() {
        manager = new EventManager();
    }

    @Test
    void testConstructorCreatesEvents() {
        assertTrue(manager.getEventCount() > 0);
    }

    @Test
    void testGetCurrentEventValidWeek() {
        Event event = manager.getCurrentEvent(1);
        assertNotNull(event);
    }

    @Test
    void testGetCurrentEventInvalidWeekZero() {
        assertNull(manager.getCurrentEvent(0));
    }

    @Test
    void testGetCurrentEventInvalidWeekTooHigh() {
        assertNull(manager.getCurrentEvent(99));
    }

    @Test
    void testGetEventCountMatchesActualSize() {
        assertEquals(2, manager.getEventCount());
    }
}