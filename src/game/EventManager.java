package game;

import java.util.ArrayList;

/**
 * Manages the collection of weekly events for the semester.
 */
public class EventManager {
    //~ Fields ............................................................
    private ArrayList<Event> events;

    //~ Constructors ......................................................
    /**
     * Creates the collection of events used during the semester.
     */
    public EventManager() 
    {
        events = new ArrayList<Event>();

        // Placeholder events for testing — replace with real content
        ArrayList<Choice> choices1 = new ArrayList<Choice>();
        choices1.add(new Choice("Study all night", -10, 15, 20));
        choices1.add(new Choice("Go to bed early", 10, 5, -5));
        events.add(new Event(
            "You have an exam tomorrow. What do you do?", choices1));

        ArrayList<Choice> choices2 = new ArrayList<Choice>();
        choices2.add(new Choice("Go to the party", 15, -10, -10));
        choices2.add(new Choice("Stay in and relax", 5, 0, 0));
        events.add(new Event(
            "Your friends invite you to a party. What do you do?",
            choices2));
    }

    //~ Public Methods .....................................................
    /**
     * Returns the event paired with the given week.
     *
     * @param week the current semester week
     * @return the matching Event, or null if the week is invalid
     */
    public Event getCurrentEvent(int week) 
    {
        int index = week - 1;
        if (index < 0 || index >= events.size()) 
        {
            return null;
        }
        return events.get(index);
    }

    /**
     * Returns the total number of events currently stored.
     *
     * @return the number of events
     */
    public int getEventCount() 
    {
        return events.size();
    }
}
