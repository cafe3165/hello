package com.cafe.spring_boot_hello.services;

import org.springframework.stereotype.Service;

import com.cafe.spring_boot_hello.po.User;

@Service
public class UsersServices extends User implements Services {

	@Override
	public String getServicesname() {
		// TODO Auto-generated method stub
		return "cafe";
	}
	
//	@Override
//	public String 

}
