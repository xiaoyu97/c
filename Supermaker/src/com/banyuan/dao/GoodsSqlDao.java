package com.banyuan.dao;

import java.util.Vector;

public interface GoodsSqlDao{
	public void add(int id,String name,int id2,String proname,String unit,int downlimit,double Inprice,double saleprice,int storagetime,String date);
	public void del(String name);
	
	public void updata(int id,String name,int id2,String proname,String unit,int downlimit,double Inprice,double saleprice,int storagetime,String date);
	public Vector  getComId();
	public Vector getAllData();
	public Vector getNameData(String name);
	public Vector getProNameData(String name);
	public Vector getName(int i);
	public Vector sore(String name);
	public Vector getForId(int Id);
}
