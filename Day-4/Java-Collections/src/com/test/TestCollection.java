package com.test;

import java.util.Scanner;

import com.bean.Employee;
import com.employee.IEmployeeStorage;
import com.employeefactory.EmployeeStorageFacotry;
import com.util.EmployeeNotFoundException;

public class TestCollection {

	public static void main(String[] args) {

		IEmployeeStorage employeeStorage = EmployeeStorageFacotry.getInstance();

		Scanner sc = new Scanner(System.in);
		System.out.println("\n 1. Store \n 2.find by id  \n 3.findl all \n 4. delete by id \n 5. exit  \n ");
		System.out.println("Enter the Option \n ");

		int op = sc.nextInt();

		switch (op) {
		case 1:
			if (op == 1) {

				System.out.println("Enter id: ");
				int id = sc.nextInt();

				System.out.println("Enter name :: ");
				String name = sc.next();

				System.out.println("Enter salary:: ");
				double sal = sc.nextDouble();

				int saveId = employeeStorage.save(new Employee(id, name, sal));
				System.out.println("Employee Saved Sucessfully with id ::: \n " + saveId);

				System.out.println("\n 1. Store \n 2.find by id  \n 3.findl all \n 4. delete by id \n 5. exit  \n ");

			}

			System.out.println("\n 1. Store \n 2.find by id  \n 3.findl all \n 4. delete by id \n 5. exit  \n ");

			break;
		case 2:
			

		default:
			break;
		}

		sc.close();

	}
}
