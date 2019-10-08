package com.banyuan.service.impl;

import java.util.Vector;

import com.banyuan.dao.LoginMapper;
import com.banyuan.dao.UserMangerMapper;

import com.banyuan.pojo.User;
import com.banyuan.service.LoginService;
import com.banyuan.service.UserMangerService;
import com.banyuan.util.Factory;

public class UserMangerServiceImpl implements UserMangerService {
//	private UserMangerMapper umm = new UserMangerMapperImpl();
//	private LoginMapper lm = new LoginMapperImpl();
	private UserMangerMapper umm=(UserMangerMapper) Factory.getInstance("UserDao");
	private LoginMapper lm = (LoginMapper) Factory.getInstance("LoginDao");

	/**
	 * 查询用户表
	 */
	@Override
	public Vector getUserData() {
		Vector userData = umm.selectUser();
		for (int i = 0; i < userData.size(); i++) {
			Vector v1 = (Vector) userData.get(i);
			String type = (String) v1.get(3);
			if (type != null) {
				String[] right = type.split(",");
				for (int j = 0; j < right.length; j++) {
					String r = umm.selectRight(Integer.parseInt(right[j]));
					if (j > 0) {
						String s = (String) v1.get(3);
						String str = r + "," + s;
						v1.set(3, str);
					} else {
						v1.set(3, r);
					}
				}
			}
		}

		return userData;
	}

	/**
	 * 增加用户
	 */
	@Override
	public int insertUser(String name, String pwd) {
		if ((name.trim().length() == 0) && (pwd.trim().length() == 0)) {
			return 0;
		} else {
			User u = umm.selectUser(name);
			if (u != null) {
				return -2;
			} else {
				int i = umm.insertUser(name, pwd);
				return 1;
			}
		}
	}

	/**
	 * 删除用户
	 */
	@Override
	public int delUser(String name, String pwd) {
		if ((name.trim().length() == 0) && (pwd.trim().length() == 0)) {
			return 0;
		} else {
			User u = lm.login(name, pwd);
			if (u == null) {
				return -2;
			} else {
				umm.delUser(name, pwd);
			}
		}
		return -1;
	}

}
