package com.banyan.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.banyuan.service.ChangeRightService;
import com.banyuan.service.UserMangerService;
import com.banyuan.service.impl.UserMangerServiceImpl;
import com.banyuan.util.Factory;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class UserManagerFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textUserName1;
	private JPasswordField password1;
	private JTextField textUserName2;
	private JPasswordField password2;
	private Vector data;
	private Vector colName;
	private JTable table;
	private JTable table_1;
	private DefaultTableModel dt;
//	private UserMangerService ums = new Factory<UserMangerService>().getInstance("UserSer");
	private UserMangerService ums=new UserMangerServiceImpl();
	private static UserManagerFrame umf=new UserManagerFrame();
	
	public static UserManagerFrame getinstance() {
		return umf;
	}
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					UserManagerFrame frame = new UserManagerFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	private UserManagerFrame() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 6, 698, 411);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("添加用户", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(6, 6, 663, 260);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 5, 651, 249);
		panel_2.add(scrollPane);
		
		//获取用户数据
		ums = new UserMangerServiceImpl();
		data =ums.getUserData();
		colName=new Vector();
		colName.add("登录名");
		colName.add("密码");
		colName.add("状态");
		colName.add("权限");
		
		dt =new DefaultTableModel(data,colName);
		table = new JTable(dt);
		scrollPane.setViewportView(table);
		
		
		JLabel label = new JLabel("用户名：");
		label.setBounds(6, 294, 61, 16);
		panel.add(label);
		
		textUserName1 = new JTextField();
		textUserName1.setBounds(64, 289, 130, 26);
		panel.add(textUserName1);
		textUserName1.setColumns(10);
		
		JLabel label_1 = new JLabel("密码：");
		label_1.setBounds(302, 294, 61, 16);
		panel.add(label_1);
		
		password1 = new JPasswordField();
		password1.setBounds(361, 289, 138, 26);
		panel.add(password1);
		
		JButton btnAdd = new JButton("添加");
		btnAdd.setBounds(524, 327, 117, 29);
		panel.add(btnAdd);
		
		JButton button = new JButton("刷新");
		button.setBounds(524, 289, 117, 29);
		panel.add(button);
		button.addActionListener(this);
		btnAdd.addActionListener(this);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("删除用户", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 671, 280);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 665, 274);
		panel_3.add(scrollPane_1);
		
		//删除用户表格
		table_1 = new JTable(dt);
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblNewLabel = new JLabel("用户名：");
		lblNewLabel.setBounds(6, 304, 61, 16);
		panel_1.add(lblNewLabel);
		
		textUserName2 = new JTextField();
		textUserName2.setBounds(79, 299, 130, 26);
		panel_1.add(textUserName2);
		textUserName2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("密码：");
		lblNewLabel_1.setBounds(315, 304, 61, 16);
		panel_1.add(lblNewLabel_1);
		
		password2 = new JPasswordField();
		password2.setBounds(388, 299, 155, 26);
		panel_1.add(password2);
		
		JButton btnDelete = new JButton("删除");
		btnDelete.setBounds(541, 330, 117, 29);
		panel_1.add(btnDelete);
		
		JButton button_1 = new JButton("刷新");
		button_1.setBounds(541, 299, 117, 29);
		panel_1.add(button_1);
		button_1.addActionListener(this);
		btnDelete.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String method=e.getActionCommand();
		
		if(method.equals("添加")) {
			String uname=textUserName1.getText();
			String pwd= password1.getText();
			int i=ums.insertUser(uname, pwd);
			if(i==0) {
				JOptionPane.showMessageDialog(null, "用户名密码不能为空");
			}else if(i==-2){
				JOptionPane.showMessageDialog(null, "用户名已存在");
			}else {
				JOptionPane.showMessageDialog(null, "添加成功");
				dt.setDataVector(ums.getUserData(), colName);
			}
			textUserName1.setText("");
			password1.setText("");
		}else if(method.equals("删除")) {
			String uname=textUserName2.getText();
			String pwd=password2.getText();
			int i=ums.delUser(uname, pwd);
			if(i==0) {
				JOptionPane.showMessageDialog(null, "用户名密码不能为空");
			}else if(i==-2) {
				JOptionPane.showMessageDialog(null, "用户名不存在或密码错误");
			}else {
				JOptionPane.showMessageDialog(null, "删除成功");
				dt.setDataVector(ums.getUserData(), colName);
			}
			textUserName2.setText("");
			password2.setText("");
		}else if(method.equals("刷新")) {
			dt.setDataVector(ums.getUserData(), colName);
		}
		ChangeRight.flush();
	}
}
