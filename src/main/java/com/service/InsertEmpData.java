package com.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;

import com.dao.EmployeeDao;

public class InsertEmpData {

	public void insertRecord() {

		EmployeeDao dao = new EmployeeDao();
		Session ss = dao.getSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "insert into emp_details(empName,empDept,gender,salary)values(:name,:dept,:gender,:sal)";
		MutationQuery query = ss.createNativeMutationQuery(hqlQuery);
		query.setParameter("name", "Rachel");
		query.setParameter("dept", "Production");
		query.setParameter("gender", "Female");
		query.setParameter("sal", 55000);
		int i = query.executeUpdate();

		if (i > 0) {

			System.out.println("Data is inserted...");

		}

		tr.commit();
		ss.close();
	}
}
