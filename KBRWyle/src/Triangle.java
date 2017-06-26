

public class Triangle implements Shape {
	
	private double a;
	private double b;
	private double c;
	
	// a, b, c are the lengths of the 3 sides
	public Triangle(double a, double b, double c){
		
		if(a < 0 || b < 0 || c < 0){
			throw new IllegalArgumentException();
		}
		
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// sqrt( p * (p-a) * (p-b) * (p-c) ) 
	// where p is half the perimeter
	public double getArea() {
		
		double halfPerim = (a + b + c)/2;
		double result = halfPerim * (halfPerim - a) * (halfPerim - b) * (halfPerim - c);
		result = Math.sqrt(result);
		
		return result;
		
	}
	
	
	public double getPerimeter(){
		return a + b + c;
	}
	

}
