package game;

import java.util.ArrayList;

// -------------------------------------------------------------------------
/**
 * Manages the collection of weekly events for the semester.
 * 
 * @author Corbin
 * @version 2026.09.20
 */
public class EventManager {

    private ArrayList<Event> events;

    // ----------------------------------------------------------
    /**
     * Creates the collection of events used during the semester.
     */
    public EventManager() {
        events = new ArrayList<Event>();

        ArrayList<Choice> choices1 = new ArrayList<Choice>();
        choices1.add(new Choice("1. Attend and pay attention", -10, -12, 7));
        choices1.add(new Choice("2. Skip and sleep in", 5, -10, -14));
        events.add(new Event("Attend your first day of class!", choices1));

        ArrayList<Choice> choices2 = new ArrayList<Choice>();
        choices2.add(new Choice("1. Study hard all night", -15, -12, 9));
        choices2.add(new Choice("2. Study casually with friends", 5, 4, 3));
        events.add(new Event(
            "Your first big exam is coming up. How are you spending tonight?",
            choices2));

        ArrayList<Choice> choices3 = new ArrayList<Choice>();
        choices3.add(new Choice("1. Go to the party", 8, -14, -12));
        choices3.add(new Choice("2. Stay in and rest", -10, 6, 2));
        events.add(new Event(
            "Your friends just invited you to a party off campus. What do you "
            + "do?",
            choices3));

        ArrayList<Choice> choices4 = new ArrayList<Choice>();
        choices4.add(new Choice("1. Take the lead", -11, 6, 7));
        choices4.add(new Choice("2. Let others handle it", 3, -13, -12));
        events.add(new Event(
            "Your group project is getting serious, and your team needs "
            + "someone to step up.",
            choices4));

        ArrayList<Choice> choices5 = new ArrayList<Choice>();
        choices5.add(new Choice("1. Work out", 6, 5, -10));
        choices5.add(new Choice("2. Skip the gym", -11, -10, 3));
        events.add(new Event(
            "You've got some free time between classes. Time to hit the gym?",
            choices5));

        ArrayList<Choice> choices6 = new ArrayList<Choice>();
        choices6.add(new Choice("1. Join and participate", 7, 4, -11));
        choices6.add(new Choice("2. Skip to catch up on homework", -10, -10,
            6));
        events.add(new Event(
            "Your club is meeting tonight, and there's a lot going on at"
            + " Squires.",
            choices6));

        ArrayList<Choice> choices7 = new ArrayList<Choice>();
        choices7.add(new Choice("1. Talk it out calmly", 5, 4, 1));
        choices7.add(new Choice("2. Avoid the conversation", -14, -12, -10));
        events.add(new Event(
            "Things have been tense with your roommate lately. It's probably"
            + " time to deal with it.",
            choices7));

        ArrayList<Choice> choices8 = new ArrayList<Choice>();
        choices8.add(new Choice("1. Network with employers", -10, 7, 5));
        choices8.add(new Choice("2. Skip it", 4, -15, -11));
        events.add(new Event(
            "The career fair is packed with recruiters looking for Hokies."
            + " Are you going?",
            choices8));

        ArrayList<Choice> choices9 = new ArrayList<Choice>();
        choices9.add(new Choice("1. Pull the all-nighter", -16, -15, 9));
        choices9.add(new Choice("2. Turn in what you have and sleep", 4, -10,
            -13));
        events.add(new Event(
            "It's almost midnight, your deadline is tomorrow, and you're"
            + " nowhere near finished.",
            choices9));

        ArrayList<Choice> choices10 = new ArrayList<Choice>();
        choices10.add(new Choice("1. Long heartfelt call", 8, 3, -10));
        choices10.add(new Choice("2. Quick call, back to work", 2, 5, 1));
        events.add(new Event(
            "Your family calls to check in. You haven't talked to them in"
            + " a while.",
            choices10));

        ArrayList<Choice> choices11 = new ArrayList<Choice>();
        choices11.add(new Choice("1. Go all out", 9, -16, -13));
        choices11.add(new Choice("2. Watch briefly then leave", 4, -10, -10));
        events.add(new Event(
            "It's game day in Blacksburg! Your friends are heading to the"
            + " tailgate before kickoff.",
            choices11));

        ArrayList<Choice> choices12 = new ArrayList<Choice>();
        choices12.add(new Choice("1. Rest and recover", 5, -10, -11));
        choices12.add(new Choice("2. Push through and go to class anyway", -15,
            -10, 3));
        events.add(new Event(
            "You wake up feeling awful. Your body is telling you to take a"
            + " day off.",
            choices12));

        ArrayList<Choice> choices13 = new ArrayList<Choice>();
        choices13.add(new Choice("1. Volunteer for the afternoon", 7, 5, -10));
        choices13.add(new Choice("2. Skip to focus on coursework", -10, -10,
            6));
        events.add(new Event(
            "There's a volunteer event happening around Blacksburg this"
            + " afternoon. Want to give back?",
            choices13));

        ArrayList<Choice> choices14 = new ArrayList<Choice>();
        choices14.add(new Choice("1. Accept", -12, 7, -11));
        choices14.add(new Choice("2. Decline, focus on classes", 3, -12, 7));
        events.add(new Event(
            "Your internship offers you extra hours this week. More"
            + " experience, but less free time.",
            choices14));

        ArrayList<Choice> choices15 = new ArrayList<Choice>();
        choices15.add(new Choice("1. Grind through a study marathon", -17, -16,
            9));
        choices15.add(new Choice("2. Balance study with breaks", -10, 6, 5));
        events.add(new Event(
            "Finals week has arrived. The library is packed, the pressure"
            + " is on, and you've got work to do.",
            choices15));
    }


    // ----------------------------------------------------------
    /**
     * Returns the event paired with the given week.
     *
     * @param week
     *            the current semester week
     * @return the matching Event, or null if the week is invalid
     */
    public Event getCurrentEvent(int week) {
        int index = week - 1;
        if (index < 0 || index >= events.size()) {
            return null;
        }
        return events.get(index);
    }


    // ----------------------------------------------------------
    /**
     * Returns the total number of events currently stored.
     *
     * @return the number of events
     */
    public int getEventCount() {
        return events.size();
    }
}
