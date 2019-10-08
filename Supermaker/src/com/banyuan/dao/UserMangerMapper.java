package com.banyuan.dao;

import java.util.Vector;

import com.banyuan.pojo.User;

public interface UserMangerMapper {
	/**
	 * 查询用户表
	 * @return
	 */
	Vector selectUser();
	/**
	 * 查询权限表
	 * @param i
	 * @return
	 */
	String selectRight(int i);
	/**
	 * 增加用户
	 * @param name
	 * @param pwd
	 * @return
	 */
	int insertUser(String name,String pwd);
	/**
	 * 增加用户查询
	 * @param name
	 * @param pwd
	 * @return
	 */
	User selectUser(String name);
	/**
	 * 删除用户
	 * @param name
	 * @param pwd
	 * @return
	 */
	int delUser(String name,String pwd);
}
