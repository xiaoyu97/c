package com.banyan.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.banyuan.service.JfService;
import com.banyuan.service.SupplierSqlService;

import com.banyuan.util.MyFactory;
import javax.swing.JComboBox;

public class ProviderTable extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable table;
	private Vector data;
	private Vector colName;
	private JComboBox comboBox;
	private DefaultTableModel ds;
	SupplierSqlService sql = (SupplierSqlService) MyFactory.getInstance("SupplierSqlService");
	JfService js = (JfService) MyFactory.getInstance("JfService");

	private static ProviderTable provider = new ProviderTable();
	private JTextField tex;

	public static ProviderTable getJf() {
		return provider;
	}

	/**
	 * Create the frame.
	 */
	private ProviderTable() {
		setVisible(true);
		setTitle("供应商信息表");
		setResizable(false);
		setSize(796, 517);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(30, 102, 733, 359);
		contentPane.add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 721, 347);
		panel.add(scrollPane);

//		StudentService ss=new StudentServiceImpl();

		colName = new Vector();
		colName.add("供应商编号");
		colName.add("供应商名字");
		colName.add("地址");
		colName.add("电话");
		data = sql.getAllData();

		ds = new DefaultTableModel(data, colName);
		table = new JTable(ds);
		scrollPane.setViewportView(table);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(30, 26, 733, 68);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JButton btnQuery = new JButton("查询");
		btnQuery.addActionListener(this);
		btnQuery.setBounds(580, 19, 117, 29);
		panel_1.add(btnQuery);

		comboBox = new JComboBox();
		comboBox.setBounds(158, 20, 130, 27);
		panel_1.add(comboBox);
		comboBox.addItem("供应商名字");
		comboBox.addItem("供应商地址");
		comboBox.addItem("显示全部");

		tex = new JTextField();
		tex.setBounds(438, 19, 130, 26);
		panel_1.add(tex);
		tex.setColumns(10);

		JLabel lblNewLabel = new JLabel("查询内容");
		lblNewLabel.setBounds(68, 24, 61, 16);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("查询条件");
		lblNewLabel_1.setBounds(353, 24, 61, 16);
		panel_1.add(lblNewLabel_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		boolean flag = Pattern.matches("^$|", tex.getText());
		String s = comboBox.getSelectedItem().toString();
		System.out.println(s);
		if (!flag) {
			if (s.equals("供应商名字")) {
				data = sql.getNameData(tex.getText());
//				System.out.println(data);
				js.isNull(data);
				ds.setDataVector(data, colName);
			} else if (s.equals("供应商地址")) {
				data = sql.getAdderData(tex.getText());
//				System.out.println(data);
				js.isNull(data);
				ds.setDataVector(data, colName);
			} else {
				data = sql.getAllData();
				ds.setDataVector(data, colName);
				
			}

		} else {
			JOptionPane.showMessageDialog(null, "请输入查询的条件");
		}
	}
}
