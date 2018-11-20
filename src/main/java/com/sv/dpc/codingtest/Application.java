package com.sv.dpc.codingtest;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			log("Enter value for 'n' - number of children: ");
			int n = scanner.nextInt();

			log("Enter value for 'k' - number to count: ");
			int k = scanner.nextInt();

			log("\n-------------------- Results ------------------\n");
			Result result = ApplicationUtil.findWinner(n, k);
			log("Removal Sequence: " + Arrays.toString(result.getRemovedSequence().toArray()));
			log("\nWinning Child ID: " + result.getWinningId());
			log("\n-----------------------------------------------\n");
		} catch (InputMismatchException ime) {
			System.err.println("Invalid input. Please enter a valid positive number greater than 2.");
		}
	}

	private static void log(String msg) {
		System.out.println(msg);
	}
}
