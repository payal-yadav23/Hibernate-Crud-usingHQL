package com.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;

import com.dao.EmployeeDao;

public class UpdateEmpData {

	public void updateRecord() {

		EmployeeDao dao = new EmployeeDao();
		Session ss = dao.getSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "update Employee set empName=:name, empDept =: dept, salary =: salary where emp_id=:id ";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("name", "Ross");
		query.setParameter("dept", "HR");
		query.setParameter("salary", "65000");
		query.setParameter("id", "3");
		int i = query.executeUpdate();

		if (i > 0) {
			System.out.println("Data Updated....");
		}
		tr.commit();
		ss.close();
	}

}
