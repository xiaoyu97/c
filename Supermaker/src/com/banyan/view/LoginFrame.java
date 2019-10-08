package com.banyan.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.banyuan.service.LoginService;

import com.banyuan.util.Factory;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class LoginFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private LoginService loginservice = (LoginService) new Factory().getInstance("LoginSer");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setResizable(false);
		setTitle("小型超市管理系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 663, 424);
		setSize(663, 424);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBounds(0, 0, 663, 402);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("用户名：");
		lblNewLabel.setBounds(110, 106, 61, 16);
		panel.add(lblNewLabel);

		textUsername = new JTextField();
		textUsername.setBounds(230, 101, 225, 26);
		panel.add(textUsername);
		textUsername.setColumns(10);

		JLabel label = new JLabel("密码：");
		label.setBounds(110, 212, 61, 16);
		panel.add(label);

		JButton btnNewButton = new JButton("登陆");
		btnNewButton.setBounds(100, 311, 117, 29);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(this);

		JButton btnNewButton_1 = new JButton("重置");
		btnNewButton_1.setBounds(282, 311, 117, 29);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);

		JButton button = new JButton("退出");
		button.setBounds(468, 311, 117, 29);
		panel.add(button);
		button.addActionListener(this);

		textPassword = new JPasswordField();
		textPassword.setBounds(232, 206, 220, 26);
		panel.add(textPassword);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("/Users/edz/Downloads/1.jpeg"));
		label_1.setBounds(0, -31, 690, 501);
		panel.add(label_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String method = e.getActionCommand();
		if (method.equals("登陆")) {
			String username = textUsername.getText();
			String password = textPassword.getText();

//			LoginService loginservice = new LoginServiceImpl();
			// 根据操作符给出对应的窗口
			int i = loginservice.login(username, password);
			if (i == -1) {
				JOptionPane.showMessageDialog(null, "用户名密码不能为空");
			} else if (i == 1) {
				JOptionPane.showMessageDialog(null, "用户名密码错误");
			} else {
				if (i == 2) {
					MainFrame mf = new MainFrame(username,password); // 销售和库存管理权限
					setVisible(false);
					mf.userbtn.setVisible(false);
					mf.limitsbtn.setVisible(false);
				} else if (i == 3) {
					MainFrame mf = new MainFrame(username,password);// 超级管理员
					setVisible(false);
				} else if (i == 4) {
					MainFrame mf = new MainFrame(username,password);// 库存管理员
					mf.tabbedPane.remove(mf.getBasicInfo());
					mf.tabbedPane.remove(mf.getSale());
					mf.userbtn.setVisible(false);
					mf.limitsbtn.setVisible(false);
					setVisible(false);
				} else if (i == 5) {
					MainFrame mf = new MainFrame(username,password);// 销售员
					mf.tabbedPane.remove(mf.getBasicInfo());
					mf.tabbedPane.remove(mf.getState());
					mf.userbtn.setVisible(false);
					mf.limitsbtn.setVisible(false);
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "请管理员赋予权限");
				}
			}
		} else if (method.equals("重置")) {
			textUsername.setText("");
			textPassword.setText("");
		} else if (method.equals("退出")) {
			System.exit(0);
		}
	}
}
