
public class Square {
	

	
	private double dimension;
	
	// dimension is the length of 
	// one side of the square.
	public Square(double dimension){
		
		if(dimension < 0){
			throw new IllegalArgumentException();
		}

		this.dimension = dimension;

	}

	
	public double getArea() {
		
		return dimension * dimension;
		
	}
	
	
	
	public double getPerimeter(){
		
		return 4 * dimension;
		
	}

}
