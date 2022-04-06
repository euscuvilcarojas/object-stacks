import com.assignment02.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/// <summary>
/// Maze.Test - A class for testing the Point class
///
/// Assignment:     #2
/// Course:         ADEV-3001
/// Date Created:   Sept. 18th, 2019
///
/// Revision Log
/// Who         When        Reason
/// ----------- ----------- ---------------
///
/// @author: Scott Wachal
/// @version 1.0
/// </summary>
public class PointTests
{
    private Point pointTest;

    @BeforeEach
    void setup()
    {
        pointTest = new Point(1, 3);
    }

    /**
     * ensure the constructor sets the row value
     */
    @Test
    void construtorSetsRow()
    {
        assertEquals(1, pointTest.getRow());
    }

    /**
     * ensure the constructor sets the column value
     */
    @Test
    void constructorSetsColumn()
    {
        assertEquals(3, pointTest.getColumn());
    }

    /**
     * ensure a string representation of the class is returned
     */
    @Test
    void toStringReturnsFormattedValues()
    {
        assertEquals("[1, 3]", pointTest.toString());
    }

}