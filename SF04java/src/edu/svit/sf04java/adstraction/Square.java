package edu.svit.sf04java.adstraction;

public class Square extends Shape{
	float side;

	public Square(float side) {
		super();
		this.side = side;
	}
	
	public  float calculateArea() {
		return area=side*side;
	}
	
}
