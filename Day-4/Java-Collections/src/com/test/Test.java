package com.test;

import java.util.Scanner;

import com.bean.Employee;
import com.employee.IEmployeeStorage;
import com.employeefactory.EmployeeStorageFacotry;
import com.util.EmployeeNotFoundException;

public class Test {

	public static void main(String[] args) {

		IEmployeeStorage employeeStorage = EmployeeStorageFacotry.getInstance();

		Scanner sc = new Scanner(System.in);
		System.out.println("\n 1. Store \n 2.find by id  \n 3.findl all \n 4. delete by id \n 5. exit  \n ");

		System.out.println("Enter the Option ");
		int op = sc.nextInt();

		if (op == 1) {

			System.out.println("Enter id: ");
			int id = sc.nextInt();

			System.out.println("Enter name :: ");
			String name = sc.next();

			System.out.println("Enter salary:: ");
			double sal = sc.nextDouble();

			int saveId = employeeStorage.save(new Employee(id, name, sal));
			System.out.println("Employee Saved Sucessfully with id :::" + saveId);

		}

		System.out.println(" \n 1. Store \n 2.find by id  \n 3.findl all \n 4. delete by id \n 5. exit  \n ");
		System.out.println("Enter the Option ");
		int op1 = sc.nextInt();
		if (op1 == 2) {
			System.out.println("Enter the Id to be find employee details::: ");
			int findId = sc.nextInt();

			try {
				Employee employee = employeeStorage.findEmployee(findId);
				System.out.println("Employee data:  " + employee);
			} catch (EmployeeNotFoundException e) {
				e.printStackTrace();
			}
		}

		System.out.println("1. Store \n 2.find by id  \n 3.findl all \n 4. delete by id \n 5. exit  \n ");
		System.out.println("Enter the Option ");
		int op2 = sc.nextInt();

		if (op2 == 3) {
			Employee[] findEmployees = employeeStorage.findEmployees();
			for (Employee e : findEmployees) {
				System.out.println(" employess ::: " + e);
			}
		}

		System.out.println(" \n 1. Store \n 2.find by id  \n 3.findl all \n 4. delete by id \n 5. exit  \n ");
		System.out.println("Enter the Option ");
		int op3 = sc.nextInt();

		if (op3 == 4) {

			System.out.println("Enter the Id to be  employee details::: ");
			int deleteById = sc.nextInt();

			try {
				employeeStorage.delete(deleteById);
				System.out.println("EMployee deleted sucess fully:: ");
			} catch (EmployeeNotFoundException e) {
				e.printStackTrace();
			}
		}

		System.out.println("\n 1. Store \n 2.find by id  \n 3.findl all \n 4. delete by id \n 5. exit  \n ");
		System.out.println("Enter the Option ");
		int op4 = sc.nextInt();
		if (op4 == 5)
			System.exit(0);

		sc.close();
	}

}
