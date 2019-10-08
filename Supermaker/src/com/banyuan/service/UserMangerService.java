package com.banyuan.service;

import java.util.Vector;

public interface UserMangerService {
	/**
	 * 查询用户信息
	 * @return
	 */
	Vector getUserData();
	/**
	 * 增添用户
	 * @param name
	 * @param pwd
	 * @return
	 */
	int insertUser(String name,String pwd);
	/**
	 * 删除用户
	 * @param name
	 * @param pwd
	 * @return
	 */
	int delUser(String name,String pwd);
}
