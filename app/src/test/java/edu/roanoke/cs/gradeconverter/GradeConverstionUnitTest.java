package edu.roanoke.cs.gradeconverter;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class GradeConverstionUnitTest {

    @Test
    public void gradeConversion_SimpleA_ReturnsA() throws Exception {
        MainActivity testActivity = new MainActivity();
        assertEquals("A", testActivity.convertNumberToLetterGrade(100));
    }

    @Test
    public void gradeConversion_BoundaryA_ReturnsA() throws Exception {
        MainActivity testActivity = new MainActivity();
        assertEquals("A", testActivity.convertNumberToLetterGrade(90));
    }
}