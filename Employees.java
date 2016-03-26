package com.aop.couple;

import java.util.Collections;
import java.util.List;

public class Employees {

	List<Employee> getEmployees(int size) {
		List<Employee> list=Collections.<Employee>emptyList();
		for (int i = 0; i <= 10; i++) {
			Employee employee = new Employee();
			list.add(employee);
		}
		return list;
	}
	

}
