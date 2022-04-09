package ControlStructures;

import java.util.Scanner;

public class schoolSituation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String studentIsName;
		float note1, note2, average;

		System.out.print("Enter student name:\t");
		studentIsName = scanner.nextLine();

		System.out.printf("\nEnter the first %s note:\t", studentIsName);
		note1 = scanner.nextFloat();

		System.out.printf("\nEnter the second %s note!\t", studentIsName);
		note2 = scanner.nextFloat();

		average = (note1 + note2) / 2;

		if (average >= 6) {
			System.out.printf("Student %s passed with average %.1f\n", studentIsName, average);
		} else {
			System.out.printf("Student %s failed with the average %.1f\n", studentIsName, average);
		}
		scanner.close();
	}

}
