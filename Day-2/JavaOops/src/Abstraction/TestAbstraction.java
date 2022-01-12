package Abstraction;

public class TestAbstraction {
	public static void main(String[] args) {
		
		Swift s=new Swift();
		Audi a=new Audi();
		
		ui(s);
		ui(a);
		
	}
	
	public static void ui(Vechicle v) {
		v.mileage();
		v.wheels();
		System.out.println("-----------------");
	}

}

