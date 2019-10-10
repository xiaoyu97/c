package com.banyuan.pss.service;

import java.util.Vector;

public interface SellInfoService {

	Vector getData();
	
	Vector getDataBySelectedItem(int selected,String content);
}
