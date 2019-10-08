package com.banyuan.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Factory {
	public static HashMap<String,Object> objects = new HashMap();
	
	static {
		Properties p =new Properties();
		try {
			p.load(new FileReader("object1.properties"));
			Set<Entry<Object,Object>> s=p.entrySet();
			Iterator<Entry<Object,Object>> it=s.iterator();
			while(it.hasNext()) {
				Entry<Object, Object> entry=it.next();
				String key=String.valueOf(entry.getKey());

				String value=String.valueOf(entry.getValue());

				Object obj=null;
				try {
					Class clz=Class.forName(value);

					obj=clz.newInstance();

				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				objects.put(key, obj);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Object getInstance(String name) {
		Object obj=(Object)objects.get(name);
		return obj; 
	}
}
