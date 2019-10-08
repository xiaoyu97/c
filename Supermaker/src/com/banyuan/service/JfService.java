package com.banyuan.service;

import java.util.Map;
import java.util.Vector;

import javax.swing.JTextField;

public interface JfService {
	public boolean Pattern(String str1, String str2, String str3, boolean p);

	public boolean Pattern(String str1,String str2, String str5, String str6, String str7, String str8, String str9, boolean p);

	public void setClean(JTextField... args);
	public Vector getUnit();
	public Map getPro();
	public void isNull(Vector data);
	public boolean ishas(Vector idVector,int id,boolean v);
}
