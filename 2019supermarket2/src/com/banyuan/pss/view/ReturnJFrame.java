/**
 * 
 */
package com.banyuan.pss.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.banyuan.pss.service.impl.ReturnService;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;

/**
 * @author edz
 *2019年9月21日 上午11:57:36
 * 
 */
public class ReturnJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField rtNumber;
	private JTextField rtAmount;
	private JTextField rtStaff;
	private JTextField rtSum;
	private JTextField rtMoney;
	private JTable table;  

	private Vector data;
	private Vector colName;
	private JTextField rtTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReturnJFrame frame = new ReturnJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReturnJFrame() {
		setTitle("退货单");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(29, 184, 767, 267);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 755, 255);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(29, 6, 758, 155);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("退货");
		btnNewButton_1.setBounds(161, 106, 117, 29);
		panel_1.add(btnNewButton_1);
		
		JButton button = new JButton("放弃退货");
		button.setBounds(426, 106, 117, 29);
		panel_1.add(button);
		
		
		ReturnService ss=new ReturnService();
		data = ss.getData();
		colName = new Vector();
		colName.add("退货编号");
		colName.add("商品名称");
		colName.add("商品编号");
		colName.add("价格");
		colName.add("退货时间");
		colName.add("供应商名称");
		colName.add("售货员");
		colName.add("退货数量");
		colName.add("单位");

		table = new JTable(data, colName);
		scrollPane.setViewportView(table);
		
		
		
		JLabel label = new JLabel("商品名称");
		label.setBounds(24, 16, 61, 16);
		panel_1.add(label);
		
		rtNumber = new JTextField();
		rtNumber.setBounds(105, 11, 130, 26);
		panel_1.add(rtNumber);
		rtNumber.setColumns(10);
		
		JLabel label_1 = new JLabel("商品价格");
		label_1.setBounds(267, 16, 61, 16);
		panel_1.add(label_1);
		
		rtAmount = new JTextField();
		rtAmount.setBounds(340, 11, 130, 26);
		panel_1.add(rtAmount);
		rtAmount.setColumns(10);
		
		JLabel label_2 = new JLabel("退货时间");
		label_2.setBounds(482, 16, 61, 16);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("销售员");
		label_3.setBounds(24, 61, 61, 16);
		panel_1.add(label_3);
		
		rtStaff = new JTextField();
		rtStaff.setEditable(false);
		rtStaff.setBounds(105, 56, 130, 26);
		panel_1.add(rtStaff);
		rtStaff.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("退货总数");
		lblNewLabel.setBounds(267, 61, 61, 16);
		panel_1.add(lblNewLabel);
		
		rtSum = new JTextField();
		rtSum.setBounds(340, 56, 130, 26);
		panel_1.add(rtSum);
		rtSum.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("合计金额");
		lblNewLabel_1.setBounds(482, 61, 61, 16);
		panel_1.add(lblNewLabel_1);
		
		rtMoney = new JTextField();
		rtMoney.setBounds(574, 56, 163, 26);
		panel_1.add(rtMoney);
		rtMoney.setColumns(10);
		
		
		rtTime = new JTextField();
		rtTime.setBounds(574, 11, 163, 26);
		panel_1.add(rtTime);
		rtTime.setColumns(10);
		
		//启动线程
		Mythread mt=new Mythread(rtTime);//传入JLabel
		Thread t=new Thread(mt);
		t.start();//调用start方法，运行线程
		
		
}
	
}
