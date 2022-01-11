package excersie;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
      
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name  : ");
		String name=sc.next();
		
		String output=method(name);
		System.out.println(" name  : "+output);
        sc.close();
		
	}
	
	public static  String method(String msg) {
		return "Hello "+msg +",welcome to java";
	}
	

}
