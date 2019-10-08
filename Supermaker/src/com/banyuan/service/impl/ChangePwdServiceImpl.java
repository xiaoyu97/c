package com.banyuan.service.impl;

import com.banyuan.dao.ChangePwdMapper;
import com.banyuan.dao.LoginMapper;

import com.banyuan.pojo.User;
import com.banyuan.service.ChangePwdService;
import com.banyuan.util.Factory;

public class ChangePwdServiceImpl implements ChangePwdService{
	private LoginMapper loginmapper=(LoginMapper) Factory.getInstance("LoginDao");
	private ChangePwdMapper cpd = (ChangePwdMapper) Factory.getInstance("changePwdDao");
	/**
	 * 校验用户名密码正确
	 */
	@Override
	public int login(String str1, String str2) {
		//非空校验
		if((str1.trim().length()==0)&&(str2.trim().length()==0)) {
			return -1;
		}else {
//			LoginMapper loginmapper=new LoginMapperImpl();
			User user=loginmapper.login(str1, str2);
			System.out.println(user);
			if(user==null) {
				return 1;
			}
		}
		return 0;
	}
	/**
	 * 修改密码
	 */
	@Override
	public int changePwd(String str1,String str2, String str3,String str4) {
		if(!str3.equals(str4)) {
			return 2;
		}else {
//			ChangePwdMapper cpd=new ChangePwdMapperImpl();
			int i=cpd.changePwd(str3, str1, str2);
			if(i>0) {
				return 3;
			}else {
				return 4;
			}
		}
		
	}

	
	

}
