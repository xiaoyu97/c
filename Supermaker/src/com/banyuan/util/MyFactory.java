/**
 * 
 */
package com.banyuan.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class MyFactory {

	private static HashMap<String, Object> objects = new HashMap<>();

 static  {
	 BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader("object.properties"));
			String line=null;
			while((line=br.readLine())!=null) {
				String [] arr=line.split("=");
				String key=arr[0];
				String value=arr[1];
				
				Object obj=null;
				

				try {
					System.out.println(value);
					Class c1 = Class.forName(value);
					obj = c1.newInstance();
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
		}finally {
			if(br!=null) {
				try {
					br.close();
				}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
		

	public static Object getInstance(String name) {
		System.out.println("===MyFactory===getInstance()==" + name);
		
		Object a = objects.get(name);
		System.out.println("objects=" + objects);
		return a; 
	}

}
