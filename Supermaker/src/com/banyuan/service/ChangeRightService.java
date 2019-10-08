package com.banyuan.service;

import java.util.List;

public interface ChangeRightService {
	//登陆验证
	public int login(String str1, String str2);
	//获取所有用户名
	public List getInfo();
	//修改权限
	public int updateRight(String str1,String str2);
}
