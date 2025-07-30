package com.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class FetchAllRecord {

	public void getallRecord() {
		EmployeeDao dao = new EmployeeDao();
		Session ss = dao.getSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Employee";
		Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);
		List<Employee> list = query.list();

		for (Employee employee : list) {
			System.out.println(employee);
		}
	}

}
