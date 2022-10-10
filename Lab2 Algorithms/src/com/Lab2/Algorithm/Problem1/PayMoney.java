package com.Lab2.Algorithm.Problem1;

import java.util.Scanner;

public class PayMoney {
	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();

		int inPutValues[] = new int[size];
		System.out.println("Enter the values of array");

		for (int i = 0; i < size; i++)
			inPutValues[i] = sc.nextInt();

		System.out.println("Enter the total no of targets that needs to be achieved");
		int totalTargets = sc.nextInt();

		while (totalTargets-- != 0) {
			int flag = 0;
			int targetValue;

			System.out.println("Enter the value of target");
			targetValue = sc.nextInt();

			int sum = 0;
			for (int i = 0; i < size; i++) {
				sum += inPutValues[i];
				if (sum >= targetValue) {
					System.out.println("Target achieved after " + (i + 1) + " transactions ");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(" Given target is not achieved ");
			}
			System.out.println();
		}
	}
}
