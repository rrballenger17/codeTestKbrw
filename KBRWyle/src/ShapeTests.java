import static org.junit.Assert.*;

import org.junit.Test;


// 10 tests including 2 tests for each
// shape : triangle, circle, rectangle, 
// ellipse, and square
public class ShapeTests {

	
	private double roundToHundredths(double value){
		return Math.round(value * 100) / 100.0;
	}
	
	
	@Test
	public void triangleTest() {
		
		Triangle t = new Triangle(18.9, 34.2, 24);
				
		double area = roundToHundredths(t.getArea());
		
		assertTrue( area == 218.96);
		
		assertTrue( t.getPerimeter() == 18.9 + 34.2 + 24);
	}

	
	
	@Test
	public void triangleTestTwo() {
		
		
		Triangle t = new Triangle(28.7, 32.4, 9.5);
		
		double area = roundToHundredths(t.getArea());

		assertTrue(area == 132.03);
		
		assertTrue( t.getPerimeter() == 28.7 + 32.4 + 9.5);

		
	}
	

	
	@Test
	public void circleTest() {
		
		Circle circ = new Circle(11.7);
		
		double area = roundToHundredths(circ.getArea());
		
		System.out.println(area);
				
		assertTrue(area == 430.05);
		
		double perim = roundToHundredths(circ.getPerimeter());
		
		System.out.println(perim);

		
		assertTrue(perim == 73.51);
		
		
	}
	
	@Test
	public void circleTestTwo() {
		
		Circle circ = new Circle(53.2);
		
		double area = roundToHundredths(circ.getArea());
		
		System.out.println(area);
				
		assertTrue(area == 8891.46);
		
		double perim = roundToHundredths(circ.getPerimeter());
		
		System.out.println(perim);

		
		assertTrue(perim == 334.27);
		
	}

	
	@Test
	public void rectangleTest() {
		
		Rectangle rect = new Rectangle(23, 14);
		

		assertTrue(rect.getArea() == 322);
		
		assertTrue(rect.getPerimeter() == 74);
		
		
	}
	
	
	@Test
	public void rectangleTestTwo() {
		
		Rectangle rect = new Rectangle( 7, 23.2);
		

		assertTrue(rect.getArea() == 162.4);
		
		assertTrue(rect.getPerimeter() == 60.4);
		
		
	}
	
	
	@Test
	public void ellipseTest() {
		
		Ellipse elip = new Ellipse(2.3, 6.5);
		
		double area = roundToHundredths(elip.getArea());

		assertTrue(area ==  46.97 );
		
		double perim = roundToHundredths(elip.getPerimeter());
		
		assertTrue(perim == 29.24);
		//assertTrue(rect.getPerimeter() == 60.4);
		
	}


	@Test
	public void ellipseTestTwo() {
		
		Ellipse elip = new Ellipse(11.2, 31.3);
		
		double area = roundToHundredths(elip.getArea());

		assertTrue(area ==  1101.32 );
		
		double perim = roundToHundredths(elip.getPerimeter());
		
		assertTrue(perim == 141.09);
		//assertTrue(rect.getPerimeter() == 60.4);
		
	}
	
	
	@Test
	public void squareTest() {
		
		Square sq = new Square(3);
				
		assertTrue(3 * 3 ==  sq.getArea());
		
		assertTrue(sq.getPerimeter() == 3 * 4);
		
	}

	
	@Test
	public void squareTestTwo() {
		
		Square sq = new Square(5);
				
		assertTrue(5 * 5 ==  sq.getArea());
		
		assertTrue(sq.getPerimeter() == 5 * 4);
		
	}

}
