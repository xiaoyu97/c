package com.banyuan.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import com.banyuan.util.BaseDB;

public class Test02 {
	public static void main(String[] args) {
	 BaseDB db = new BaseDB();
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	try {
		conn = db.getConnect();
		String sql="select providernumber,providername from provider";
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		Map name=new HashMap();
		while(rs.next()) {
			name.put(rs.getObject(1), rs.getObject(2));
		System.out.println(rs.getObject(1));
		System.out.println(rs.getObject(2));
	}System.out.println("集合"+name);
		}
	
	catch (SQLException e) {
		
		e.printStackTrace();
	}
	finally {
		db.DBClose(conn, ps, null);
	}
}
}


