/**
 * 
 */
package com.banyuan.service;

import java.util.Vector;


import com.banyuan.util.BaseDB;


public interface SupplierSqlService {
	public void add(String nane,String adder,String phone);
	public void del(String name);
	public void upDate(String name,String phone,String address,String upname);
	public Vector getNameData(String name) ;
	public Vector getAdderData(String adder) ;
	public Vector  getName();
	public Vector getAllData() ;
}
