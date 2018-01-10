package Chapter3;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		double celsius;
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter Celsius: ");
		celsius = scr.nextDouble();
		double result = celsius * 1.8 + 32;
		System.out.println(celsius + " C" + " = " + result + " F" );
	}

}
