/**
 * 
 */
package com.banyuan.service;

import java.util.Vector;


import com.banyuan.util.BaseDB;


public interface GoodsSqlService {
	public void add(int id,String name,int id2,String proname,String unit,int downlimit,double Inprice,double saleprice,int storagetime,String date);
	public void del(String name);
	public void upData(int id,String name,int id2,String proname,String unit,int downlimit,double Inprice,double saleprice,int storagetime,String date);

	public Vector getNameData(String name) ;
	public Vector getProNameData(String name) ;
	public Vector  getComId();
	public Vector getAllData() ;
	public Vector getNameData(int i);
	public Vector sore(String name);
	public Vector getForid(int id);
	
}
