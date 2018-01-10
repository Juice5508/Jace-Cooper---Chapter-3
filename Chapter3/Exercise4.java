package Chapter3;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.println("Type a number: ");
        int guess = in.nextInt();
        System.out.println("Your guess is: " + guess);
        System.out.println("The number I was thinking of is: " + number);
        
        if (guess > number){
            int difference = guess - number;
            System.out.println("You were off by: " + difference);
           }
        else{
            int difference = number - guess;
            System.out.println("You were off by: " + difference);
        }
        	
        }

	}


