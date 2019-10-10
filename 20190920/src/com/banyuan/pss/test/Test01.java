/**
 * 
 */
package com.banyuan.pss.test;

import java.util.Vector;

import com.banyuan.pss.dao.SellDao;
import com.banyuan.pss.entity.Sell;
import com.banyuan.pss.service.SellService;
import com.banyuan.pss.util.MyFactory;

/**
 * @zcj
 *
 *      2019年9月26日
 *
 *      上午10:36:30
 */
public class Test01
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		SellService service = (SellService) MyFactory.getInstance("sellService");
		// SellDao dao = (SellDao) MyFactory.getInstance("sellDao");
		System.out.println("service=" + service);

		Vector v = service.getData();
		System.out.println("v=" + v);
//		
//		
//		
		Sell sell = new Sell();
		sell.setCommodityid(2);
		
		Vector v2 = service.getDataById(sell);
		System.out.println(sell);
		
		System.out.println("v2=" + v2);
System.out.println((Vector)v2.get(7));
		service.insertData(sell);
		//Vector sell = new Vector();

//		service.insertData(sell);

//		
//		System.out.println("*******************************");
	}

}
