package excersie;

import java.util.Scanner;

public class Assignment2{

	public static String number(int a, int b, int c) {
		StringBuilder number = new StringBuilder();
		String currentValue = new String();
		int temp = 0;
		int temp1 =0;
		if(a == 0) {
			number.append(Assignment2.getNumber(0));
		}else {
			while(a != 0) {
				temp1 =(a%10);
				temp = temp1/10;
				currentValue = Assignment2.getNumber(temp1 == 0 ? a:temp1) + currentValue;
				a = temp;
			}
			number.append(currentValue);
			currentValue = new String();
		}
		if(b == 0) {
			number.append(Assignment2.getNumber(0));
		}else {
			while(b != 0) {
				temp1 = (b%10);
				temp = temp1/10;
				currentValue = Assignment2.getNumber(temp1 == 0 ? b:temp1) + currentValue;
				b=temp;
			}
			number.append(currentValue);
			currentValue = new String();
		}
		if(c == 0) {
			number.append(Assignment2.getNumber(0));
		}else {
			while(c != 0) {
				temp1 = (c%10);
				temp = temp1/10;
				currentValue = Assignment2.getNumber(temp1 == 0 ? c:temp1) + currentValue;
				c=temp;
			}
		}
		number.append(currentValue);
		return number.toString();
	}
	public static String getNumber(int a) {
		switch (a) {
		case 0: return "Zero ";
		case 1: return "One ";
		case 2: return "Two ";
		case 3: return "Three ";
		case 4: return "Four ";
		case 5: return "Five ";
		case 6: return "Six ";
		case 7: return "Seven ";
		case 8: return "Eight ";
		case 9: return "Nine ";
		case 10: return "One Zero ";
		}
		return "";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number  : ");
		int first=sc.nextInt();
		
		System.out.println("Enter Second number  : ");
		int second=sc.nextInt();
		

		System.out.println("Enter Third number  : ");
		int third=sc.nextInt();
		
		String output=number(first, second, third);
		System.out.println("output :"+output );
		
		sc.close();


	}

}