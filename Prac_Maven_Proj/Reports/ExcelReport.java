package com.automation.testcases;

import org.automationtesting.excelreport.Xl;

public class ExcelReport {

	public static void main(String[] args) throws Exception {
		Xl.generateReport("excel-report.xlsx");
				//Xl.generateReport("E:/My_Git_Projects/Projects","excel-report.xlsx" );
	}

}
