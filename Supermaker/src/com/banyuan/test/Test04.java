package com.banyuan.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.banyuan.util.BaseDB;
import com.mysql.cj.jdbc.CallableStatement;

public class Test04 {
public static void main(String[] args) {
	BaseDB db = new BaseDB();
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
//	CallableStatement cs=null;
	
	try {
		conn = db.getConnect();
		String sql = "select providernumber,providername from provider";
		java.sql.CallableStatement cs=conn.prepareCall(sql);
		ps = conn.prepareStatement(sql);
		rs = cs.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getObject(1));
			System.out.println(rs.getObject(2));
		}
//		System.out.println("集合" + name);
	}

	catch (SQLException e) {

		e.printStackTrace();
	} finally {
		db.DBClose(conn, ps, null);
	}
	
}
}

