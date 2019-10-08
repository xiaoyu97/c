/**
 * 
 */
package com.banyuan.service.impl;

import java.util.Vector;

import com.banyuan.dao.SupplierSqlDao;
import com.banyuan.service.SupplierSqlService;
import com.banyuan.util.MyFactory;

public class SupplierSqlServiceImpl implements SupplierSqlService{
	
SupplierSqlDao todo=(SupplierSqlDao)MyFactory.getInstance("SupplierSqlDao");
	
	@Override
	public void add(String nane, String adder, String phone) {
		todo.add(nane, adder, phone);
		
	}

	@Override
	public void del(String name) {
//		System.out.println("1"+name);
		todo.del(name);
		
	}

	@Override
	public Vector getName() {
		Vector name=todo.getName();
		return name;
	}

	@Override
	public void upDate(String name, String phone, String address,String upname) {
//		System.out.println(name+phone+address);
		todo.upDate(name, phone, address,upname);
		
	}

	@Override
	public Vector getNameData(String name) {
		Vector d=todo.getNameData(name);
		return d;
	}

	@Override
	public Vector getAllData() {
		Vector data=todo.getAllData();
		return data;
	}

	@Override
	public Vector getAdderData(String adder) {
		Vector data=todo.getAdderData(adder);
				return data;
	}

}
