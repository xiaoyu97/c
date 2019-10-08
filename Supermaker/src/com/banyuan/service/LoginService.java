package com.banyuan.service;

import java.util.List;

public interface LoginService {
	int login(String str1,String str2);
	
	int loginOn(String name,String pwd);
	
	int loginOut(String name,String pwd);

}
