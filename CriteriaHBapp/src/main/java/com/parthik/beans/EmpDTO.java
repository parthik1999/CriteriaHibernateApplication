package com.parthik.beans;

public class EmpDTO {
	
	private String name;
	private int salary;
	public EmpDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmpDTO [name=" + name + ", salary=" + salary + "]";
	}
	public EmpDTO(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	 
}
