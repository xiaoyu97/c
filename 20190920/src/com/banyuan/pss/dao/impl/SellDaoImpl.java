/**
 * 
 */
package com.banyuan.pss.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.banyuan.pss.dao.SellDao;
import com.banyuan.pss.entity.Sell;
import com.banyuan.pss.util.BaseDB;
import com.banyuan.pss.util.JDBCUtil;
import com.banyuan.pss.util.ResultSetDB;

/**
 * @author yw 2019年9月23日 上午9:32:10
 *
 */
public class SellDaoImpl implements SellDao
{

	private BaseDB db = new BaseDB();

	private JDBCUtil jdbcutil = new JDBCUtil();

	private ResultSetDB resultSetDB = new ResultSetDB()
	{

		@Override
		public Vector getData(ResultSet rs)
		{
			Vector d = new Vector();
			try
			{
				while (rs.next())
				{
					Vector line = new Vector();
					line.add(rs.getObject(1));
					line.add(rs.getObject(2));
					line.add(rs.getObject(3));
					line.add(rs.getObject(4));
					line.add(rs.getObject(5));
					line.add(rs.getObject(6));
					line.add(rs.getObject(7));
					d.add(line);
				}
			} catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return d;

		}

	};

	public Vector updateData(Sell sell)
	{
		Vector d = new Vector();
		String sql = "update sale set money=?,number=? ";
		jdbcutil.modify(sql, sell.getMoney(), sell.getNumber());
		return d;
	}

	public void insertData(Sell sell)
	{
		

		String sql = "insert into resale(commodityname,commodityid,selltime,number,money,operator,saleid) select distinct commodityname,commodityid,selltime,number,money,operator,saleid from sale where Commodityid=?";

		jdbcutil.modify(sql, sell.getCommodityid());
	}

	public Vector deleteData(Sell sell)
	{
		Vector d = new Vector();
		String sql = "delete from sale where Commodityid=?";
		jdbcutil.modify(sql, sell.getCommodityid());
		return d;
	}

	public Vector getDataById(Sell sell)
	{

		Vector data = new Vector();

		String sql = "select * from sale where Commodityid=?";

		data = jdbcutil.query(sql, resultSetDB, "" + sell.getCommodityid() + "");

		return data;

	}

	@Override
	public Vector getData()
	{

		System.out.println("===StudentDaoImpl==Vector getData()==");

		Vector data = new Vector();

		String sql = "select * from sale ";

		data = jdbcutil.query(sql, resultSetDB);

		return data;
	}

}
