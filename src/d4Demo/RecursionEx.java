package d4Demo;

import java.util.Scanner;

public class RecursionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to start the timer: ");
		int userNum = sc.nextInt();
		countDown(userNum);

		sc.close();
	}

	public static void countDown(int counter) {
		if (counter == 0) { // recursive methods always need a stop condition
			System.out.println("Go!");
		} else {
			System.out.println(counter);
			countDown(counter--); // this is a recursion: A method calls itself and breaks it down into smaller
									// pieces
			// All recursions must have a stop condition
		}

		// return; the return in a void method is optional
	}

}
