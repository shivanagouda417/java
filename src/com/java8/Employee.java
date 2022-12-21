package com.java8;

public class Employee {

	String first_name;
	int age;
	double salary;
	String last_name;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Employee [first_name=" + first_name + ", age=" + age + ", salary=" + salary + ", last_name=" + last_name
				+ "]";
	}



	public Employee(String first_name, int age, double salary, String last_name) {
		super();
		this.first_name = first_name;
		this.age = age;
		this.salary = salary;
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

}
