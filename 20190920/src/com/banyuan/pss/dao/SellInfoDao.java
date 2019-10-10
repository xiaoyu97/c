package com.banyuan.pss.dao;

import java.util.Vector;

public interface SellInfoDao {

	Vector getData();
	
	Vector getDataBySelectedItem(String colName,String content);
	
}
