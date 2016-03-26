package com.aop.couple;

import java.util.Collections;
import java.util.List;

public class Company {
	List<Employee> getEmployees() {
		List<Employee> list=Collections.<Employee>emptyList();
		for (int i = 0; i <= 10; i++) {
			Employee employee = new Employee();
			list.add(employee);
		}
		return list;
	}

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
Company company = new Company();
List<Employee> emps=company.getEmployees();
for(int i=0;i<emps.size();i++){
	Employee emp=emps.get(i);
	System.out.println(emp);
	
}
	}

}
