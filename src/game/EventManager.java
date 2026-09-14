package game;

import java.util.ArrayList;

// -------------------------------------------------------------------------
/**
 * Manages events and assigns them a position in a list that corresponds
 * to the week.
 * 
 * @author Corbin
 * @version 2026.09.14
 */
public class EventManager {
    
    private ArrayList<Event> events;

    // ----------------------------------------------------------
    /**
     * Create a new EventManager object.
     */
    public EventManager() {
        events = new ArrayList<Event>();
    }


    // ----------------------------------------------------------
    /**
     * Gets the current event.
     * 
     * @param week
     *            the week for the event.
     * @return the event corresponding to the week.
     */
    public Event getCurrentEvent(int week) {
        return events.get(week);
    }


    // ----------------------------------------------------------
    /**
     * Gets the amount of events in the list.
     * 
     * @return the amount of events in the list.
     */
    public int getEventCount() {
        return events.size();
    }
}
