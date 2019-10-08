package com.banyan.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.banyuan.dao.impl.SupplierSqlDaoImpl;
import com.banyuan.service.JfService;
import com.banyuan.service.SupplierSqlService;
import com.banyuan.service.impl.SupplierSqlServiceImpl;
import com.banyuan.util.MyFactory;

import java.awt.Window.Type;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SupplierManagement extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tF2_sup_name;
	private JTextField tF2_sup_tel;
	private JTextField tF2_sup_addr;
	private JTextField tF1_sup_name;
	private JTextField tF1_sup_tel;
	private JTextField tF1_sup_addr;
	private JComboBox cB1_sup;
	DefaultComboBoxModel db;
	private Vector nameItem = new Vector();
	private static SupplierManagement smJf = new SupplierManagement();
	
	SupplierSqlService sql=(SupplierSqlService) MyFactory.getInstance("SupplierSqlService");
	JfService js=(JfService) MyFactory.getInstance("JfService");




	public static SupplierManagement getJf() {
		return smJf;
	}

	public SupplierManagement() {
		setBackground(Color.WHITE);
		setTitle("供应商信息管理");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 6, 495, 282);
		contentPane.add(tabbedPane_1);

		JPanel p_updata = new JPanel();
		p_updata.setLayout(null);
		p_updata.setBounds(0, 0, 480, 256);
		// contentPane.add(p_add);
		tabbedPane_1.add("修改删除供应商信息", p_updata);

		JLabel label_3 = new JLabel("供应商名称");
		label_3.setBounds(20, 32, 72, 16);
		p_updata.add(label_3);

		JLabel label_4 = new JLabel("联系电话");
		label_4.setBounds(20, 73, 72, 16);
		p_updata.add(label_4);

		JLabel label_5 = new JLabel("地址");
		label_5.setBounds(20, 114, 72, 16);
		p_updata.add(label_5);

		JLabel label_6 = new JLabel("选择供应商");
		label_6.setBounds(20, 155, 72, 16);
		p_updata.add(label_6);

		tF1_sup_name = new JTextField();
		tF1_sup_name.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tF1_sup_name.setText(String.valueOf(cB1_sup.getSelectedItem()));
			}
		});
		tF1_sup_name.setColumns(10);
		tF1_sup_name.setBounds(120, 27, 243, 26);
		p_updata.add(tF1_sup_name);

		tF1_sup_tel = new JTextField();
		tF1_sup_tel.setColumns(10);
		tF1_sup_tel.setBounds(120, 68, 243, 26);
		p_updata.add(tF1_sup_tel);

		tF1_sup_addr = new JTextField();
		tF1_sup_addr.setColumns(10);
		tF1_sup_addr.setBounds(120, 109, 243, 26);
		p_updata.add(tF1_sup_addr);
		
		nameItem = sql.getName();

		db = new DefaultComboBoxModel(nameItem);
		cB1_sup = new JComboBox(db);
		cB1_sup.setBounds(120, 151, 243, 27);
		p_updata.add(cB1_sup);

		JButton bt_sup_updata = new JButton("修改");
		bt_sup_updata.setBackground(SystemColor.textHighlight);
		bt_sup_updata.setBounds(128, 190, 75, 29);
		p_updata.add(bt_sup_updata);
		bt_sup_updata.addActionListener(this);

		JButton bt1_sup_c = new JButton("重置");
		bt1_sup_c.setBackground(SystemColor.textHighlight);
		bt1_sup_c.setBounds(202, 190, 75, 29);
		p_updata.add(bt1_sup_c);
		bt1_sup_c.addActionListener(this);

		JButton bt_sup_del = new JButton("删除");

		bt_sup_del.setBackground(SystemColor.textHighlight);
		bt_sup_del.setBounds(275, 190, 75, 29);
		p_updata.add(bt_sup_del);
		bt_sup_del.addActionListener(this);

		JPanel p_add = new JPanel();
		p_add.setBounds(15, 36, 480, 256);
		// contentPane.add(p_updata);
		p_add.setLayout(null);
		tabbedPane_1.add("添加供应商信息", p_add);

		JLabel lblNewLabel = new JLabel("供应商名称");
		lblNewLabel.setBounds(20, 32, 72, 16);
		p_add.add(lblNewLabel);

		JLabel label = new JLabel("联系电话");
		label.setBounds(20, 73, 72, 16);
		p_add.add(label);

		JLabel label_1 = new JLabel("地址");
		label_1.setBounds(20, 114, 72, 16);
		p_add.add(label_1);

		tF2_sup_name = new JTextField();
		tF2_sup_name.setBounds(120, 27, 243, 26);
		p_add.add(tF2_sup_name);
		tF2_sup_name.setColumns(10);

		tF2_sup_tel = new JTextField();
		tF2_sup_tel.setColumns(10);
		tF2_sup_tel.setBounds(120, 68, 243, 26);
		p_add.add(tF2_sup_tel);

		tF2_sup_addr = new JTextField();
		tF2_sup_addr.setColumns(10);
		tF2_sup_addr.setBounds(120, 109, 243, 26);
		p_add.add(tF2_sup_addr);

		JButton bt2_sup_add = new JButton("添加");
		bt2_sup_add.setBackground(SystemColor.textHighlight);
		bt2_sup_add.setBounds(145, 190, 75, 29);
		p_add.add(bt2_sup_add);
		bt2_sup_add.addActionListener(this);

		JButton bt2_sup_c = new JButton("重置");
		bt2_sup_c.setBackground(SystemColor.textHighlight);
		bt2_sup_c.setBounds(253, 190, 75, 29);
		p_add.add(bt2_sup_c);
		bt2_sup_c.addActionListener(this);
		bt2_sup_c.setActionCommand("重置2");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		System.out.println(s);
		boolean p=false;
		if (s.equals("添加")) {
			p=js.Pattern(tF2_sup_name.getText(), tF2_sup_tel.getText(), tF2_sup_addr.getText(), false);
//			System.out.println(s+"=="+p);
			if(p) {
			sql.add(tF2_sup_name.getText(), tF2_sup_addr.getText(), tF2_sup_tel.getText());
			setCbox();
			}
		}
		if (s.equals("删除")) {
			sql.del(cB1_sup.getSelectedItem().toString());
			setCbox();
			}
		
		if (s.equals("修改")) {
			p=js.Pattern(tF1_sup_name.getText(), tF1_sup_tel.getText(), tF1_sup_addr.getText(), false);
			
			if(p) {
			sql.upDate(String.valueOf(cB1_sup.getSelectedItem()), tF1_sup_tel.getText(), tF1_sup_addr.getText(),tF1_sup_name.getText());
			setCbox();
			}
		}
		if (s.equals("重置")) {
			js.setClean(tF1_sup_addr,tF1_sup_name,tF1_sup_tel);

		}
		
		if (s.equals("重置2")) {
			js.setClean(tF2_sup_addr,tF2_sup_name,tF2_sup_tel);

		}
	}

//	public  void Pattern(String str1, String str2, String str3) {
//		boolean a = str2.length() == 11;
//		if (!Pattern.matches("^$|", str1)) {
//			if (str1.length() < 50) {
//				if (Pattern.matches("\\d+", str2) && a) {
//					if (!Pattern.matches("^$|", str3)) {
//						if (str1.length() < 50) {
//							
//						} else {
//							showMess("地址不应超过50个字符");
//
//						}
//					} else {
//						showMess("请输入地址");
//					}
//				} else {
//					showMess("请输入11位电话号码");
//				}
//			} else {
//				showMess("供应商名称不能超过50个字符");
//			}
//		} else {
//			showMess("请输入供应商名称");
//		}
//		
//	}
//
//	// 弹窗
//	public void showMess(String message) {
//		JOptionPane.showMessageDialog(null, message);
//	}

	public void setCbox() {
		db.removeAllElements();
		nameItem = sql.getName();
		for (int i = 0; i < nameItem.size(); i++) {
			db.addElement(nameItem.get(i));
		}

	}
}