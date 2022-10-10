package com.lab.algorithm.problem2;

import java.util.Scanner;

public class Traveler {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();

		int inPutDenominators[] = new int[size];
		int noOfNotes[] = new int[size];

		System.out.println("Enter the currency denominations value");

		for (int i = 0; i < inPutDenominators.length; i++) {
			inPutDenominators[i] = sc.nextInt();
		}

		System.out.println("Enter the amount you want to pay");
		int targetAmount = sc.nextInt();

		int temporary = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < size; j++) {
				if (inPutDenominators[j - 1] > inPutDenominators[j]) {
					temporary = inPutDenominators[j - 1];
					inPutDenominators[j - 1] = inPutDenominators[j];
					inPutDenominators[j] = temporary;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			noOfNotes[i] = 0;
		}

		for (int i = (size - 1); i >= 0; i--) {
			while (inPutDenominators[i] <= targetAmount) {
				noOfNotes[i]++;
				targetAmount = targetAmount - inPutDenominators[i];
			}
		}

		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int i = (size - 1); i >= 0; i--) {
			if (noOfNotes[i] != 0) {
				System.out.println(inPutDenominators[i] + " : " + noOfNotes[i]);
			}
		}
	}
}