package com.banyuan.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.banyuan.dao.QueryMapper;
import com.banyuan.util.MySqlUtil;

public class QueryMapperImpl implements QueryMapper{
	/**
	 * 查询所有
	 */
	@Override
	public Vector selectAll() {
		Vector data = new Vector();
		String sql="select s.storageNum,s.commodityname,s.commodityid,s.unit,s.price,s.warehousingtime,c.providername,s.operator,s.count\n" + 
				"from storage s,commodity c where s.commodityid=c.commodityId";
		ResultSet rs=MySqlUtil.mySelect(sql);
		try {
			while(rs.next()) {
				Vector line = new Vector();
				line.add(rs.getObject(1));
				line.add(rs.getObject(2));
				line.add(rs.getObject(3));
				line.add(rs.getObject(4));
				line.add(rs.getObject(5));
				line.add(rs.getObject(6));
				line.add(rs.getObject(7));
				line.add(rs.getObject(8));
				line.add(rs.getObject(9));
				data.add(line);
  			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MySqlUtil.closeAll();
		}
		return data;
	}

}
