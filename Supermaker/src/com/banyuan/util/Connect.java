package com.banyuan.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Vector;


public class Connect {

	public static Connection conneect() {
		ResultSet rs=null;
		Connection conn=null;
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Properties p=new Properties();
	p.load(new FileReader("db.properties"));
	String url=p.getProperty("url");
	String  user=p.getProperty("user");
	String password=p.getProperty("password");
	 conn=DriverManager.getConnection(url, user, password);
} catch (Exception e) {
	e.printStackTrace();
}
System.out.println(conn);
return conn;
}
//
//	public static void add(	String f,String s,String t) {
//	 
//	Connection conn=conneect();
//	System.out.println(conn);
//	PreparedStatement ps=null;
//	 try {
//		 String sql="insert into provider  (providername,provideraddress,phone) values(?,?,?)";
//		ps=conn.prepareStatement(sql);
////		System.out.println(f+t+s);
//		 ps.setString(1, f);
//		 ps.setString(2, s);
//		 ps.setString(3, t);
//		 ps.executeUpdate();
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//	}
//	public static void del(String name) {
//		 
//		Connection conn=conneect();
////		System.out.println(conn);
//		PreparedStatement ps=null;
//		 try {
//			 String sql="delete from provider  where providername=? ";
//			ps=conn.prepareStatement(sql);
////			System.out.println(name);
//			 ps.setString(1, name);
//			 ps.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		}
	public static  Vector  getName() {
		 
		Connection conn=conneect();
		Vector names=new  Vector();
		PreparedStatement ps=null;
		 try {
			 String sql="select providername from provider";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
names.add(rs.getObject(1)); 
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return names;
		}
}
//	public static void upDate(String name,String phone,String address) {
//		 
//		Connection conn=conneect();
//
//		PreparedStatement ps=null;
//		 try {
//			 String sql="update provider  set phone=?, provideraddress=?  where providername=? ";
//			ps=conn.prepareStatement(sql);
//			System.out.println(name);
//			System.out.println(phone);
//			System.out.println(address);
//			ps.setString(1, phone);
//			ps.setString(2, address);
//			 ps.setString(3, name);
//			 ps.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		}
//	}
//
