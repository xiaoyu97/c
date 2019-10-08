package com.banyuan.test;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import com.banyuan.dao.GoodsSqlDao;
import com.banyuan.dao.SupplierSqlDao;
import com.banyuan.dao.impl.GoodsSqlDaoImpl;
import com.banyuan.service.GoodsSqlService;
import com.banyuan.service.SupplierSqlService;
//import com.banyuan.util.Connect;
import com.banyuan.util.MyFactory;
import com.banyuan.util.ResultSetDB;

public class Test1 {
public static void main(String[] args) {

//	 MyFactory<PlaySqlDaoImpl> mf2=new  MyFactory();
//	PlaySqlDao dao=(PlaySqlDao)mf.getInstance("PlaySqlDao");
	//连接测试通过 
//	Connection coon=new BaseDB().getConnect();
//	System.out.println(coon);
	
//	PlaySqlDaoImpl tx=new MyFactory<PlaySqlDaoImpl>().getInstance("PlaySqlDao");
//	PlaySqlDaoImpl tx=new PlaySqlDaoImpl();
	//删除测试通过
//	System.out.println("Test1====main===");
//	SupplierSqlService sql=(SupplierSqlService) MyFactory.getInstance("SupplierSqlService");
	GoodsSqlService sql=(GoodsSqlService) MyFactory.getInstance("GoodsSqlService");
//	
//	System.out.println("Test2====main===");
	
//	System.out.println("ser="+ser);
//	ser.getName();
	
//	SqlServiceImpl ser=new SqlServiceImpl();
//	ser.del("谷歌");
//	tx.del("天猫");
//	添加测试通过
//			tx.add("谷歌", "17721517719", "南京");
	//修改成功
//			tx.upDate("天猫", "13030921733", "北京");
//	获取名字
//	Vector v=new Vector();
//	 v=sql.getData("苏宁易购");

//			System.out.println(v);
//	Map pro=new HashMap<Integer,String>() ;
//	Vector name=sql.getproName();
//	System.out.println(name);
	
//	Vector name=sql.getproName();
//	System.out.println(name);
}

	
}

