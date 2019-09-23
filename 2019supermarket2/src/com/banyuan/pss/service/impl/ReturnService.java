/**
 * 
 */
package com.banyuan.pss.service.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Vector;

import com.banyuan.pss.db.ReturnDB;
import com.banyuan.pss.db.StockDB;

/**
 * @author edz
 *2019年9月22日 下午3:20:59
 * 
 */
public class ReturnService {

	
	public Vector getData() {
		ReturnDB rdb=new ReturnDB();
		return rdb.getData();
				
}
}