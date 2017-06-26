
public class Ellipse {
	
	

	private double a;
	private double b;

	// a is half the length of the widest line
	// through the ellipse. b is half the length 
	// of the line perpendicular to a.
	public Ellipse(double a, double b){
		
		if( a < 0 || b < 0 ){
			throw new IllegalArgumentException();
		}
		
		this.a = a;
		this.b = b;
	}

	
	// pi * a * b
	public double getArea() {
		
		return Math.PI * a * b;
		
	}
	
	
	// Ramanujan approximation
	// pi (3 ( a + b ) - sqrt ( (3a + b) * (a + 3b) )
	public double getPerimeter(){

		return Math.PI * (3 * (a + b) - Math.sqrt( (3* a + b) * (a + 3*b) ) );
		
	}
	

}
