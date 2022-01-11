package excersie;

import java.util.Scanner;

public class SumofBiggestAndSmallNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number  : ");
		int first = sc.nextInt();

		System.out.println("Enter Second number  : ");
		int second = sc.nextInt();

		System.out.println("Enter Third number  : ");
		int third = sc.nextInt();

		int output = sum(first, second, third);
		System.out.println("output is ::: " + output);

		sc.close();
	}

	public static int sum(int a, int b, int c) {
		int smallest = 0;
		int large = 0;

		if (a >= b && a >= c) {
			large = a;
		} else if (b >= a && b >= c) {
			large = b;
		} else if (c >= a && c >= b) {
			large = c;
		}

		if (a < b && a < c) {
			smallest = a;
		} else if (b < c) {
			smallest = b;
		} else {
			smallest = c;
		}

		return large + smallest;
	}
}
