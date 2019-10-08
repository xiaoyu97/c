package com.banyuan.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JTextField;


public class MyThread extends Thread {

	private JTextField tfTime;
	
	public MyThread(JTextField tfTime) {
		this.tfTime=tfTime;
	}
   @Override
public void run() {
	for(;;) {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				String str=sdf.format(date);
				tfTime.setText(str);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
	}
	   
}
   
}
