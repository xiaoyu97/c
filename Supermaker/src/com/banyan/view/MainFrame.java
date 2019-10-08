package com.banyan.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.banyuan.service.LoginService;
import com.banyuan.service.impl.LoginServiceImpl;
import com.banyuan.util.Factory;

import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MainFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel basicInfo;
	private JPanel stock;
	private JPanel sale;
	private JPanel query;
	private JPanel repertory;
	private JPanel limit;
	
//	private LoginService ls = new Factory<LoginService>().getInstance("LoginSer");
	private LoginService ls = new LoginServiceImpl();
	JTabbedPane tabbedPane;
	JButton userbtn;
	JButton limitsbtn;
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainFrame frame = new MainFrame();
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
	public MainFrame(String name,String pwd) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 6, 920, 107);
		contentPane.add(tabbedPane);

		basicInfo = new JPanel();
		basicInfo.setToolTipText("");
		tabbedPane.addTab("基础信息管理", null, basicInfo, null);
//		tabbedPane.add(basicInfo, 1);
		basicInfo.setLayout(null);

		JButton commoditybtn = new JButton("商品信息管理");
		commoditybtn.setBounds(6, 6, 122, 49);
		basicInfo.add(commoditybtn);
		commoditybtn.addActionListener(this);

		JButton providerbtn = new JButton("供应商信息管理");
		providerbtn.setBounds(140, 6, 117, 49);
		basicInfo.add(providerbtn);
		providerbtn.addActionListener(this);

		stock = new JPanel();
		tabbedPane.addTab("进货管理", null, stock, null);
		stock.setLayout(null);
		JButton stockbtn = new JButton("进货单");
		stockbtn.setBounds(6, 0, 117, 58);
		stock.add(stockbtn);
		stockbtn.addActionListener(this);

		JButton backbtn = new JButton("退货单");
		backbtn.setBounds(135, 0, 117, 58);
		stock.add(backbtn);
		backbtn.addActionListener(this);

		sale = new JPanel();
		tabbedPane.addTab("销售管理", null, sale, null);
		sale.setLayout(null);

		JButton consumebtn = new JButton("销售单");
		consumebtn.setBounds(6, 6, 117, 49);
		sale.add(consumebtn);
		consumebtn.addActionListener(this);

		JButton combackbtn = new JButton("销售退货");
		combackbtn.setBounds(139, 6, 117, 49);
		sale.add(combackbtn);
		combackbtn.addActionListener(this);

		query = new JPanel();
		tabbedPane.addTab("查询统计", null, query, null);

		JButton productbtn = new JButton("商品查询");
		productbtn.setBounds(6, 5, 117, 50);
		query.setLayout(null);
		query.add(productbtn);
		productbtn.addActionListener(this);

		JButton supplybtn = new JButton("供应商查询");
		supplybtn.setBounds(135, 5, 117, 50);
		query.add(supplybtn);
		supplybtn.addActionListener(this);

		JButton salebtn = new JButton("销售查询");
		salebtn.setBounds(264, 6, 117, 49);
		query.add(salebtn);
		salebtn.addActionListener(this);

		JButton entrybtn = new JButton("入库查询");
		entrybtn.setBounds(393, 5, 117, 50);
		query.add(entrybtn);
		entrybtn.addActionListener(this);

		repertory = new JPanel();
		tabbedPane.addTab("库存管理", null, repertory, null);
		repertory.setLayout(null);

		JButton createtablebtn = new JButton("生成报表");
		createtablebtn.setBounds(6, 6, 96, 55);
		repertory.add(createtablebtn);
		createtablebtn.addActionListener(this);

		limit = new JPanel();
		tabbedPane.addTab("权限管理", null, limit, null);
		limit.setLayout(null);

		userbtn = new JButton("用户管理");
		userbtn.setBounds(0, 6, 96, 49);
		limit.add(userbtn);
		userbtn.addActionListener(this);

		JButton passwordbtn = new JButton("修改密码");
		passwordbtn.setBounds(108, 6, 105, 49);
		limit.add(passwordbtn);
		passwordbtn.addActionListener(this);

		limitsbtn = new JButton("权限管理");
		limitsbtn.setBounds(229, 6, 117, 49);
		limit.add(limitsbtn);
		limitsbtn.addActionListener(this);
		//登陆状态为1
		ls.loginOn(name, pwd);
		//退出状态为0
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			ls.loginOut(name, pwd);
			}
		});
	}

	public JPanel getBasicInfo() {
		return basicInfo;
	}

	public JPanel getStock() {
		return stock;
	}

	public JPanel getSale() {
		return sale;
	}

	public JPanel getQuery() {
		return query;
	}

	public JPanel getRepertory() {
		return repertory;
	}

	public JPanel getLimit() {
		return limit;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String method=e.getActionCommand();
		
		if(method.equals("商品信息管理")) {
			JFrame jf1=GoodsManagement.getJf();
			jf1.setVisible(true);
		}else if(method.equals("供应商信息管理")) {
			JFrame jf=SupplierManagement.getJf();
			jf.setVisible(true);
		}else if(method.equals("进货单")) {
			JFrame jf2=AddGoods.getJf();
			jf2.setVisible(true);
		}else if(method.equals("退货单")) {
			System.out.println("4");

		}else if(method.equals("销售单")) {
			System.out.println("5");

		}else if(method.equals("销售退货")) {
			System.out.println("6");

		}else if(method.equals("商品查询")) {
			JFrame jFrame=CommodityTable.getJf();
			jFrame.setVisible(true);

		}else if(method.equals("供应商查询")) {
			JFrame jf2=ProviderTable.getJf();
			jf2.setVisible(true);
		}else if(method.equals("销售查询")) {
			System.out.println("9");

		}else if(method.equals("入库查询")) {
			System.out.println("10");

		}else if(method.equals("生成报表")) {
			System.out.println("11");

		}else if(method.equals("用户管理")) {
			UserManagerFrame umf=UserManagerFrame.getinstance();
			umf.setVisible(true);
		}else if(method.equals("修改密码")) {
			ChangePwdFrame cpf=ChangePwdFrame.getInstance();
			cpf.setVisible(true);
		}else if(method.equals("权限管理")) {
			ChangeRight cr=ChangeRight.getInstance();
			cr.setVisible(true);
		}
	}

}
