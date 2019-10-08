package com.banyuan.service.impl;

import java.util.Vector;

import com.banyuan.dao.QueryMapper;
import com.banyuan.dao.impl.QueryMapperImpl;
import com.banyuan.service.QueryService;

public class QuerryServiceImpl implements QueryService{

	@Override
	public Vector getDate() {
		
		return new QueryMapperImpl().selectAll();
	}
	
}
