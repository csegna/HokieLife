package game;

import java.util.ArrayList;

public class EventManager
{
    private ArrayList<Event> events;

    public EventManager()
    {
        events = new ArrayList<Event>();
    }
    
    public Event getCurrentEvent(int week)
    {
        return null; // implement later
    }

    public int getEventCount()
    {
        return events.size();
    }
}
