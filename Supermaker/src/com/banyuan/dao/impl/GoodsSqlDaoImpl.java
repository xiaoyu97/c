package com.banyuan.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.banyuan.dao.GoodsSqlDao;
import com.banyuan.dao.SupplierSqlDao;
import com.banyuan.util.BaseDB;
import com.banyuan.util.JDBCUtil;
import com.banyuan.util.ResultSetDB;

public class GoodsSqlDaoImpl implements GoodsSqlDao {

	private JDBCUtil jdbcutil = new JDBCUtil();
	private ResultSetDB resultSetDB = new ResultSetDB() {

		@Override
		public Vector getData(ResultSet rs) {
			Vector d = new Vector();
			try {
				while (rs.next()) {
//					Vector line = new Vector();
					d.add(rs.getObject(1));
//					d.add(line);
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println(d);
			System.out.println(d);
			return d;

		}

	};
	private ResultSetDB resultSetAll= new ResultSetDB() {

		@Override
		public Vector getData(ResultSet rs) {
			Vector d = new Vector();
			try {
				while (rs.next()) {
					Vector line = new Vector();
					for(int i=1;i<=10;i++) {
					line.add(rs.getObject(i));}
					d.add(line);
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
//			System.out.println(d);
//			System.out.println(d);
			return d;

		}

	};
	private ResultSetDB resultSetAll2= new ResultSetDB() {

		@Override
		public Vector getData(ResultSet rs) {
			Vector d = new Vector();
			try {
				while (rs.next()) {
					
					for(int i=1;i<=10;i++) {
					d.add(rs.getObject(i));}
					
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
//			System.out.println(d);
//			System.out.println(d);
			return d;

		}

	};
	@Override
	public void add(int id,String name,int id2,String proname,String unit,int downlimit,double Inprice,double saleprice,int storagetime,String date) {
		 String sql="insert into commodity values(?,?,?,?,?,?,?,?,?,?)";
		 jdbcutil.modify(sql,id,name,id2,proname,unit,downlimit,Inprice,saleprice,storagetime,date);	
	}

	@Override
	public void del(String name) {
		String sql="delete from commodity  where providername=? ";
		 jdbcutil.modify(sql, name);
	}


	@Override
	public void updata(int id, String name, int id2, String proname, String unit, int downlimit, double Inprice,
			double saleprice, int storagetime, String date) {
		System.out.println(id+name+id2+proname+unit+downlimit+Inprice+saleprice+storagetime+date+id);
		String sql="update commodity  set  commodityname=? ,providernumber=?,"
				+ "providername=?,unit=?,downlimit=?,Inprice=?,saleprice=?,storagetime=?,producedate=?  where commodityID=? ";
		jdbcutil.modify(sql,name,id2,proname,unit,downlimit,Inprice,saleprice,storagetime,date,id);
	}

	@Override	
	public Vector getComId() {
		String sql="select commodityID from commodity";
		Vector id=jdbcutil.query(sql, resultSetDB);
		return id;
	}

	@Override
	public Vector getAllData() {
		String sql="select * from commodity";
		 Vector item= jdbcutil.query(sql, resultSetAll);
		 return item;
	}

	@Override
	public Vector getNameData(String name) {
		String sql="select * from commodity where commodityname =?";
		 Vector item= jdbcutil.query(sql, resultSetAll,name);
		 return item;
	}

	@Override
	public Vector getProNameData(String name) {
		String sql="select *from commodity where providername=?";
		 Vector item= jdbcutil.query(sql, resultSetAll,name);
		 return item;
	}

	@Override
	public Vector getName(int i) {
		String sql="select commodityname from commodity where commodityID=?";
		Vector name=jdbcutil.query(sql, resultSetDB,i);
		return name;
	}

	@Override
	public Vector sore(String name) {
		String sql="select * from commodityname order by ? desc";
		Vector nameSore=jdbcutil.query(sql, resultSetDB,name);
		return nameSore;
	}

	@Override
	public Vector getForId(int id) {
		System.out.println(id);
		String sql="select * from commodity where commodityID=?";
		Vector all=jdbcutil.query(sql, resultSetAll2,id);
		System.out.println(all);
		return all;
	}
}

