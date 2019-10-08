package com.banyuan.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface ChangeRightMapper {
	/**
	 * 查询所有的用户名
	 * @return
	 */
	public List selectAll() ;
	/**
	 * 插入数据
	 * @param str1
	 * @param str2
	 * @return
	 */
	public int update(String str1,String str2);
}
