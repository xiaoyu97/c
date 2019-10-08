package com.banyuan.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.banyuan.dao.UserMangerMapper;
import com.banyuan.pojo.User;
import com.banyuan.util.MySqlUtil;

public class UserMangerMapperImpl implements UserMangerMapper {
	/**
	 * 查询用户表
	 */
	@Override
	public Vector selectUser() {
		Vector data = new Vector();
		try {
			String sql = "select * from t_user";
			ResultSet rs = MySqlUtil.mySelect(sql);
			while (rs.next()) {
				Vector line=new Vector();
				line.add(rs.getObject(2));
				line.add(rs.getObject(3));
				line.add(rs.getObject(5));
				line.add(rs.getObject(4));
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
	/**
	 * 查询权限表
	 */
	@Override
	public String selectRight(int i) {
		String sql="select t_name from t_right where t_id=?";
		String right=null;
		ResultSet rs=MySqlUtil.mySelect(sql, i);
		try {
			while(rs.next()){
				right=rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MySqlUtil.closeAll();
		}
		return right;
	}
	/**
	 * 增加用户
	 */
	@Override
	public int insertUser(String name, String pwd) {
		String sql ="insert into t_user(user_name,user_pwd) values(?,?)";
		int i= MySqlUtil.myUpdate(sql, name,pwd);
		MySqlUtil.closeAll();
		return i;
	}
	/**
	 * 用户查询
	 */
	@Override
	public User selectUser(String name) {
		User user=null;
		String sql="select * from t_user where user_name=?";
		ResultSet rs=MySqlUtil.mySelect(sql,name);
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
	 * 删除用户
	 */
	@Override
	public int delUser(String name, String pwd) {
		String sql="delete from t_user where user_name=? and user_pwd=?";
		int i=MySqlUtil.myUpdate(sql, name,pwd);
		return i;
	}
	

}
