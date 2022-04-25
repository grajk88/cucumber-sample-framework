package com.gt.utils;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import io.cucumber.java.Scenario;

public class ExcelManipulation {

	public static void main(String[] args) {

		Recordset recordset = null;

		try {

			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection("C:\\Users\\vgrk2\\Desktop\\TestData.xls");
			String strQuery = "Select * from QA";
			recordset = connection.executeQuery(strQuery);

			while (recordset.next()) {

				String runFlag = recordset.getField("RunFlag");

				if (runFlag.equals("Yes")) {
					System.out.println(recordset.getField("TestCaseID") + " - Execute the Test");
				} else {
					System.out.println(recordset.getField("TestCaseID") + " - Do Not Execute the Test");
				}
			}

		} catch (FilloException e) {
			e.printStackTrace();
		}
	}

	public void getTestData() {

		Recordset recordset = null;

		try {

			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection("C:\\Users\\vgrk2\\Desktop\\TestData.xls");
			String strQuery = "Select * from QA";
			recordset = connection.executeQuery(strQuery);

			while (recordset.next()) {

				String runFlag = recordset.getField("RunFlag");

				if (runFlag.equals("Yes")) {
					System.out.println(recordset.getField("TestCaseID") + " - Execute the Test");
				} else {
					System.out.println(recordset.getField("TestCaseID") + " - Do Not Execute the Test");
				}
			}

		} catch (FilloException e) {
			e.printStackTrace();
		}
	}

}
