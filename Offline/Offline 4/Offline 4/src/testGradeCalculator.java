import org.junit.Test;

import static java.lang.Double.NaN;
import static org.junit.Assert.*;

public class testGradeCalculator {
    GradeCalculator test = new GradeCalculator();

        //mark to test each grade
    @Test
    public void testGradeA3cred()
    {
        assertEquals("A", test.grade(270, 3));
        assertEquals("A", test.grade(399.98, 4));
        assertEquals("A", test.grade(319.9, 4));
    }
    @Test
    public void testGradeA4cred()
    {
        assertEquals("A", test.grade(360, 4));
        assertEquals("A", test.grade(299.98, 3));
        assertEquals("A", test.grade(239.9, 3));
    }
    @Test
    public void testGradeB3cred()
    {
        assertEquals("B", test.grade(220, 3));
        assertEquals("B", test.grade(319, 4));
        assertEquals("B", test.grade(279.6, 4));
    }
    @Test
    public void testGradeB4cred()
    {
        assertEquals("B", test.grade(300, 4));
        assertEquals("B", test.grade(239, 3));
        assertEquals("B", test.grade(209.7, 3));
    }
    @Test
    public void testGradeC3cred()
    {
        assertEquals("C", test.grade(200, 3));
        assertEquals("C", test.grade(278.1, 4));
        assertEquals("C", test.grade(239.6, 4));
    }
    @Test
    public void testGradeC4cred()
    {
        assertEquals("C", test.grade(260, 4));
        assertEquals("C", test.grade(208.1, 3));
        assertEquals("C", test.grade(179.6, 3));
    }
    @Test
    public void testGradeF3cred()
    {
        assertEquals("F", test.grade(170, 3));
        assertEquals("F", test.grade(178.3, 3));

    }
    @Test
    public void testGradeF4cred()
    {
        assertEquals("F", test.grade(200, 4));
        assertEquals("F", test.grade(239, 4));
    }

        //invalid numbers that exceed lower and upper bounds
        @Test
    public void testGradeUpperBound3cred()
    {
        assertEquals("Exceeded upper bound", test.grade(310, 3));
        assertEquals("Exceeded upper bound", test.grade(300.05, 3));
    }
    @Test
    public void testGradeUpperBound4cred()
    {
        assertEquals("Exceeded upper bound", test.grade(410, 4));
        assertEquals("Exceeded upper bound", test.grade(400.05, 4));
    }
    @Test
    public void testGradeLowerBound3cred()
    {
        assertEquals("Invalid Number", test.grade(-0.05, 3));
    }
    @Test
    public void testGradeLowerBound4cred()
    {
        assertEquals("Invalid Number", test.grade(-9, 4));
    }
    //invalid number input
    @Test
    public void testGradeInvalidNumber()
    {
        assertEquals("Not a number", test.grade(NaN, 3));
        assertEquals("Not a number", test.grade(NaN, 4));
    }
    //wrong credit
    @Test
    public void testGradeInvalidCredit()
    {
        assertEquals("Invalid credit", test.grade(100, 5));
    }
}