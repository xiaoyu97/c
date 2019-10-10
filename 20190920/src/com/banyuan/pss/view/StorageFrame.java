/**
 * 
 */
package com.banyuan.pss.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
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
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.banyuan.pss.entity.Sell;
import com.banyuan.pss.service.SellService;
import com.banyuan.pss.util.MyFactory;
import javax.swing.JComboBox;

public class StorageFrame extends JFrame {

	SellService service = (SellService) MyFactory.getInstance("sellService");
	private JPanel contentPane;
	private JTextField tf_ComId;
	private JTextField tf_Operator;
	private JTable table;
	private DefaultTableModel tm;
	private Vector data;
	private JLabel lbl_Money;

	private JLabel lbl_Num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StorageFrame frame = new StorageFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StorageFrame() {
		setResizable(false);
//		System.out.println("==SellFrame()===");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 300, 654, 502);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(19, 135, 615, 326);
		contentPane.add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 603, 303);
		panel.add(scrollPane);

		Vector colname = new Vector();
		colname.add("商品名称");
		colname.add("商品编号");
		colname.add("入库时间");
		colname.add("数量");
		colname.add("单价");
		colname.add("入库员");
		colname.add("入库编号");

		data = new Vector();

		Vector v = new Vector();

		Vector v2 = new Vector();

		tm = new DefaultTableModel(data, colname);

		table = new JTable(tm);
		scrollPane.setViewportView(table);


		JPanel panel_1 = new JPanel();
		panel_1.setBounds(19, 6, 615, 117);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lbl = new JLabel("商品编号");
		lbl.setBounds(28, 6, 61, 16);
		panel_1.add(lbl);

		tf_ComId = new JTextField();
		tf_ComId.setBounds(96, 1, 69, 26);
		panel_1.add(tf_ComId);
		tf_ComId.setColumns(10);

		JLabel label = new JLabel("付款方式");
		label.setBounds(190, 6, 61, 16);
		panel_1.add(label);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(263, 2, 95, 27);
		comboBox.addItem("现金");
		comboBox.addItem("支付宝");
		comboBox.addItem("微信");
		comboBox.addItem("网银");
		this.setVisible(true);	
		panel_1.add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("入库时间");
		lblNewLabel_1.setBounds(370, 6, 61, 16);
		panel_1.add(lblNewLabel_1);

		JLabel label_1 = new JLabel("入库员");
		label_1.setBounds(28, 54, 61, 16);
		panel_1.add(label_1);

		tf_Operator = new JTextField();
		tf_Operator.setEditable(false);
		tf_Operator.setBounds(94, 49, 61, 26);
		panel_1.add(tf_Operator);
		tf_Operator.setColumns(10);

		JLabel label_2 = new JLabel("货物总量");
		label_2.setBounds(190, 54, 61, 16);
		panel_1.add(label_2);

		JLabel label_3 = new JLabel("货物金额");
		label_3.setBounds(370, 54, 61, 16);
		panel_1.add(label_3);

		lbl_Money = new JLabel("0.0");
		lbl_Money.setBounds(460, 54, 113, 16);
		panel_1.add(lbl_Money);

		lbl_Num = new JLabel("0");
		lbl_Num.setBounds(276, 54, 53, 16);
		panel_1.add(lbl_Num);

		Sell sell = new Sell();
		JButton btn_Add = new JButton("添加");

		btn_Add.addActionListener(new ActionListener() {

			int i = 0;

			public void actionPerformed(ActionEvent e) {
				boolean flag;
				if(tf_ComId.getText().trim().length()==0||(flag=Pattern.matches("\\D*", tf_ComId.getText()))) {
					String message = "请输入正确的商品编号";
					JOptionPane.showMessageDialog(null, message);
				}else {
				sell.setCommodityid(Integer.valueOf(tf_ComId.getText()));

				Vector v5 = service.getDataById(sell);
				v5 = (Vector) v5.get(0);
				System.out.println("v5.get(3);" + v5.get(3));

				v5.set(6, i++);

				data.add(v5);

				tm.setDataVector(data, colname);
				System.out.println("==" + v5.get(4) + "==");
				float sum = 0;
				int sum2 = 0;
				for (Object obj : data) {
					Vector v = (Vector) obj;
					sum += (double) v.get(4) * Integer.parseInt((String) v.get(3));
					sum2 += Integer.parseInt((String) v.get(3));
				}
				System.out.println("sum=" + sum);
				System.out.println("sum2=" + sum2);

				lbl_Money.setText(Double.toString(sum));
				lbl_Num.setText(Integer.toString(sum2));}

			}
		});
		btn_Add.setBounds(28, 82, 117, 29);
		panel_1.add(btn_Add);

		JButton btn_SellAll = new JButton("入库");
		btn_SellAll.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i <= data.size(); i++) {
					service.insertData(sell);

				}
				data = new Vector();
				tm.setDataVector(data, colname);

			}
		});
		btn_SellAll.setBounds(210, 82, 117, 29);
		panel_1.add(btn_SellAll);

		JButton btn_DelSellAll = new JButton("取消入库");
		btn_DelSellAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data = new Vector();
				tm.setDataVector(data, colname);

			}
		});
		btn_DelSellAll.setBounds(401, 82, 117, 29);
		panel_1.add(btn_DelSellAll);

		JLabel lbl_Date = new JLabel("");
		lbl_Date.setBounds(436, 6, 153, 16);
		panel_1.add(lbl_Date);
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String datestr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
		lbl_Date.setText(datestr);
		
		

		System.out.println(datestr);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
