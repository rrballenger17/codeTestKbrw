
public class Rectangle {

	private double height;
	
	private double width;
	
	public Rectangle(double height, double width){
		
		if(height < 0 || width < 0){
			throw new IllegalArgumentException();
		}

		this.height = height;
		this.width = width;

	}

	
	public double getArea() {
		
		return height * width;
		
	}
	
	
	
	public double getPerimeter(){
		
		return height * 2 + width * 2;
		
	}
}
