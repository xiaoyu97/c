package com.banyuan.dao;

import java.util.Vector;

public interface SupplierSqlDao{
	public void add(String nane,String adder,String phone);
	public void del(String name);
	public Vector  getName();
	public void upDate(String name,String phone,String address,String upname);
	public Vector getNameData(String name);
	public Vector getAllData();
	public Vector getAdderData(String adder);
}
