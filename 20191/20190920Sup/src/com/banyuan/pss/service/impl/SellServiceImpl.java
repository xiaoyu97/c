/**
 * 
 */
package com.banyuan.pss.service.impl;

import java.util.Vector;

import com.banyuan.pss.dao.SellDao;
import com.banyuan.pss.entity.Sell;
import com.banyuan.pss.service.SellService;
import com.banyuan.pss.util.MyFactory;

/**
 * @author yw 2019年9月20日 下午3:10:01
 *
 */
public class SellServiceImpl implements SellService
{

	private SellDao sellDao = (SellDao) MyFactory.getInstance("sellDao");

	// 逻辑
	public Vector getData() throws RuntimeException
	{
//		BaseDB sdb=new BaseDB();
//		StudentDao dao=new StudentDaoImpl();
		Vector d = sellDao.getData();
		// curPage范围0 -1 >总页数?
//		return sdb.getData(curPage, count);
		return d;
	}

	@Override
	public Vector getDataById(Sell sell)
	{

		// 判断页面的数值是否在有效范围curPage>0

		// 符合条件，调用dao层功能
//		StudentDao dao=new StudentDaoImpl();
		Vector d = sellDao.getDataById(sell);

		return d;
	}
	public Vector updateData(Sell sell) {
		Vector d=sellDao.updateData(sell);
		return d;
		
	}
	public void  insertData(Sell sell) {
		
		sellDao.insertData(sell);
	
		
	}
	public Vector deleteData(Sell sell) {
		Vector d=sellDao.updateData(sell);
		return d;
	}

	
	

}
