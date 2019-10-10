/**
 * 
 */
package com.banyuan.pss.entity;

/**
 * @zcj 
 *
 *2019年9月25日
 *
 * 下午2:08:07
 */
public class Commodity
{
	
	private String saleid;//主键id
	private String commodityid;//商品编号(唯一)
	private String selltime;//销售时间
	private String number;//数量
	private String money;//总价
	private String operator;//销售员
	private String commodityname;//商品名称	
	
	
	@Override
	public String toString()
	{
		return "Sale [saleid=" + saleid + ", commodityid=" + commodityid + ", selltime=" + selltime + ", number="
				+ number + ", money=" + money + ", operator=" + operator + ", commodityname=" + commodityname + "]";
	}

	/**
	 * @return the saleid
	 */
	public Commodity(String saleid,String commodityid,String selltime,String number,String money,String operator,String commodityname) {
		this.saleid=saleid;
		this.commodityid=commodityid;
		this.selltime=selltime;
		this.number=number;
		this.money=money;
		this.number=number;
		this.operator=operator;
		this.commodityname=commodityname;
	}

	/**
	 * @return the saleid
	 */
	public String getSaleid()
	{
		return saleid;
	}

	/**
	 * @param saleid the saleid to set
	 */
	public void setSaleid(String saleid)
	{
		this.saleid = saleid;
	}

	/**
	 * @return the commodityid
	 */
	public String getCommodityid()
	{
		return commodityid;
	}

	/**
	 * @param commodityid the commodityid to set
	 */
	public void setCommodityid(String commodityid)
	{
		this.commodityid = commodityid;
	}

	/**
	 * @return the selltime
	 */
	public String getSelltime()
	{
		return selltime;
	}

	/**
	 * @param selltime the selltime to set
	 */
	public void setSelltime(String selltime)
	{
		this.selltime = selltime;
	}

	/**
	 * @return the number
	 */
	public String getNumber()
	{
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number)
	{
		this.number = number;
	}

	/**
	 * @return the money
	 */
	public String getMoney()
	{
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(String money)
	{
		this.money = money;
	}

	/**
	 * @return the operator
	 */
	public String getOperator()
	{
		return operator;
	}

	/**
	 * @param operator the operator to set
	 */
	public void setOperator(String operator)
	{
		this.operator = operator;
	}

	/**
	 * @return the commodityname
	 */
	public String getCommodityname()
	{
		return commodityname;
	}

	/**
	 * @param commodityname the commodityname to set
	 */
	public void setCommodityname(String commodityname)
	{
		this.commodityname = commodityname;
	}
	
	
	
}
