package com.inheritance;

public class Test3 {
	public static void main(String[] args) {

		Person p = new Person("narasimha", "male");
		Employee e1=new Employee(642824, "stark", "Male", 25000);
		Student s=new Student("67427", "stark", "male", "A+");
		Customer c=new Customer("Narasimha", "male", 01234, "3204134310", 7890.09f);
		
		print(p, e1, c, s);
		
	}

	public static void print(Person p,Employee e,Customer c, Student s) {
     p.display();
     
     System.out.println("-------------");
     e.display();
     System.out.println("-------------");
     c.display();
     System.out.println("-------------");
     s.display();
     
	}

	

}
