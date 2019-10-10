/**
 * 
 */
package com.banyuan.pss.service;

import java.util.Vector;

import com.banyuan.pss.entity.Sell;

/**
 * @zcj 
 *
 *2019年9月23日
 *
 * 下午6:54:00
 */
public interface SellService
{
public Vector getData() ;
	
public Vector getDataById(Sell sell);
public Vector updateData(Sell sell);
public void insertData(Sell sell);
public Vector deleteData(Sell sell) ;


}
