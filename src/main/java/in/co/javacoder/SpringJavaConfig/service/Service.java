package in.co.javacoder.SpringJavaConfig.service;

import org.springframework.beans.factory.annotation.Autowired;

import in.co.javacoder.SpringJavaConfig.dao.Dao;

public class Service {
	
	 @Autowired
	 Dao dao;
	
	public void init() {
		System.out.println("init()");
	}
	
	public void destroy() {
		System.out.println("destroy()");
	}
	
	public void save() {
		dao.create();
	}
}
