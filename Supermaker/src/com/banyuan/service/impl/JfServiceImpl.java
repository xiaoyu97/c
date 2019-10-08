package com.banyuan.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.banyuan.service.JfService;
import com.banyuan.util.BaseDB;

public class JfServiceImpl implements JfService {

	@Override
	public boolean Pattern(String str1, String str2, String str3, boolean p) {
		boolean a = str2.length() == 11;
		if (!Pattern.matches("^$|", str1)) {
			if (str1.length() < 50) {
				if (Pattern.matches("\\d+", str2) && a) {
					if (!Pattern.matches("^$|", str3)) {
						if (str3.length() < 50) {
							p = true;
							showMess("成功");
						} else {
							showMess("地址不应超过50个字符");

						}
					} else {
						showMess("请输入地址");
					}
				} else {
					showMess("请输入11位电话号码");
				}
			} else {
				showMess("供应商名称不能超过50个字符");
			}
		} else {
			showMess("请输入供应商名称");
		}
		return p;

	}

	public boolean Pattern(String str1, String str2,String str5, String str6, String str7, String str8, String str9, boolean p) {
		// 商品名称判断
		boolean a = Pattern.matches("[\\u4e00-\\u9fa5]+", str1);// 是否为中文
		boolean a1 = Pattern.matches("^[\\u4e00-\\u9fa5]{1,15}$", str1);
		boolean a2 = str1.length() > 30;
		boolean a3 = Pattern.matches("^$|", str1);// 是否为空
		if (!a3) {

			if (a) {
				if (!a1) {
					showMess("请不要输入超过15个中文字符的商品");
				} else {
					System.out.println(p);
					p = numPattern(str2,str5, str6, str7, str8, str9, p);
					System.out.println(p);
				}

			} else {
				if (a2) {
					showMess("请不要输入超过30个字符的商品");
				} else {
					p = numPattern(str2,str5, str6, str7, str8, str9, p);
					System.out.println(p);
				}
			}
		} else {
			showMess("请输入商品名称");
		}
		return p;
	}

	public boolean numPattern(String str2,String str5, String str6, String str7, String str8, String str9, boolean p) {
		boolean b1 = Pattern.matches("\\d+.[0,1]\\d", str6)||Pattern.matches("\\d+", str6);
		boolean b2 = Pattern.matches("\\d+.[0,1]\\d", str7)||Pattern.matches("\\d+", str7);;
		if(Pattern.matches("\\d+",str2)){
		if (Pattern.matches("\\d+", str5)) {
			if (b1) {
				if (b2) {
					if (Pattern.matches("\\d+", str8)) {
						if (Integer.valueOf(str8) > 1) {
							if (Pattern.matches("^[1-9][0-9]{3}-(0[1-9]|1[0-2])-([0-2][1-9]|3[0-1])$", str9)) {
								SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
								boolean d = true;
								try {
									Date day = ft.parse(str9);
									d = day.after(new Date());
								} catch (ParseException e) {
									e.printStackTrace();
								}
								if (!d) {
									p = true;
									
								} else {
									showMess("请输入当前日期之前的日期");
								}
							} else {
								showMess("请按2019-01-01格式输入正确格式日期");
							}
						} else {
							showMess("有效天数必须大于0" + "\n" + "请抵制无良商家");
						}
					} else {
						showMess("请输入正确的有效天数");
					}

				} else {
					showMess("请输入正确的销售价" + "\n" + "保留两位小数");
				}
			} else {
				showMess("请输入正确的进货价" + "\n" + "保留两位小数");
			}

		} else {
			showMess("请输入正确的数量下限");
		}}else {
			showMess("请输入商品id");
		}
		return p;
	}

	@Override
	public void setClean(JTextField... args) {
		for (int i = 0; i < args.length; i++) {
			args[i].setText(null);
		}

	}

	@Override
	public void isNull(Vector data) {
		System.out.println(data.size());
		if (data.size() == 0) {
			showMess("查询信息不存在");
		}

	}

	// 弹窗
	public void showMess(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	@Override
	public Vector getUnit() {
		Vector unit = new Vector();
		unit.add("包");
		unit.add("本");
		unit.add("箱");
		unit.add("袋");
		unit.add("斤");
		unit.add("瓶");
		unit.add("其他");
		return unit;
	}

	@Override
	public Map getPro() {
		BaseDB db = new BaseDB();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Map name = new HashMap();
		try {
			conn = db.getConnect();
			String sql = "select providernumber,providername from provider";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				name.put(rs.getObject(2), rs.getObject(1));
//				System.out.println(rs.getObject(1));
//				System.out.println(rs.getObject(2));
			}
			System.out.println("集合" + name);
		}

		catch (SQLException e) {

			e.printStackTrace();
		} finally {
			db.DBClose(conn, ps, null);
		}
		return name;
	}

	@Override
	public boolean ishas(Vector idVector, int id, boolean v) {
		for (int i = 0; i < idVector.size(); i++) {
			System.out.println("====="+((Integer)(idVector.get(i))));
			System.out.println("+++++"+id);
			if (((Integer)(idVector.get(i)))==id) {
				v=false;
				break;
			
			}
			}
		if(!v) {
			showMess("商品编号已存在请重新输入");
		}
		return v;
	}
}
