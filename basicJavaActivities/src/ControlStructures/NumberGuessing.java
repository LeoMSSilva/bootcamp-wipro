package ControlStructures;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int drawnNumber = random.nextInt(11);
		int typedNumber = -1;
		int attempts = 1;

		System.out.println("Enter a number to guess\n");

		while (true) {
			typedNumber = scanner.nextInt();
			if (typedNumber == drawnNumber) {
				break;
			} else if (typedNumber > drawnNumber) {
				System.err.print("The number entered is greater than the number drawn!\n");
			} else {
				System.err.print("The number entered is smaller than the number drawn!\n");
			}
			attempts++;
		}

		scanner.close();
		System.out.printf("You got it right in %d attempts!\n", attempts);
	}
}
