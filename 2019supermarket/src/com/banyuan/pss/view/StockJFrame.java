/**
 * 
 */
package com.banyuan.pss.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author edz
 *2019年9月21日 上午9:17:09
 * 
 */
public class StockJFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField stNumber;
	private JTextField stAmount;
	private JTextField stTime;
	private JTextField stStaff;
	private JTextField stSum;
	private JTextField stMoney;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockJFrame frame = new StockJFrame();
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
	public StockJFrame() {
		setTitle("进货单");
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
		table.setBounds(198, 39, 1, 1);
		panel.add(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(29, 6, 758, 155);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("添加");
		btnNewButton.setBounds(76, 106, 117, 29);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("入库");
		btnNewButton_1.setBounds(323, 106, 117, 29);
		panel_1.add(btnNewButton_1);
		
		JButton button = new JButton("放弃入库");
		button.setBounds(590, 106, 117, 29);
		panel_1.add(button);
		
		JLabel label = new JLabel("商品编号");
		label.setBounds(24, 16, 61, 16);
		panel_1.add(label);
		
		stNumber = new JTextField();
		stNumber.setBounds(105, 11, 130, 26);
		panel_1.add(stNumber);
		stNumber.setColumns(10);
		
		JLabel label_1 = new JLabel("商品数量");
		label_1.setBounds(267, 16, 61, 16);
		panel_1.add(label_1);
		
		stAmount = new JTextField();
		stAmount.setBounds(340, 11, 130, 26);
		panel_1.add(stAmount);
		stAmount.setColumns(10);
		
		JLabel label_2 = new JLabel("入库时间");
		label_2.setBounds(482, 16, 61, 16);
		panel_1.add(label_2);
		
		stTime = new JTextField();
		stTime.setBounds(574, 11, 163, 26);
		panel_1.add(stTime);
		stTime.setColumns(10);
		
		JLabel label_3 = new JLabel("进货员");
		label_3.setBounds(24, 61, 61, 16);
		panel_1.add(label_3);
		
		stStaff = new JTextField();
		stStaff.setBounds(105, 56, 130, 26);
		panel_1.add(stStaff);
		stStaff.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("货品总数");
		lblNewLabel.setBounds(267, 61, 61, 16);
		panel_1.add(lblNewLabel);
		
		stSum = new JTextField();
		stSum.setBounds(340, 56, 130, 26);
		panel_1.add(stSum);
		stSum.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("合计金额");
		lblNewLabel_1.setBounds(482, 61, 61, 16);
		panel_1.add(lblNewLabel_1);
		
		stMoney = new JTextField();
		stMoney.setBounds(574, 56, 163, 26);
		panel_1.add(stMoney);
		stMoney.setColumns(10);
	}
}
