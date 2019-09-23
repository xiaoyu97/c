/**
 * 
 */
package com.banyuan.pss.entity;

import java.util.Date;

/**
 * @author edz
 *2019年9月23日 下午3:57:24
 * 
 */
public class Stock {
	private String commodityname;//商品名称
	private String commodityid;//商品编号
	private String unit;//单位
	private float price;//单价
	private int number;//数量
	private Date indate;//入库时间
	private Date producedate;//保质期
	private String operator;//操作员
	
	public String getCommodityname() {
		return commodityname;
	}
	
	public void setCommodityname(String commodityname) {
		this.commodityname = commodityname;
	}
	
	public String getCommodityid() {
		return commodityid;
	}

	public void setCommodityid(String commodityid) {
		this.commodityid = commodityid;
	}
	
	public String getUnit() {
		return unit;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	public Date getIndate() {
		return indate;
	}
	
	public void setIndate(Date indate) {
		this.indate = indate;
	}
	
	public Date getProducedate() {
		return producedate;
	}
	
	public void setProducedate(Date producedate) {
		this.producedate = producedate;
	}

	public String getOperator() {
		return operator;
	}
	
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
