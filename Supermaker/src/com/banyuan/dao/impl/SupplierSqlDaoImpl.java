package com.banyuan.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.banyuan.dao.SupplierSqlDao;
import com.banyuan.util.BaseDB;
import com.banyuan.util.JDBCUtil;
import com.banyuan.util.ResultSetDB;

public class SupplierSqlDaoImpl implements SupplierSqlDao {

	private JDBCUtil jdbcutil = new JDBCUtil();
	private ResultSetDB resultSetDB = new ResultSetDB() {

		@Override
		public Vector getData(ResultSet rs) {
			Vector d = new Vector();
			try {
				while (rs.next()) {
					Vector line = new Vector();
					line.add(rs.getObject(1));
					line.add(rs.getObject(2));
					line.add(rs.getObject(3));
					line.add(rs.getObject(4));
					d.add(line);
				}
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(d);
			return d;

		}

	};
	private ResultSetDB resultSetName = new ResultSetDB() {

		@Override
		public Vector getData(ResultSet rs) {
			Vector name = new Vector();
			try {
				while (rs.next()) {
					
					name.add(rs.getObject(1));
					
				}
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return name;

		}

	};
	
	@Override
	public void add(String name, String adder, String phone) {
		 String sql="insert into provider  (providername,provideraddress,phone) values(?,?,?)";
		 jdbcutil.modify(sql,  name,  adder,  phone);
		
	}
@Override
public void del(String name) {
//	System.out.println("2"+name);
	 String sql="delete from provider  where providername=? ";
	 jdbcutil.modify(sql, name);
	
}

@Override
public Vector getName() {
	Vector names=new  Vector();
	String sql="select providername from provider";
	names = jdbcutil.query(sql, resultSetName);
//	System.out.println(names);
	return names;
	
}

@Override
public void upDate(String name, String phone, String address,String upname) {
//	System.out.println("2"+name+phone+address);
	String sql="update provider  set phone=?, provideraddress=? ,providername=?  where providername=? ";
	jdbcutil.modify(sql, phone,address,upname,name);
}
@Override
public Vector getNameData(String name) {
	Vector item=new  Vector();
	String sql="select * from provider where providername=?";
	 item= jdbcutil.query(sql, resultSetDB ,name);
	 return item;
}
@Override
public Vector getAllData() {
	String sql="select * from provider";
	 Vector item= jdbcutil.query(sql, resultSetDB);
	 return item;
}
@Override
public Vector getAdderData(String adder) {
	String sql="select * from provider where provideraddress like ?";
	Vector  item= jdbcutil.query(sql, resultSetDB ,adder+"%");
	 return item;
}


}

