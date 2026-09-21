package game;

//-------------------------------------------------------------------------
/**
 * Manages the player's state throughout the game: the current week
 * and the three core statistics (happiness, motivation, academicPerformance).
 * 
 * @author Ashwin
 * @version 2026.09.14
 */
public class Player {

    private int week;
    private int happiness;
    private int motivation;
    private int academicPerformance;

    // ----------------------------------------------------------
    /**
     * Create a new Player object.
     */
    public Player() {
        this.week = 1;
        this.happiness = 100;
        this.motivation = 100;
        this.academicPerformance = 100;
    }


    // ----------------------------------------------------------
    /**
     * Applies the selected choice's effects to the player's statistics.
     * Keeps each statistic clamped between 0 and 100.
     *
     * @param choice
     *            the Choice whose effects should be applied.
     */
    public void applyChoice(Choice choice) {
        happiness = happiness + choice.getHappinessChange();
        motivation = motivation + choice.getMotivationChange();
        academicPerformance = academicPerformance + choice
            .getAcademicPerformanceChange();

        // Keep every statistic between 0 and 100.
        if (happiness > 100) {
            happiness = 100;
        }
        if (happiness < 0) {
            happiness = 0;
        }

        if (motivation > 100) {
            motivation = 100;
        }
        if (motivation < 0) {
            motivation = 0;
        }

        if (academicPerformance > 100) {
            academicPerformance = 100;
        }
        if (academicPerformance < 0) {
            academicPerformance = 0;
        }
    }


    // ----------------------------------------------------------
    /**
     * Returns the player's current semester week.
     * 
     * @return the week number.
     */
    public int getWeek() {
        return week;
    }


    // ----------------------------------------------------------
    /**
     * Sets the player's current semester week.
     * 
     * @param week
     *            the new week.
     */
    public void setWeek(int week) {
        this.week = week;
    }


    /**
     * Advances the player to the next week of the semester.
     */
    public void advanceWeek() {
        week++;
    }


    // ----------------------------------------------------------
    /**
     * Returns the player's current happiness score.
     * 
     * @return the player's happiness score.
     */
    public int getHappiness() {
        return happiness;
    }


    // ----------------------------------------------------------
    /**
     * Sets the player's happiness score.
     * 
     * @param happiness
     */
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }


    // ----------------------------------------------------------
    /**
     * Returns the player's current motivation score.
     * 
     * @return the player's motivation score.
     */
    public int getMotivation() {
        return motivation;
    }


    // ----------------------------------------------------------
    /**
     * Sets the player's motivation score.
     * 
     * @param motivation
     */
    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }


    // ----------------------------------------------------------
    /**
     * Returns the player's current academic performance score.
     * 
     * @return the player's academic performance score.
     */
    public int getAcademicPerformance() {
        return academicPerformance;
    }


    // ----------------------------------------------------------
    /**
     * Sets the player's academic performance score.
     * 
     * @param academicPerformance
     */
    public void setAcademicPerformance(int academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

}