package Part1;

import java.util.Scanner;

public class Traveller {

	public static void main(String[] args) {
		Scanner scVal = new Scanner(System.in);
		System.out.println("Enter size of denomninator");

		int size = scVal.nextInt();
		System.out.println("Enter the Denomination Value:");
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = scVal.nextInt();
		}

		System.out.println("Enter the amount to pay:");
		int amt = scVal.nextInt();
		// sort Array
		sortArray(arr);

		// after sorting check amount
		CountImplemenation(arr, amt);

		scVal.close();
	}

	private static void sortArray(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j - 1] < arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;

					// System.out.println("value of j : " + arr[j]); // checking value
				}
				// System.out.println("value of i : " + i); // checking value
			}
		}
	} // completion of method sortArray

	private static void CountImplemenation(int arr[], int amt) {
		int[] arrVal = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (amt >= arr[i]) {
				arrVal[i] = amt / arr[i];
				amt = amt % arr[i];
				// System.out.println("final amt vlaue : " + amt);// checking value
			}
		}

		if (amt > 0) {
			System.out.println("Exact amount cannot be given with highest Denomination");
		} else {
			System.out.println("Your payment approach in order to give mininum number of notes will be:");
			for (int i = 0; i < arr.length; i++) {
				if (arrVal[i] != 0) {
					System.out.println(arr[i] + " : " + arrVal[i] +" Note");
				}
			}
		}
	}

}
