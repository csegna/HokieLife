package game;

// -------------------------------------------------------------------------
/**
 * Represents a choice for an event.
 * 
 * @author Ashwin
 * @version 2026.09.14
 */
public class Choice {

    private String text;
    private int happinessChange;
    private int motivationChange;
    private int academicPerformanceChange;

    // ----------------------------------------------------------
    /**
     * Creates a choice and stores the changes it makes to each statistic.
     *
     * @param text
     *            the description of the choice
     * @param happinessChange
     *            change applied to happiness
     * @param motivationChange
     *            change applied to motivation
     * @param academicPerformanceChange
     *            change applied to academic performance
     */
    public Choice(
        String text,
        int happinessChange,
        int motivationChange,
        int academicPerformanceChange) {
        this.text = text;
        this.happinessChange = happinessChange;
        this.motivationChange = motivationChange;
        this.academicPerformanceChange = academicPerformanceChange;
    }


    // ----------------------------------------------------------
    /**
     * Returns the text for the choice.
     * 
     * @return the text for the choice.
     */
    public String getText() {
        return text;
    }


    /**
     * Returns the change the choice makes to the happiness stat.
     * 
     * @return the change the choice makes to happiness.
     */
    public int getHappinessChange() {
        return happinessChange;
    }


    // ----------------------------------------------------------
    /**
     * Returns the change the choice makes to the motivation stat.
     * 
     * @return the change the choice makes to motivation.
     */
    public int getMotivationChange() {
        return motivationChange;
    }


    // ----------------------------------------------------------
    /**
     * Returns the change the choice makes to the academic performance stat.
     * 
     * @return the change the choice makes to academic performance.
     */
    public int getAcademicPerformanceChange() {
        return academicPerformanceChange;
    }
}
