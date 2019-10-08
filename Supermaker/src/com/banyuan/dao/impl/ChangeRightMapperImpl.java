package com.banyuan.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.banyuan.dao.ChangeRightMapper;
import com.banyuan.util.MySqlUtil;

public class ChangeRightMapperImpl implements ChangeRightMapper{
	/**
	 * 查询所有的用户名
	 * @return
	 */
	public List selectAll() {
		List list = new ArrayList();
		try {
			String sql = "select * from t_user";
			ResultSet rs = MySqlUtil.mySelect(sql);
			while (rs.next()) {
				list.add(rs.getObject(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MySqlUtil.closeAll();
		}
		return list;
	}
	public int update(String str1,String str2) {
		String sql="update t_user set user_type=? where user_name=?";
		int i=MySqlUtil.myUpdate(sql,str1,str2);
		return i;
	}
}
