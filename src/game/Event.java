package game;

import java.util.ArrayList;

public class Event {
    //~ Fields ................................................................
    private String prompt;
    private ArrayList<Choice> choices;

    //~ Constructors ..........................................................
    public Event(String prompt, ArrayList<Choice> choices) {
        this.prompt = prompt;
        this.choices = choices;
    }

    //~ Public Methods ........................................................
    public String getPrompt() {
        return prompt;
    }

    public ArrayList<Choice> getChoices() {
        return choices;
    }
}
