
public class Circle implements Shape {
	

	private double radius;

	
	public Circle(double radius){
		
		if(radius < 0){
			throw new IllegalArgumentException();
		}
		
		this.radius = radius;
	}

	// pi * r ^ 2
	public double getArea() {
		
		return Math.PI * radius * radius;
		
	}
	
	
	// 2 * pi * r
	public double getPerimeter(){
		
		return 2 * Math.PI * radius;
		
	}
	

}



