package com.controller;

import com.service.FetchAllRecord;
import com.service.FetchSingleRecord;
import com.service.InsertEmpData;
import com.service.UpdateEmpData;

public class EmployeeDetails {

	public static void main(String[] args) {

		InsertEmpData insert = new InsertEmpData();
		insert.insertRecord();

		UpdateEmpData update = new UpdateEmpData();
		update.updateRecord();

		FetchSingleRecord single = new FetchSingleRecord();
		single.singleRecord();

		FetchAllRecord record = new FetchAllRecord();
		record.getallRecord();
	}
}
