package d4Demo;

import java.util.Scanner;

/*
 * Write a method named ageInDays that takes in an int value for an age
 * and calculates the amount of days
 * a user has been alive.
 * 
 *
 */
public class CodeChallenge_2 {

	public static void main(String[] args) {
		// call method here
		Scanner sc = new Scanner(System.in);
		System.out.println(ageInDays(51));
		System.out.println("Please enter your age:");
		int userAge = sc.nextInt();
		System.out.println(daysUntil75(userAge) + " days until your 75.");
	}

	public static int ageInDays(int age) {
		int days = age * 365;
		return days;

	}

	public static int daysUntil75(int age) {
		int oldAss = 27375 - (ageInDays(age));
		return oldAss;
	}
}
