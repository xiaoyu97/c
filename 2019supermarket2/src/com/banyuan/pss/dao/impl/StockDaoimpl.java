/**
 * 
 */
package com.banyuan.pss.dao.impl;

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

import com.banyuan.pss.dao.StockDao;
import com.banyuan.pss.entity.Stock;

/**
 * @author edz
 *2019年9月23日 下午4:28:54
 * 
 */
public class StockDaoimpl implements StockDao{
	
	
	public void insertData(Stock stock) {
		

		ResultSet rs = null;
		PreparedStatement ps = null;
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// 加载驱动
			// 读取db.properties
			Properties p = new Properties();
			p.load(new FileReader("db.properties"));

			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String password = p.getProperty("password");
			conn = DriverManager.getConnection(url, user, password);

			String sql = "select * from storage";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}		
	}

	@Override
	public Vector getData() {
		Vector data = new Vector();

		ResultSet rs = null;
		PreparedStatement ps = null;
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// 加载驱动
			// 读取db.properties
			Properties p = new Properties();
			p.load(new FileReader("db.properties"));

			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String password = p.getProperty("password");
			conn = DriverManager.getConnection(url, user, password);

			String sql = "select * from storage";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Vector line = new Vector();
				line.add(rs.getObject(2));// 商品名称
				line.add(rs.getObject(3));// 商品编号
				line.add(rs.getObject(4));// 单位
				line.add(rs.getObject(5));// 单价
				line.add(rs.getObject(7));// 数量
				line.add(rs.getObject(8));// 入库时间
				// 获取其他表的保质期
//			line.add(rs.getObject());
				line.add(rs.getObject(6));// 操作员

				data.add(line);

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return data;

	}


}
