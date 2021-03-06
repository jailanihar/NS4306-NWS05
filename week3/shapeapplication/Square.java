package week3.shapeapplication;

public class Square extends Shape {

	int side;
	
	public Square(String colour, int side) {
		super(colour);
		this.side = side;
	}
	
	public int getArea() {
		return side * side;
	}
	
	public int getPerimeter() {
		return 4 * side;
	}
	
}
