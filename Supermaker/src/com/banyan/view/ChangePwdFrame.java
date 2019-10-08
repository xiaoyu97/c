package com.banyan.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.banyuan.service.ChangePwdService;
import com.banyuan.service.impl.ChangePwdServiceImpl;
import com.banyuan.util.Factory;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class ChangePwdFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textUName;
	private JPasswordField textOPwd;
	private JPasswordField textNPwd;
	private JPasswordField textRPwd;
	private static ChangePwdFrame changePwd=new ChangePwdFrame();
//	private ChangePwdService chp = new Factory<ChangePwdService>().getInstance("changePwdSer");
	
	/**
	 * Create the frame.
	 */
	private ChangePwdFrame() {
		setTitle("修改密码");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 741, 449);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("登录名：");
		lblNewLabel.setBounds(73, 56, 61, 16);
		panel.add(lblNewLabel);
		
		textUName = new JTextField();
		textUName.setBounds(185, 51, 271, 26);
		panel.add(textUName);
		textUName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("旧密码：");
		lblNewLabel_1.setBounds(73, 124, 61, 16);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("新密码：");
		label.setBounds(73, 187, 61, 16);
		panel.add(label);
		
		JLabel lblNewLabel_2 = new JLabel("重新输入密码：");
		lblNewLabel_2.setBounds(73, 251, 107, 16);
		panel.add(lblNewLabel_2);
		
		textOPwd = new JPasswordField();
		textOPwd.setBounds(185, 119, 271, 26);
		panel.add(textOPwd);
		
		textNPwd = new JPasswordField();
		textNPwd.setBounds(185, 182, 271, 26);
		panel.add(textNPwd);
		
		textRPwd = new JPasswordField();
		textRPwd.setBounds(185, 246, 271, 26);
		panel.add(textRPwd);
		
		JButton btnUpdate = new JButton("修改");
		btnUpdate.setBounds(129, 332, 117, 29);
		panel.add(btnUpdate);
		btnUpdate.addActionListener(this);
		
		JButton btnReset = new JButton("重置");
		btnReset.setBounds(400, 332, 117, 29);
		panel.add(btnReset);
		btnReset.addActionListener(this);
		
		JLabel lblNewLabel_3 = new JLabel("提示：只能修改自己的密码。");
		lblNewLabel_3.setBounds(6, 402, 260, 16);
		panel.add(lblNewLabel_3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String method =e.getActionCommand();
		String username=textUName.getText();
		String oldPwd=textOPwd.getText();
		String newPwd=textNPwd.getText();
		String repPwd=textRPwd.getText();
		if(method.equals("修改")) {
			ChangePwdService chp=new ChangePwdServiceImpl();
			int i=chp.login(username, oldPwd);
			if(i==-1) {
				JOptionPane.showMessageDialog(null, "用户名密码不能为空");
			}else if(i==1) {
				JOptionPane.showMessageDialog(null, "用户名或旧密码错误");
			}else {
//				ChangePwdService chp=new ChangePwdServiceImpl();
				int j=chp.changePwd(username,oldPwd ,newPwd,repPwd);
				if(j==2) {
					JOptionPane.showMessageDialog(null, "两次输入的密码不一致");
				}else {
					JOptionPane.showMessageDialog(null, "修改成功");
					textUName.setText("");
					textOPwd.setText("");
					textRPwd.setText("");
					textNPwd.setText("");
				}
			}
		}else {
			textNPwd.setText("");
			textOPwd.setText("");
			textUName.setText("");
			textRPwd.setText("");
		}
	}
	public static ChangePwdFrame getInstance() {
		return changePwd;
	}

}
