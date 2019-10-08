package com.banyan.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.banyuan.service.impl.QuerryServiceImpl;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Query extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JComboBox comboBox;
	private Vector data;
	private Vector colName;
	private DefaultTableModel dt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Query frame = new Query();
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
	public Query() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 6, 820, 400);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("请选择查询条件：");
		lblNewLabel.setBounds(6, 48, 113, 16);
		panel.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.addItem("入库编号");
		comboBox.addItem("商品名称");
		comboBox.addItem("商品编号");
		comboBox.addItem("单位");
		comboBox.addItem("价格");
		comboBox.addItem("入库时间");
		comboBox.addItem("供应商");
		comboBox.addItem("操作员");
		comboBox.addItem("数量");
		comboBox.setBounds(131, 44, 117, 27);
		panel.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(260, 43, 223, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnQueryOne = new JButton("查询");
		btnQueryOne.setBounds(509, 43, 117, 29);
		panel.add(btnQueryOne);
		btnQueryOne.addActionListener(this);
		
		JButton btnQueryAll = new JButton("查询所有");
		btnQueryAll.setBounds(666, 43, 117, 29);
		panel.add(btnQueryAll);
		btnQueryAll.addActionListener(this);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 111, 808, 283);
		panel.add(scrollPane);
		
		
		colName = new Vector();
		colName.add("入库编号");
		colName.add("商品名称");
		colName.add("商品编号");
		colName.add("单位");
		colName.add("价格");
		colName.add("入库时间");		
		colName.add("供应商");		
		colName.add("操作员");		
		colName.add("数量");		
		dt = new DefaultTableModel(data,colName);
		table = new JTable(dt);
		scrollPane.setViewportView(table);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String method = e.getActionCommand();
		if(method.equals("查询")) {
			String str=(String)comboBox.getSelectedItem();
			String con=(String)textField.getText();
			System.out.println(con);
		}else if(method.equals("查询所有")) {
			data = new QuerryServiceImpl().getDate();
			dt.setDataVector(data, colName);
		}
	}
}
