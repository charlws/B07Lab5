package lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    public void testCircleArea() {
        Circle c1 = new Circle(new Point(0,0), 3);
        double expected = Math.PI * 3 * 3;
        double actual = c1.area();

        assertEquals(expected, actual);
    }

    @Test
    public void testCircleCircumference() {
        Circle c1 = new Circle(new Point(0,0), 3);
        double expected = Math.PI * 3 * 2;
        double actual = c1.circumference();
        assertEquals(expected, actual);
    }

    @Test
    public void testPointOnCircle() {
        Circle c1 = new Circle(new Point(0,0), 3);
        assertTrue(c1.pointOnCircle(new Point(0,3)));
    }
}
