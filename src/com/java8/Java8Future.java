package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Future {

	public static void main(String[] args) {
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		listOfEmployees.add(new Employee("shiva", 27, 45000.00, "patil"));
		listOfEmployees.add(new Employee("amar", 27, 55000.00, "mahamuni"));
		listOfEmployees.add(new Employee("raghu", 27, 66000.00, "mudhol"));
		listOfEmployees.add(new Employee("praveen", 27, 35000.00, "gavimata"));
		listOfEmployees.add(new Employee("veeresh", 27, 75000.00, "reddy"));

		List<Employee> employees=listOfEmployees.stream()
				.sorted((o1, o2) -> o1.first_name.compareToIgnoreCase(o2.first_name)).collect(Collectors.toList());

		System.out.println(employees);
	}

}
