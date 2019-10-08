package com.banyuan.dao.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.banyuan.dao.LoginMapper;
import com.banyuan.pojo.TRight;
import com.banyuan.pojo.User;
import com.banyuan.util.MySqlUtil;

public class LoginMapperImpl implements LoginMapper{
	/**
	 * 登陆查询
	 * @param str1
	 * @param str2
	 * @return
	 */
	public User login(String str1, String str2) {
		User user=null;
		String sql="select * from t_user where user_name=? and user_pwd=?";
		ResultSet rs=MySqlUtil.mySelect(sql,str1,str2);
		try {
			while(rs.next()) {
				user =new User();
				user.setU_id(rs.getInt(1));
				user.setU_name(rs.getString(2));
				user.setU_pwd(rs.getString(3));
				user.setU_type(rs.getString(4));
				user.setU_state(rs.getInt(5));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MySqlUtil.closeAll();
		}
		return user;
	}
	/**
	 * 登陆权限查询
	 * @param num
	 * @return
	 */
	public TRight right(int num) {
		TRight right=null;
		String sql="select * from t_right where t_id=?";
		ResultSet rs=MySqlUtil.mySelect(sql,num);
		try {
			while(rs.next()) {
				right =new TRight();
				right.setT_name(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MySqlUtil.closeAll();
		}
		return right;

	}
	@Override
	public int loginOn(String name,String pwd) {
		String sql = "update t_user set user_state =1 where user_name=? and user_pwd=?";
		int i=MySqlUtil.myUpdate(sql, name,pwd);
		MySqlUtil.closeAll();
		return i;
	}
	@Override
	public int loginOut(String name, String pwd) {
		String sql = "update t_user set user_state =0 where user_name=? and user_pwd=?";
		int i=MySqlUtil.myUpdate(sql, name,pwd);
		MySqlUtil.closeAll();
		return i;
	}

}
