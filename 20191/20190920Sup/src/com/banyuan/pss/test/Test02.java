/**
 * 
 */
package com.banyuan.pss.test;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @zcj 
 *
 *2019年9月28日
 *
 * 上午9:31:30
 */
public class Test02
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Connection conn = null;
		Statement st = null;
		// 加载驱动
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 获取mysql数据库的连接
//		String url = "jdbc:mysql://localhost:3306/zcj";
//		String user = "root";
//		String password = "Root_123";
			Properties p = new Properties();
			p.load(new FileReader("db.properties"));
			String url = p.getProperty("url");
			String user = p.getProperty("username");
			String password = p.getProperty("password");
			conn = DriverManager.getConnection(url, user, password);
			conn.setAutoCommit(false);
			// 构造sql语句
//		String sql ="insert student5(id) values(5)"+ "update student5 set name='qq' where id=5"+"select * from student5 limit 0,?";
			st = conn.createStatement();
//			for (int i = 0; i < 20; i++)
//			{
//				String str = "insert student5(name) values(" + i + ")";
//				st.addBatch(str);
//			}
			 st.addBatch("insert student5(name) values(5)");
			 st.addBatch("update student5 set name='qq' where id=5");
			 //st.addBatch("select * from student5 ");
			 st.executeBatch();
			conn.commit();
		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{

			// ps.setObject(1,0);
//st.clearBatch();
//		ResultSet rs = st.getResultSet();
//		// System.out.println("id\tname");
//		ResultSetMetaData rsmd = rs.getMetaData();
//		System.out.println(rsmd.getColumnName(1) + "\t" + rsmd.getColumnName(2));
//		while (rs.next())
//		{
//			System.out.println(rs.getObject(1) + "\t" + rs.getObject(2));
//
//		}
//		if (rs != null)
//		{
//			rs.close();
//		}
			if (st != null)
			{
				try
				{
					st.close();
				} catch (SQLException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null)
			{
				try
				{
					conn.close();
				} catch (SQLException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}


		
		
		

	}


