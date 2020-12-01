package Homework_Exceptions;

import java.math.*;


public class Division {

	public static void main(String[] args) {
		Division object = new Division();
		double result = 0;
		
		try {
			result = object.div (50.5,0);
		} catch (NumberFormatException numformexp) {
			System.out.println ("Number Format is wrong");
		}catch (Exception e){
		 e.printStackTrace();
		System.out.println ("Exception");
		}
		System.out.println(result);
		}

	public double div ( double a, double b) throws ArithmeticException {
		if (b ==0) {
			throw new ArithmeticException ("Arithmetic Exception ");
		}
		return a/b;
		
	}
}



