package edu.svit.sf04java.adstraction;

public class AbstractionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sOne = new Square(2.5f);
		sOne.calculateArea();
		sOne.display();
		
		Shape sTwo = new Rectangle(12,13);
		sTwo.calculateArea();
		sTwo.display();
		

	}

}
