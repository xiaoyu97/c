/**
 * 
 */
package com.banyuan.pss.db;

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

/**
 * @author edz 2019年9月22日 下午3:51:24
 * 
 */
public class ReturnDB {

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

			String sql = "select * from returncommodity";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Vector line = new Vector();

				line.add(rs.getObject(1));// 退货编号
				line.add(rs.getObject(2));// 商品名称
				line.add(rs.getObject(3));// 商品编号
				line.add(rs.getObject(4));// 价格
				line.add(rs.getObject(5));// 退货时间
				line.add(rs.getObject(7));// 供应商名称
				line.add(rs.getObject(8));// 销售员
				line.add(rs.getObject(9));// 单位

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
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		return data;

	}
}
