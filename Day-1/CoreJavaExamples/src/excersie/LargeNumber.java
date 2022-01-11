package excersie;

import java.util.Scanner;

public class LargeNumber {

	public static int findLargeNumber(int a, int b, int c) {

		if (a >= b && a >= c) {
			return a;
		} else if (b >= a && b >= c)
			return b;
		else
			return c;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number  : ");
		int first=sc.nextInt();
		
		System.out.println("Enter Second number  : ");
		int second=sc.nextInt();
		

		System.out.println("Enter Third number  : ");
		int third=sc.nextInt();
		
		int largeNumber=findLargeNumber(first, second, third);
		System.out.println("Large number is :"+largeNumber );
		
		sc.close();

	}
}
