package Chapter3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		int total;
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter total seconds: ");
		total = scr.nextInt();
		int hours = total / 60 / 60;
		int minutes = total / 60 % 60;
		int  seconds = total % 60;
		System.out.print(total + " seconds " + "= " + hours + " hours, " + minutes + " minutes, " + "and " + seconds + " seconds");

	}

}
