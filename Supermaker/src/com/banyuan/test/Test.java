package com.banyuan.test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.banyan.view.CommodityTable;
import com.banyan.view.GoodsManagement;
import com.banyan.view.ProviderTable;
import com.banyan.view.SupplierManagement;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("商品信息");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame jf1=GoodsManagement.getJf();
			
				jf1.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(180, 6, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("供应商信息");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame jf=SupplierManagement.getJf();
				jf.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(16, 6, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("查询供应商");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame jf2=ProviderTable.getJf();
				jf2.setVisible(true);
			}
		});
		button.setBounds(16, 47, 117, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("查询商品");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame jFrame=CommodityTable.getJf();
				jFrame.setVisible(true);
			}
		});
		button_1.setBounds(180, 47, 117, 29);
		contentPane.add(button_1);
	}
}
