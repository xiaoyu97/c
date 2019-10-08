package com.banyuan.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.banyuan.dao.LoginMapper;
import com.banyuan.pojo.TRight;
import com.banyuan.pojo.User;
import com.banyuan.service.LoginService;
import com.banyuan.util.Factory;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class LoginServiceImpl implements LoginService {
//	private LoginMapper loginmapper = new LoginMapperImpl();
	private LoginMapper loginmapper = (LoginMapper) Factory.getInstance("LoginDao");
	/**
	 * 登陆业务
	 */
	@Override
	public int login(String str1, String str2) {
		// 非空校验
		if ((str1.trim().length() == 0) && (str2.trim().length() == 0)) {
//			System.out.println(loginmapper);
			return -1;
		} else {
			User user = loginmapper.login(str1, str2);
			if (user == null) {
				return 1;
			} else {
				List list = new ArrayList();
				String s = user.getU_type();
				if (s != null) {
					String[] str=s.split(",");
					for (int i = 0; i < str.length; i++) {
						TRight right = loginmapper.right(Integer.parseInt(str[i]));
						list.add(right.getT_name());
					}
					for (int j = 0; j < list.size(); j++) {
						String rightName = (String) list.get(j);
						if (list.contains("销售员") && list.contains("库存管理员")) {
							return 2;
						} else if (rightName.equals("超级管理员")) {
							return 3;
						} else if (rightName.equals("库存管理员")) {
							return 4;
						} else if (rightName.equals("销售员")) {
							return 5;
						}
					}
				}
			}
		}
		return 0;
	}

	@Override
	public int loginOn(String name, String pwd) {
		return loginmapper.loginOn(name, pwd);
	}

	@Override
	public int loginOut(String name, String pwd) {
		return loginmapper.loginOut(name, pwd);
	}

}
