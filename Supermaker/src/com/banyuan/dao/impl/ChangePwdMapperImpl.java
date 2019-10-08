package com.banyuan.dao.impl;

import com.banyuan.dao.ChangePwdMapper;
import com.banyuan.util.MySqlUtil;

public class ChangePwdMapperImpl implements ChangePwdMapper{
	/**
	 * 修改密码
	 * @param str1
	 * @param str2
	 * @param str3
	 * @return
	 */
	public int changePwd(String str1,String str2,String str3) {
		String sql="update t_user set user_pwd=? where user_name=? and user_pwd=?";
		int i=MySqlUtil.myUpdate(sql, str1,str2,str3);
		MySqlUtil.closeAll();
		return i;
	}
}
