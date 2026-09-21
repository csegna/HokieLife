package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


// -------------------------------------------------------------------------
/**
 * Test class for Choice
 *
 * @author Ashwin
 * @version 2026.09.14
 */
public class ChoiceTest {

    private Choice choice;

    // ----------------------------------------------------------
    /**
     * Set up for all test methods. Runs before every test.
     */
    @BeforeEach
    public void setUp() {
        choice = new Choice("Study for the exam", 5, 10, 15);
    }


    // ----------------------------------------------------------
    /**
     * Test method for the constructor and getters. Every getter should
     * return the value it was given.
     */
    @Test
    public void testConstructorAndGetters() {
        assertEquals("Study for the exam", choice.getText());
        assertEquals(5, choice.getHappinessChange());
        assertEquals(10, choice.getMotivationChange());
        assertEquals(15, choice.getAcademicPerformanceChange());
    }


    // ----------------------------------------------------------
    /**
     * Test method for a choice built with negative stat changes, since
     * choices are allowed to lower a statistic as well as raise it.
     */
    @Test
    public void testNegativeChanges() {
        Choice bad = new Choice("Skip class", -10, -20, -30);
        assertEquals("Skip class", bad.getText());
        assertEquals(-10, bad.getHappinessChange());
        assertEquals(-20, bad.getMotivationChange());
        assertEquals(-30, bad.getAcademicPerformanceChange());
    }


    // ----------------------------------------------------------
    /**
     * Test method for a choice where every stat change is exactly zero.
     */
    @Test
    public void testZeroChanges() {
        Choice neutral = new Choice("Do nothing", 0, 0, 0);
        assertEquals("Do nothing", neutral.getText());
        assertEquals(0, neutral.getHappinessChange());
        assertEquals(0, neutral.getMotivationChange());
        assertEquals(0, neutral.getAcademicPerformanceChange());
    }
}
