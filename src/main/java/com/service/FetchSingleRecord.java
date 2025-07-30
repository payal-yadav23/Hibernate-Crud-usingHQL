package com.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class FetchSingleRecord {

	public void singleRecord() {
		EmployeeDao dao = new EmployeeDao();
		Session ss = dao.getSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Employee where id =: id";
		Query<Employee> query = ss.createQuery(hqlQuery);
		query.setParameter("id", 4);

		Employee e = query.getSingleResult();
		System.out.println(e);

		tr.commit();
		ss.close();

	}
}
