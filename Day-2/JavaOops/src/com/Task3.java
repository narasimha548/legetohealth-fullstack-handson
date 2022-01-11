package com;

public class Task3 {
	public static void main(String[] args) {

		Student s = new Student();
		s.setStudentID(120);
		s.setName("alex");
		s.setMarks1(70);
		s.setMarks2(90);
		s.setMarks3(75);
		s.setCity("HYderabad");
		s.setFeePerMonth(200f);
		s.setEligibleForScholarship(true);

		Student s1 = new Student();
		s1.setStudentID(130);
		s1.setName("hari");
		s1.setMarks1(70);
		s1.setMarks2(60);
		s1.setMarks3(55);
		s1.setCity("Hyderabad");
		s1.setFeePerMonth(5f);
		s1.setEligibleForScholarship(false);

		Student s2 = new Student();
		s2.setStudentID(120);
		s2.setName("suri");
		s2.setMarks1(70);
		s2.setMarks2(80);
		s2.setMarks3(85);
		s2.setCity("HYderabad");
		s2.setFeePerMonth(10f);
		s2.setEligibleForScholarship(true);

		String name = highestMarks(s, s1, s2);
		System.out.println(" highest marks of the student === " + name);
		Student out = leastMonthFee(s, s1, s2);
		System.out.println("Name = " + out.getName() + "  and least fee  the student === " + out.getFeePerMonth());

		Student eligableStudent = checkEligibility(s, s1, s2);

		System.out.println("Name = " + eligableStudent.getName() + "  total marks " + eligableStudent.getFeePerMonth()
				+ "  avg marks= " + eligableStudent.getAverage() + "   result " + eligableStudent.getResult()
				+ " scholorship ==" + eligableStudent.isEligibleForScholarship());
	}

	public static String highestMarks(Student s1, Student s2, Student s3) {

		if (s1.getTotalmarks() > s2.getTotalmarks()) {
			return s1.getName();
		} else if (s2.getTotalmarks() > s3.getTotalmarks()) {
			return s2.getName();
		} else if (s3.getTotalmarks() > s1.getTotalmarks()) {
			return s3.getName();
		} else {
			return "";
		}

	}

	public static Student leastMonthFee(Student s1, Student s2, Student s3) {

		if (s1.getAnualFee() / 12 < s2.getAnualFee() / 12) {
			return s1;
		} else if (s2.getAnualFee() / 12 < s3.getAnualFee() / 12) {
			return s2;
		} else if (s3.getAnualFee() / 12 > s1.getAnualFee() / 12) {
			return s3;
		} else {
			return null;
		}

	}

	public static Student checkEligibility(Student s1, Student s2, Student s3) {

		if (s1.isEligibleForScholarship() == true) {
			return s1;
		} else if (s2.isEligibleForScholarship() == true) {
			return s2;
		} else if (s3.isEligibleForScholarship() == true) {
			return s3;
		} else {
			return null;
		}

	}

}
