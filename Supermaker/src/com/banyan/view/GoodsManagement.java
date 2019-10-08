package com.banyan.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.banyuan.dao.GoodsSqlDao;
import com.banyuan.service.GoodsSqlService;
import com.banyuan.service.JfService;
import com.banyuan.service.SupplierSqlService;
import com.banyuan.util.MyFactory;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GoodsManagement extends JFrame implements ActionListener {

	private JPanel contentPane;

	private JTextField tF1Goods_1;
	private JTextField tF1Goods_8;
	private JTextField tF1Goods_5;
	private JTextField tF1Goods_9;
	private JTextField tF1Goods_6;
	private JTextField tF1Goods_7;
	private JTextField tF2Goods_1;
	private JTextField tF2Goods_8;
	private JTextField tF2Goods_5;
	private JTextField tF2Goods_9;
	private JTextField tF2Goods_6;
	private JTextField tF2Goods_7;
	private JComboBox cB2Goods_4;
	private JComboBox cB2Goods_3;
	private JComboBox cB1Goods_4;
	private JComboBox cB1Goods_3;
	private JComboBox cB_id;
	private DefaultComboBoxModel db;
	private DefaultComboBoxModel db2;
private DefaultComboBoxModel cb1;
	private SupplierSqlService sql2 = (SupplierSqlService) MyFactory.getInstance("SupplierSqlService");
	private GoodsSqlService sql = (GoodsSqlService) MyFactory.getInstance("GoodsSqlService");
	private JfService js = (JfService) MyFactory.getInstance("JfService");
	private static GoodsManagement gmJf = new GoodsManagement();
	private JTextField tF1_id;
	private Map name = js.getPro();
	private Vector unit = js.getUnit();
	private Vector comid=sql.getComId();

	public static GoodsManagement getJf() {
		return gmJf;
	}

	public GoodsManagement() {
		Vector proItem = sql2.getName();
		
		db = new DefaultComboBoxModel(proItem);
		db2 = new DefaultComboBoxModel(unit);

		Map pro = new HashMap<Integer, String>();
//		Vector name=sql.getproName();
//		System.out.println(name);
		setBackground(Color.WHITE);
		setTitle("商品信息管理");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 6, 483, 464);
		contentPane.add(tabbedPane_1);

		JPanel pGoods_add = new JPanel();
		pGoods_add.setLayout(null);
		pGoods_add.setBounds(0, 0, 480, 256);
		// contentPane.add(p_add);
		tabbedPane_1.add("添加商品信息", pGoods_add);

		JLabel label_3 = new JLabel("商品名称");
		label_3.setBounds(20, 32, 72, 16);
		pGoods_add.add(label_3);

		JLabel label_4 = new JLabel("供应商名称");
		label_4.setBounds(20, 73, 72, 16);
		pGoods_add.add(label_4);

		JLabel label_5 = new JLabel("单位");
		label_5.setBounds(20, 114, 72, 16);
		pGoods_add.add(label_5);

		tF1Goods_1 = new JTextField();
	
		tF1Goods_1.setColumns(10);
		tF1Goods_1.setBounds(120, 27, 243, 26);
		pGoods_add.add(tF1Goods_1);

		cB1Goods_3 = new JComboBox(db);
		cB1Goods_3.setBounds(120, 69, 243, 27);
		pGoods_add.add(cB1Goods_3);

		JButton btGoods_add = new JButton("添加");
		btGoods_add.setBackground(SystemColor.textHighlight);
		btGoods_add.setBounds(138, 314, 75, 29);
		pGoods_add.add(btGoods_add);
		btGoods_add.addActionListener(this);

		JButton bt1Goods_c = new JButton("重置");

		bt1Goods_c.setBackground(SystemColor.textHighlight);
		bt1Goods_c.setBounds(245, 314, 75, 29);
		pGoods_add.add(bt1Goods_c);
		bt1Goods_c.addActionListener(this);

		tF1Goods_8 = new JTextField();
		tF1Goods_8.setColumns(10);
		tF1Goods_8.setBounds(120, 225, 243, 26);
		pGoods_add.add(tF1Goods_8);

		tF1Goods_5 = new JTextField();
		tF1Goods_5.setColumns(10);
		tF1Goods_5.setBounds(120, 147, 243, 26);
		pGoods_add.add(tF1Goods_5);

		cB1Goods_4 = new JComboBox(db2);
		cB1Goods_4.setBounds(120, 110, 243, 27);
		pGoods_add.add(cB1Goods_4);

		tF1Goods_9 = new JTextField();
		tF1Goods_9.setColumns(10);
		tF1Goods_9.setBounds(120, 263, 243, 26);
		pGoods_add.add(tF1Goods_9);

		JLabel lblNewLabel_1 = new JLabel("数量下限");
		lblNewLabel_1.setBounds(20, 152, 61, 16);
		pGoods_add.add(lblNewLabel_1);

		JLabel label_7 = new JLabel("进货价");
		label_7.setBounds(20, 192, 61, 16);
		pGoods_add.add(label_7);

		tF1Goods_6 = new JTextField();
		tF1Goods_6.setBounds(120, 187, 75, 26);
		pGoods_add.add(tF1Goods_6);
		tF1Goods_6.setColumns(10);

		tF1Goods_7 = new JTextField();
		tF1Goods_7.setBounds(278, 187, 84, 26);
		pGoods_add.add(tF1Goods_7);
		tF1Goods_7.setColumns(10);

		JLabel label_8 = new JLabel("销售价");
		label_8.setBounds(222, 192, 61, 16);
		pGoods_add.add(label_8);

		JLabel lblNewLabel_2 = new JLabel("有效期(天数)");
		lblNewLabel_2.setBounds(20, 230, 88, 16);
		pGoods_add.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("生产日期");
		lblNewLabel_3.setBounds(20, 268, 61, 16);
		pGoods_add.add(lblNewLabel_3);

		tF1_id = new JTextField();
		tF1_id.setBounds(393, 27, 35, 26);
		pGoods_add.add(tF1_id);
		tF1_id.setColumns(10);

		JLabel label = new JLabel("编号");
		label.setBounds(367, 32, 61, 16);
		pGoods_add.add(label);

		JPanel pGoods_updata = new JPanel();
		pGoods_updata.setLayout(null);
		tabbedPane_1.addTab("修改商品信息", null, pGoods_updata, null);

		JLabel label_10 = new JLabel("商品名称");
		label_10.setBounds(20, 32, 72, 16);
		pGoods_updata.add(label_10);

		JLabel label_11 = new JLabel("供应商名称");
		label_11.setBounds(20, 73, 72, 16);
		pGoods_updata.add(label_11);

		JLabel label_12 = new JLabel("单位");
		label_12.setBounds(20, 114, 72, 16);
		pGoods_updata.add(label_12);

		tF2Goods_1 = new JTextField();
		tF2Goods_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("运行");
				 Vector goodname=sql.getNameData((Integer)cb1.getSelectedItem());
				String goods=(String) goodname.get(0);
//				System.out.println(goods);
				tF2Goods_1.setText(goods);
			}
		});
		tF2Goods_1.setColumns(10);
		tF2Goods_1.setBounds(120, 27, 243, 26);
		pGoods_updata.add(tF2Goods_1);

		cB2Goods_4 = new JComboBox(db2);
		cB2Goods_4.setBounds(120, 110, 243, 27);
		pGoods_updata.add(cB2Goods_4);

		JButton btGoods_updata = new JButton("修改");
		btGoods_updata.setBackground(SystemColor.textHighlight);
		btGoods_updata.setBounds(120, 358, 75, 29);
		pGoods_updata.add(btGoods_updata);
		btGoods_updata.addActionListener(this);

		JButton bt2Goods_c = new JButton("重置");
		bt2Goods_c.setBackground(SystemColor.textHighlight);
		bt2Goods_c.setBounds(201, 358, 75, 29);
		pGoods_updata.add(bt2Goods_c);
		bt2Goods_c.addActionListener(this);
		bt2Goods_c.setActionCommand("重置2");

		JButton btGoods_del = new JButton("删除");
		btGoods_del.setBackground(SystemColor.textHighlight);
		btGoods_del.setBounds(288, 358, 75, 29);
		pGoods_updata.add(btGoods_del);
		btGoods_del.addActionListener(this);

		tF2Goods_8 = new JTextField();
		tF2Goods_8.setColumns(10);
		tF2Goods_8.setBounds(120, 225, 243, 26);
		pGoods_updata.add(tF2Goods_8);

		tF2Goods_5 = new JTextField();
		tF2Goods_5.setColumns(10);
		tF2Goods_5.setBounds(120, 150, 243, 26);
		pGoods_updata.add(tF2Goods_5);

		cB2Goods_3 = new JComboBox(db);
		cB2Goods_3.setBounds(120, 73, 243, 27);
		pGoods_updata.add(cB2Goods_3);

		tF2Goods_9 = new JTextField();
		tF2Goods_9.setColumns(10);
		tF2Goods_9.setBounds(120, 268, 243, 26);
		pGoods_updata.add(tF2Goods_9);

		JLabel label_14 = new JLabel("数量下限");
		label_14.setBounds(20, 155, 61, 16);
		pGoods_updata.add(label_14);

		JLabel label_15 = new JLabel("进货价");
		label_15.setBounds(20, 193, 61, 16);
		pGoods_updata.add(label_15);

		tF2Goods_6 = new JTextField();
		tF2Goods_6.setColumns(10);
		tF2Goods_6.setBounds(120, 188, 75, 26);
		pGoods_updata.add(tF2Goods_6);

		tF2Goods_7 = new JTextField();
		tF2Goods_7.setColumns(10);
		tF2Goods_7.setBounds(279, 188, 84, 26);
		pGoods_updata.add(tF2Goods_7);

		JLabel label_16 = new JLabel("销售价");
		label_16.setBounds(225, 192, 61, 16);
		pGoods_updata.add(label_16);

		JLabel label_17 = new JLabel("有效期(天数)");
		label_17.setBounds(20, 230, 88, 16);
		pGoods_updata.add(label_17);

		JLabel label_18 = new JLabel("生产日期");
		label_18.setBounds(20, 273, 61, 16);
		pGoods_updata.add(label_18);

		JLabel lblNewLabel = new JLabel("编号");
		lblNewLabel.setBounds(364, 32, 33, 16);
		pGoods_updata.add(lblNewLabel);
		  
		
		cb1=new DefaultComboBoxModel(comid);
		 cB_id = new JComboBox(cb1);
		cB_id.setBounds(393, 28, 63, 27);
		pGoods_updata.add(cB_id);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
//	System.out.println("1"+comid);
		String s = e.getActionCommand();
		boolean p = false;
		
		
		String proname = String.valueOf(cB1Goods_3.getSelectedItem());
//		System.out.println(proname);
		int id=(Integer)name.get(proname);
		
		String proname2 = String.valueOf(cB2Goods_3.getSelectedItem());
//		System.out.println(proname2);
		int id2=(Integer)name.get(proname2);
//		System.out.println(id2);
		
		if (s.equals("添加")) {
//			Pattern(tF1Goods_1.getText(),tF1Goods_5.getText(),tF1Goods_6.getText(),tF1Goods_7.getText(),tF1Goods_8.getText(),tF1Goods_9.getText());
			p = js.Pattern(tF1Goods_1.getText(), tF1_id.getText(),tF1Goods_5.getText(), tF1Goods_6.getText(), tF1Goods_7.getText(),
					tF1Goods_8.getText(), tF1Goods_9.getText(), p);
			boolean x=	js.ishas(comid, Integer.valueOf(tF1_id.getText()), true);
			if (p&&x) {
				sql.add(Integer.valueOf(tF1_id.getText()), tF1Goods_1.getText(), id, proname,
						String.valueOf(cB1Goods_4.getSelectedItem()), Integer.valueOf(tF1Goods_5.getText()),
						Double.valueOf(tF1Goods_6.getText()), Double.valueOf(tF1Goods_7.getText()),
						Integer.valueOf(tF1Goods_8.getText()), tF1Goods_9.getText());
				JOptionPane.showMessageDialog(null, "添加成功");
			}
		}

		if (s.equals("删除")) {

			sql.del(tF2Goods_1.getText());
			JOptionPane.showMessageDialog(null, "删除成功");
		}
		if (s.equals("修改")) {
			p = js.Pattern(tF2Goods_1.getText(), String.valueOf(cB_id.getSelectedItem()),tF2Goods_5.getText(), tF2Goods_6.getText(), tF2Goods_7.getText(),
					tF2Goods_8.getText(), tF2Goods_9.getText(), p);
			
			if(p) {
				System.out.println(s);
				
//				System.out.println(Integer.valueOf(tF1_id.getText())
////						+ tF1Goods_1.getText()+id2+proname2
//						+String.valueOf(cB1Goods_4.getSelectedItem())+Integer.valueOf(tF1Goods_5.getText())+
//						Double.valueOf(tF1Goods_6.getText())+Double.valueOf(tF1Goods_7.getText())+
//						Integer.valueOf(tF1Goods_8.getText())+tF1Goods_9.getText());
				
				sql.upData((Integer)(cB_id.getSelectedItem()), tF2Goods_1.getText(), id2, proname2,
						String.valueOf(cB2Goods_4.getSelectedItem()), Integer.valueOf(tF2Goods_5.getText()),
						Double.valueOf(tF2Goods_6.getText()), Double.valueOf(tF2Goods_7.getText()),
						Integer.valueOf(tF2Goods_8.getText()), tF2Goods_9.getText());
				JOptionPane.showMessageDialog(null, "修改成功");
			}
		}
		if (s.equals("重置")) {

			js.setClean(tF1Goods_1, tF1Goods_5, tF1Goods_6, tF1Goods_7, tF1Goods_8, tF1Goods_9);
		}
		if (s.equals("重置2")) {
			js.setClean(tF2Goods_1, tF2Goods_5, tF2Goods_6, tF2Goods_7, tF2Goods_8, tF2Goods_9);
			System.out.println(s);
		}
	}

}
