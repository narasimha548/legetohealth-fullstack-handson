package basic;

public class TestOperators {
	public static void main(String[] args) {
		
		int x = 30;
		int y = x++;
		System.out.println("x = "+x+", y = "+y); // x = 21, y = 20
		int a = 70;
		int b = ++a;
		System.out.println("a = "+a+", b = "+b); // a = 31, b = 31
		boolean status = a > x;
		System.out.println("status = "+status);
		status = (a == x); // comparison of a & x to be equal
		System.out.println("status = "+status);
		status = (a != x);
		System.out.println("status = "+status);
	}

}
