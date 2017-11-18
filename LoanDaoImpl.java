package com.hackathon.loanapp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoanDaoImpl implements LoanDao{

	ConnectionJDBC connection = new ConnectionJDBC();
	public String getLoan(Loan loanApplication) {
		Connection conn = connection.getConnection();
		// to-do : apply for loan.
		try {
			Statement stmt = conn.createStatement();
			String sql = "insert into tbl_loan_calculator(fullName, loanamount, occupation, companyName, tenure, email, dob, mobile)"
					+ "values(?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "xyz");
			pstmt.setInt(2, 100000);
			pstmt.setString(3, "Engineer");
			pstmt.setString(4, "HCL");
			pstmt.setString(5, "180");
			pstmt.setString(6, "xyz@abc.com");
			pstmt.setDate(7, new Date(18-11-2017));
			pstmt.setString(8, "9876543210");
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	
}
