/**
 * 
 */
package com.banyuan.pss.entity;

/**
 * @zcj
 *
 *      2019年9月25日
 *
 *      下午2:08:07
 */
public class Sell
{

	private int saleid;// 主键id
	private int commodityid;// 商品编号(唯一)
	private String selltime;// 销售时间
	private int number;// 数量
	private float money;// 总价
	private String operator;// 销售员
	private String commodityname;// 商品名称

	@Override
	public String toString()
	{
		return "Sale [saleid=" + saleid + ", commodityid=" + commodityid + ", selltime=" + selltime + ", number="
				+ number + ", money=" + money + ", operator=" + operator + ", commodityname=" + commodityname + "]";
	}

	/**
	 * @return the saleid
	 */
	public Sell() {
		
	}
	public Sell(int saleid, int commodityid, String selltime, int number, float money, String operator,
			String commodityname)
	{
		this.saleid = saleid;
		this.commodityid = commodityid;
		this.selltime = selltime;
		this.number = number;
		this.money = money;
		this.operator = operator;
		this.commodityname = commodityname;
	}

	public int getSaleid()
	{
		return saleid;
	}

	public void setSaleid(int saleid)
	{
		this.saleid = saleid;
	}

	public int getCommodityid()
	{
		return commodityid;
	}

	public void setCommodityid(int commodityid)
	{
		this.commodityid = commodityid;
	}

	public String getSelltime()
	{
		return selltime;
	}

	public void setSelltime(String selltime)
	{
		this.selltime = selltime;
	}

	public int getNumber()
	{
		return number;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}

	public float getMoney()
	{
		return money;
	}

	public void setMoney(float money)
	{
		this.money = money;
	}

	public String getOperator()
	{
		return operator;
	}

	public void setOperator(String operator)
	{
		this.operator = operator;
	}

	public String getCommodityname()
	{
		return commodityname;
	}

	public void setCommodityname(String commodityname)
	{
		this.commodityname = commodityname;
	}

}
