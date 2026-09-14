package game;

public class Choice {

    private String text;
    private int happinessChange;
    private int motivationChange;
    private int academicPerformanceChange;

    /**
     * Creates a choice and stores the changes it makes to each statistic.
     *
     * @param text                       the description of the choice
     * @param happinessChange            change applied to happiness
     * @param motivationChange           change applied to motivation
     * @param academicPerformanceChange  change applied to academic performance
     */
    public Choice(String text, int happinessChange, int motivationChange, int academicPerformanceChange) {
        this.text = text;
        this.happinessChange = happinessChange;
        this.motivationChange = motivationChange;
        this.academicPerformanceChange = academicPerformanceChange;
    }

    /**
     * Returns the text for the choice.
     */
    public String getText() {
        return text;
    }

    /**
     * Returns the change the choice makes to the happiness stat.
     */
    public int getHappinessChange() {
        return happinessChange;
    }

    /**
     * Returns the change the choice makes to the motivation stat.
     */
    public int getMotivationChange() {
        return motivationChange;
    }

    /**
     * Returns the change the choice makes to the academic performance stat.
     */
    public int getAcademicPerformanceChange() {
        return academicPerformanceChange;
    }
}