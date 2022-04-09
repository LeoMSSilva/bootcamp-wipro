package ControlStructures;

import java.util.Scanner;

public class ClassroomLeaderElection {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] candidates = new String[4];
		int[] votesForCandidates = new int[4];
		int numberOfStudents, winner = -1;

		System.out.print("Enter the number of students in the classroom:\t");
		numberOfStudents = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < candidates.length; i++) {
			System.out.printf("\nEnter candidate name %d:\t", i + 1);
			candidates[i] = scanner.nextLine();
		}

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.printf("\nWhich candidate do you vote for?\n1 - %s%n2 - %s%n3 - %s%n4 - %s%n", candidates[0],
					candidates[1], candidates[2], candidates[3]);
			switch (scanner.nextInt()) {
			case 1:
				votesForCandidates[0]++;
				break;
			case 2:
				votesForCandidates[1]++;
				break;
			case 3:
				votesForCandidates[2]++;
				break;
			case 4:
				votesForCandidates[3]++;
				break;
			default:
				System.err.println("Invalid number.");
				i--;
				break;
			}
		}

		scanner.close();

		if (votesForCandidates[0] > votesForCandidates[1] && votesForCandidates[0] > votesForCandidates[2]
				&& votesForCandidates[0] > votesForCandidates[3]) {
			winner = 0;
		} else if (votesForCandidates[1] > votesForCandidates[0] && votesForCandidates[1] > votesForCandidates[2]
				&& votesForCandidates[1] > votesForCandidates[3]) {
			winner = 1;
		} else if (votesForCandidates[2] > votesForCandidates[0] && votesForCandidates[2] > votesForCandidates[1]
				&& votesForCandidates[2] > votesForCandidates[3]) {
			winner = 2;
		} else if (votesForCandidates[3] > votesForCandidates[0] && votesForCandidates[3] > votesForCandidates[1]
				&& votesForCandidates[3] > votesForCandidates[2]) {
			winner = 3;
		} else {
			System.out.println("Tied!");
		}

		if (winner >= 0) {
			System.out.printf("Candidate %s won this election.\n", candidates[winner]);
		}
	}
}
