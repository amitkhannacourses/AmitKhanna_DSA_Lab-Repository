package Part1;

import java.util.Scanner;

public class PayMoney {

	public static void main(String args[]) {
		Scanner scVal = new Scanner(System.in);
		System.out.println("Enter size of transaction array:");

		int size = scVal.nextInt();
		int[] arrValue = new int[size];
		System.out.println("Enter value of array");

		for (int i = 0; i < size; i++) {
			arrValue[i] = scVal.nextInt();

		}
		System.out.println("Enter total number of Targets that needs to be achived");

		int target = scVal.nextInt();

		while (target-- != 0) {
			boolean achived = false;
			long targetVal = 0;
			System.out.println("Enter the value of Target");
			targetVal = scVal.nextLong();

			long sum = 0;

			for (int i = 0; i < size; i++) {
				sum += arrValue[i];
				if (sum >= targetVal) {
					System.out.println("Target achived after " + (i + 1) + " transactions");
					achived = true;

					break;
				}
			}
			if (achived == false) {
				System.out.println("given target is not achived");
			}
			// target--;

		}

		scVal.close();
	}

}
