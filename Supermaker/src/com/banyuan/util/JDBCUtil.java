/**
 * 
 */
package com.banyuan.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class JDBCUtil {
	private BaseDB db = new BaseDB();

	public void modify(String sql, Object... args) {
		Connection conn = null;
		conn = db.getConnect();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
				ps.setObject(i + 1, args[i]);
			}
			ps.executeUpdate();

		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			db.DBClose(conn, ps, null);
		}

	}

	public Vector query(String sql, ResultSetDB resultSetDB,Object... args) {

		Vector data = new Vector();

		Connection conn = null;
		conn = db.getConnect();
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				ps.setObject(i + 1, args[i]);
			}
			rs = ps.executeQuery();

			data=resultSetDB.getData(rs);
			System.out.println(data);

		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			db.DBClose(conn, ps, null);
		}
		return data;
	}
	
	
}
