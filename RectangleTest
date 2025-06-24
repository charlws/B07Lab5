import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class lab5Tests {
	@Test
	void testAreaCalculation()
	{
		double x = 5.55;
		double y = 6;
		Point a = new Point(5,5);
		Rectangle z = new Rectangle(x, y, a);
		assertEquals(z.area(), 33.3);
	}
	
	@Test
	void testPerimeterCalculation()
	{
		Point a = new Point(5,5);
		Rectangle z = new Rectangle(3.4, 5, a);
		assertEquals(z.perimeter(), 16.8);
	}
	
	@Test
	void testFalseSquare()
	{
		Point a = new Point(5,5);
		Rectangle z = new Rectangle(3.4, 5, a);
		assertFalse(z.isSquare());
	}
	
	@Test
	void testTrueSquare()
	{
		Point a = new Point(5,5);
		Rectangle z = new Rectangle(4.71343614, 4.71343614, a);
		assertTrue(z.isSquare());
	}

}
