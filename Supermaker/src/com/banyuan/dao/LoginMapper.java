package com.banyuan.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.banyuan.pojo.TRight;
import com.banyuan.pojo.User;

public interface LoginMapper {
	/**
	 * 登陆查询
	 * @param str1
	 * @param str2
	 * @return
	 */
	public User login(String str1, String str2);
	/**
	 * 登陆权限查询
	 * @param num
	 * @return
	 */
	public TRight right(int num);
	/**
	 * 登陆状态
	 * @param name
	 * @param pwd
	 * @return
	 */
	public int loginOn(String name,String pwd);
	/**
	 * 退出状态
	 * @param name
	 * @param pwd
	 * @return
	 */
	public int loginOut(String name,String pwd);
	
}
