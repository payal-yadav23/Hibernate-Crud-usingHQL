package com.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;

import com.dao.EmployeeDao;

public class DeleteEmpRecord {

	public void deleteRecord() {

		EmployeeDao dao = new EmployeeDao();
		Session ss = dao.getSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "delete from Employee where id =: id";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("id", 4);
		int i = query.executeUpdate();

		if (i > 0) {
			System.out.println("Data is deleted...");

		}
		tr.commit();
		ss.close();

	}

}
