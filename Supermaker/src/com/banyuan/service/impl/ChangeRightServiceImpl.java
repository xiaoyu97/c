package com.banyuan.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.banyuan.dao.ChangeRightMapper;
import com.banyuan.dao.LoginMapper;

import com.banyuan.pojo.User;
import com.banyuan.service.ChangeRightService;
import com.banyuan.util.Factory;

public class ChangeRightServiceImpl implements ChangeRightService{
	private LoginMapper loginmapper = (LoginMapper) Factory.getInstance("LoginDao");
	private ChangeRightMapper crm = (ChangeRightMapper)Factory.getInstance("changeRightDao");
	@Override
	public int login(String str1, String str2) {
		//非空校验
		if((str1.trim().length()==0)&&(str2.trim().length()==0)) {
			return -1;
		}else {
//			LoginMapper loginmapper=new LoginMapperImpl();
			User user=loginmapper.login(str1, str2);
			if(user==null) {
				return 1;
			}else if(user.getU_type()==null||!user.getU_type().equals("1")) {
				return 2;
			}
		}
		return 0;

	}

	@Override
	public List getInfo() {
		//return new ChangeRightMapperImpl().selectAll();
		return crm.selectAll();
	}
	
	public int updateRight(String str1,String str2) {
//		ChangeRightMapper crm=new ChangeRightMapperImpl();
		return crm.update(str1, str2);
	}
}
