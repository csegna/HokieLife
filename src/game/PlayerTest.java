package game;

/**
 * Test class for Player
 *
 * @author Ashwin
 * @version 2026.09.14
 */
public class PlayerTest extends student.TestCase {
    private Player player;

    /**
     * Set up for all test methods. Runs before every test.
     */
    public void setUp() {
        player = new Player();
    }


    /**
     * Test method for the constructor. A new player should start on
     * week 1 with all stats at 100.
     */
    public void testConstructor() {
        assertEquals(1, player.getWeek());
        assertEquals(100, player.getHappiness());
        assertEquals(100, player.getMotivation());
        assertEquals(100, player.getAcademicPerformance());
    }


    /**
     * Test method for applyChoice when the resulting stats stay inside
     * the 0-100 range and no clamping should occur.
     */
    public void testApplyChoiceWithinRange() {
        player.setHappiness(50);
        player.setMotivation(50);
        player.setAcademicPerformance(50);

        Choice choice = new Choice("Take a short break", -5, -10, -15);
        player.applyChoice(choice);

        assertEquals(45, player.getHappiness());
        assertEquals(40, player.getMotivation());
        assertEquals(35, player.getAcademicPerformance());
    }


    /**
     * Test method for applyChoice when happiness would go above 100.
     * It should be clamped at 100.
     */
    public void testApplyChoiceHappinessClampedAtMax() {
        Choice choice = new Choice("Great news", 50, -5, -5);
        player.applyChoice(choice);

        assertEquals(100, player.getHappiness());
        assertEquals(95, player.getMotivation());
        assertEquals(95, player.getAcademicPerformance());
    }


    /**
     * Test method for applyChoice when motivation would go above 100.
     * It should be clamped at 100.
     */
    public void testApplyChoiceMotivationClampedAtMax() {
        Choice choice = new Choice("Pep talk", -5, 50, -5);
        player.applyChoice(choice);

        assertEquals(95, player.getHappiness());
        assertEquals(100, player.getMotivation());
        assertEquals(95, player.getAcademicPerformance());
    }


    /**
     * Test method for applyChoice when academic performance would go
     * above 100. It should be clamped at 100.
     */
    public void testApplyChoiceAcademicPerformanceClampedAtMax() {
        Choice choice = new Choice("Aced the test", -5, -5, 50);
        player.applyChoice(choice);

        assertEquals(95, player.getHappiness());
        assertEquals(95, player.getMotivation());
        assertEquals(100, player.getAcademicPerformance());
    }


    /**
     * Test method for applyChoice when happiness would go below 0.
     * It should be clamped at 0.
     */
    public void testApplyChoiceHappinessClampedAtMin() {
        Choice choice = new Choice("Terrible week", -150, -5, -5);
        player.applyChoice(choice);

        assertEquals(0, player.getHappiness());
        assertEquals(95, player.getMotivation());
        assertEquals(95, player.getAcademicPerformance());
    }


    /**
     * Test method for applyChoice when motivation would go below 0.
     * It should be clamped at 0.
     */
    public void testApplyChoiceMotivationClampedAtMin() {
        Choice choice = new Choice("Rough week", -5, -150, -5);
        player.applyChoice(choice);

        assertEquals(95, player.getHappiness());
        assertEquals(0, player.getMotivation());
        assertEquals(95, player.getAcademicPerformance());
    }


    /**
     * Test method for applyChoice when academic performance would go
     * below 0. It should be clamped at 0.
     */
    public void testApplyChoiceAcademicPerformanceClampedAtMin() {
        Choice choice = new Choice("Failed the test", -5, -5, -150);
        player.applyChoice(choice);

        assertEquals(95, player.getHappiness());
        assertEquals(95, player.getMotivation());
        assertEquals(0, player.getAcademicPerformance());
    }


    /**
     * Test method for getWeek and setWeek.
     */
    public void testGetAndSetWeek() {
        player.setWeek(7);
        assertEquals(7, player.getWeek());
    }


    /**
     * Test method for advanceWeek. Week should increase by exactly one.
     */
    public void testAdvanceWeek() {
        player.setWeek(4);
        player.advanceWeek();
        assertEquals(5, player.getWeek());
    }


    /**
     * Test method for getHappiness and setHappiness.
     */
    public void testGetAndSetHappiness() {
        player.setHappiness(42);
        assertEquals(42, player.getHappiness());
    }


    /**
     * Test method for getMotivation and setMotivation.
     */
    public void testGetAndSetMotivation() {
        player.setMotivation(37);
        assertEquals(37, player.getMotivation());
    }


    /**
     * Test method for getAcademicPerformance and setAcademicPerformance.
     */
    public void testGetAndSetAcademicPerformance() {
        player.setAcademicPerformance(63);
        assertEquals(63, player.getAcademicPerformance());
    }
}
