package com.banyan.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.banyuan.service.ChangeRightService;
import com.banyuan.service.impl.ChangeRightServiceImpl;
import com.banyuan.util.Factory;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class ChangeRight extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textUName;
	private JPasswordField passwordField;
	private JCheckBox chckbx1;
	private JCheckBox chckbx2;
	private JCheckBox chckbx3;
	private JComboBox comboBox_1;
	private static DefaultComboBoxModel dcb;
	private static ChangeRight changeRight = new ChangeRight();

//	private ChangeRightService crs = new Factory<ChangeRightService>().getInstance("changeRightSer");
	public static ChangeRight getInstance() {
		return changeRight;
	}
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ChangeRight frame = new ChangeRight();
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
	ChangeRight() {
		setTitle("修改用户权限");
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 710, 407);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("用户名：");
		lblNewLabel.setBounds(58, 49, 61, 16);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("密码：");
		lblNewLabel_1.setBounds(58, 106, 61, 16);
		panel.add(lblNewLabel_1);

		JLabel label = new JLabel("权限：");
		label.setBounds(58, 161, 61, 16);
		panel.add(label);

		JLabel label_1 = new JLabel("选择修改用户：");
		label_1.setBounds(28, 213, 91, 16);
		panel.add(label_1);

		textUName = new JTextField();
		textUName.setBounds(162, 44, 262, 26);
		panel.add(textUName);
		textUName.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(162, 101, 262, 26);
		panel.add(passwordField);

		// 下拉框获取数据
		ChangeRightService crs = new ChangeRightServiceImpl();
		dcb = new DefaultComboBoxModel();
		List list = crs.getInfo();
		for (int i = 0; i < list.size(); i++) {
			dcb.addElement(list.get(i));
		}
		comboBox_1 = new JComboBox(dcb);
		comboBox_1.setBounds(162, 209, 262, 27);
		
		panel.add(comboBox_1);		
		JButton btnUpdate = new JButton("修改");
		btnUpdate.setBounds(459, 315, 117, 29);
		panel.add(btnUpdate);
		btnUpdate.addActionListener(this);

		chckbx1 = new JCheckBox("系统管理员");
		chckbx1.setBounds(162, 157, 128, 23);
		panel.add(chckbx1);
		chckbx1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (chckbx1.isSelected()) {
					chckbx2.setVisible(false);
					chckbx3.setVisible(false);
				} else {
					chckbx2.setVisible(true);
					chckbx3.setVisible(true);
				}
			}
		});

		chckbx2 = new JCheckBox("销售员");
		chckbx2.setBounds(310, 157, 128, 23);
		panel.add(chckbx2);

		chckbx3 = new JCheckBox("库存管理员");
		chckbx3.setBounds(434, 157, 128, 23);
		panel.add(chckbx3);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String uname = textUName.getText();
		String upwd = passwordField.getText();
		ChangeRightService crs = new ChangeRightServiceImpl();
		int i = crs.login(uname, upwd);
		// 弹窗提示
		if (i == -1) {
			JOptionPane.showMessageDialog(null, "用户名密码不能为空");
		} else if (i == 1) {
			JOptionPane.showMessageDialog(null, "用户名密码错误");
		} else if (i == 2) {
			JOptionPane.showMessageDialog(null, "用户权限不够");
		} else {
			if (!chckbx1.isSelected() && !chckbx2.isSelected() && !chckbx3.isSelected()) {
				JOptionPane.showMessageDialog(null, "请选择权限");
			} else {

				String name = (String) comboBox_1.getSelectedItem();
				if (chckbx2.isSelected() && chckbx3.isSelected()) {
					int j = crs.updateRight("2,3", name);
					if (j > 0) {
						JOptionPane.showMessageDialog(null, "权限修改成功");
					} else {
						JOptionPane.showMessageDialog(null, "权限修改失败");
					}
				} else if (chckbx2.isSelected() && !chckbx3.isSelected()) {
					int j = crs.updateRight("2", name);
					if (j > 0) {
						JOptionPane.showMessageDialog(null, "权限修改成功");
					} else {
						JOptionPane.showMessageDialog(null, "权限修改失败");
					}
				} else if (chckbx3.isSelected() && !chckbx2.isSelected()) {
					int j = crs.updateRight("3", name);
					if (j > 0) {
						JOptionPane.showMessageDialog(null, "权限修改成功");
					} else {
						JOptionPane.showMessageDialog(null, "权限修改失败");
					}
				} else if (chckbx1.isSelected()) {
					int j = crs.updateRight("1", name);
					if (j > 0) {
						JOptionPane.showMessageDialog(null, "权限修改成功");
					} else {
						JOptionPane.showMessageDialog(null, "权限修改失败");
					}
				}
			}
			textUName.setText("");
			passwordField.setText("");
		}
	}

	public DefaultComboBoxModel getDcb() {
		return dcb;
	}
	
	public static void flush() {
		dcb.removeAllElements();
		List list = new ChangeRightServiceImpl().getInfo();
		for (int i = 0; i < list.size(); i++) {
			dcb.addElement(list.get(i));
			System.out.println(list.get(i));
		}
	}
}
