package game;

import java.util.ArrayList;

// -------------------------------------------------------------------------
/**
 * Represents an event in the game.
 * 
 * @author Corbin
 * @version 2026.09.14
 */
public class Event {

    private String prompt;
    private ArrayList<Choice> choices;

    // ----------------------------------------------------------
    /**
     * Create a new Event object.
     * 
     * @param prompt
     *            the event prompt.
     * @param choices
     *            the choices for the event.
     */
    public Event(String prompt, ArrayList<Choice> choices) {
        this.prompt = prompt;
        this.choices = choices;
    }


    // ----------------------------------------------------------
    /**
     * Gets the text of the prompt.
     * 
     * @return the text of the prompt.
     */
    public String getPrompt() {
        return prompt;
    }


    // ----------------------------------------------------------
    /**
     * Gets the choices for the prompt.
     * 
     * @return the choices for the prompt.
     */
    public ArrayList<Choice> getChoices() {
        return choices;
    }
}
