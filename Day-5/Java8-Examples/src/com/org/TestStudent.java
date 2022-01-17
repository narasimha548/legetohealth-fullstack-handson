package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.org.bean.Student;

public class TestStudent {
	public static void main(String[] args) {

		Student s1 = new Student(101, "alex", "Hyd");
		Student s2 = new Student(102, "Urb", "sec");
		Student s3 = new Student(103, "charles", "Bang");

		List<Student> lst = new ArrayList<Student>();
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);

		Collections.sort(lst, (u1, u2) -> u1.getName().compareTo(u2.getName()));
		print(lst);
		
		Collections.sort(lst, (u1, u2) -> u2.getId() - u1.getId());
		print(lst);

	}

	public static void print(List<Student> lst) {
		for (Student std : lst) {
			System.out.println("std ----> " + std);
		}
	}

}
