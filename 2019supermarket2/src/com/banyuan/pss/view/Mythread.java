/**
 * 
 */
package com.banyuan.pss.view;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author edz
 *2019年9月21日 下午4:48:16
 * 
 */
public class Mythread implements Runnable{
		private JTextField jf;
		//要在JLabel中显示，传入JLabel
		public Mythread(JTextField jf) {
			this.jf=jf;
		}

		@Override
		public void run() {
			for(;;) {//死循环打印
			Date date=new Date();
			//按照规范输出时间
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			//获取时间
			String str=sdf.format(date);
			
			jf.setText(str);//输出时间
			try {
				//每隔1秒输出一次时间
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
		}

	}

