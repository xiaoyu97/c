/**
 * 
 */
package com.banyuan.service.impl;

import java.util.Vector;

import com.banyuan.dao.GoodsSqlDao;
import com.banyuan.dao.SupplierSqlDao;
import com.banyuan.service.GoodsSqlService;
import com.banyuan.service.SupplierSqlService;
import com.banyuan.util.MyFactory;

public class GoodsSqlServiceImpl implements GoodsSqlService{
	
GoodsSqlDao sql=(GoodsSqlDao)MyFactory.getInstance("GoodsSqlDao");
	
	

	@Override
	public void del(String name) {
//		System.out.println("1"+name);
		sql.del(name);
		
	}




	@Override
	public void add(int id,String name,int id2,String proname,String unit,int downlimit,double Inprice,double saleprice,int storagetime,String date) {
		
		sql.add(id,name,id2,proname,unit,downlimit,Inprice,saleprice,storagetime,date);
		
	}

	@Override
	public void upData(int id, String name, int id2, String proname, String unit, int downlimit, double Inprice,
			double saleprice, int storagetime, String date) {
		sql.updata(id,name,id2,proname,unit,downlimit,Inprice,saleprice,storagetime,date);
		
	}

	@Override
	public Vector getComId() {
		Vector id=sql.getComId();
		System.out.println("2"+id);
		return id;
		
	}

	@Override
	public Vector getAllData() {
		Vector data=sql.getAllData();
		return data;
	}




	@Override
	public Vector getNameData(String name) {
		Vector names=sql.getNameData(name);
		return names;
	}




	@Override
	public Vector getProNameData(String name) {
		Vector proname=sql.getNameData(name);
		return proname;
	}




	@Override
	public Vector getNameData(int i) {
		Vector name=sql.getName(i);
		return name;
	}




	@Override
	public Vector sore(String name) {
		Vector nameSore=sql.sore(name);
		return nameSore;
	}




	@Override
	public Vector getForid(int id) {
		Vector all=sql.getForId(id);
		return all;
	}

	

}
