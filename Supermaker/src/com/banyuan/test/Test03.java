package com.banyuan.test;

import java.util.Vector;

import com.banyuan.service.GoodsSqlService;
import com.banyuan.service.JfService;
import com.banyuan.util.MyFactory;

public class Test03 {

	public static void main(String[] args) {
	JfService jd = (JfService) MyFactory.getInstance("JfService");
 GoodsSqlService sql = (GoodsSqlService) MyFactory.getInstance("GoodsSqlService");
	Vector idVector=sql.getComId();
	
	boolean x=	jd.ishas(idVector, 3, true);
		System.out.println(x);

	}

}
