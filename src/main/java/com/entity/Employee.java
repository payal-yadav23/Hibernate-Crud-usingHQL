package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_details")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	private String empName;
	private String empDept;
	private String gender;
	private double salary;

	public Employee() {

	}

	public Employee(int emp_id, String empName, String empDept, String gender, double salary) {
		super();
		this.emp_id = emp_id;
		this.empName = empName;
		this.empDept = empDept;
		this.gender = gender;
		this.salary = salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", empName=" + empName + ", empDept=" + empDept + ", gender=" + gender
				+ ", salary=" + salary + "]";
	}

}
