package com.userdefinendobject;

public class Emloyee {
	private int id;
    private String department;
    private double salary;
	public Emloyee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emloyee(int id, String department, double salary) {
		super();
		this.id = id;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emloyee [id=" + id + ", department=" + department + ", salary=" + salary + "]";
	}
    
    
}
