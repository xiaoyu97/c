package com.banyuan.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class MySqlUtil {
	public static Connection conn = null;
	public static PreparedStatement statement = null;
	public static ResultSet resultSet = null;
	public static String driver = null;
	public static String url = null;
	public static String user = null;
	public static String pwd = null;
	/**
	 * 加载配置文件
	 */
	static {
		try {
			Properties properties = new Properties();
			// 加载配置文件
			properties.load(new FileInputStream("db.properties"));
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			pwd = properties.getProperty("password");
			// 加载驱动
			Class.forName(driver);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取数据库连接
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	/**
	 * 获取数据库操作对象
	 * 
	 * @param sql
	 * @param ob
	 * @return
	 */
	public static PreparedStatement getStatement(String sql, Object... ob) {
		// 加载驱动
		try {
			// 创建连接对象
			conn = getConnection();
			// 创建执行对象
			statement = conn.prepareStatement(sql);
			// 如果有参数 则添加参数
			if (ob.length > 0) {
				for (int i = 0; i < ob.length; i++) {
					statement.setObject(i + 1, ob[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return statement;
	}
	/**
	 * 数据库的查询
	 * @param sql
	 * @param ob
	 * @return
	 */
	public static ResultSet mySelect(String sql, Object... ob) {
		PreparedStatement statement = getStatement(sql, ob);
		try {
			resultSet = statement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultSet;
	}

	/**
	 * 数据库的增、删、改
	 * 
	 * @param sql
	 * @param ob
	 * @return
	 */
	public static int myUpdate(String sql, Object... ob) {
		PreparedStatement statement = getStatement(sql, ob);
		// 执行成功的条数
		int count = 0;
		try {
			count = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	/***
	 * 关闭连接 释放资源
	 */
	public static void closeAll() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
