package edu.svit.sf04java.polymorphism;

public class MethodOverridingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rbi bankOne = new Sbi();
		System.out.println(bankOne.getRateOfInterest());
		Rbi bankTwo = new Hdfc();
		System.out.println(bankTwo.getRateOfInterest());
	}

}
