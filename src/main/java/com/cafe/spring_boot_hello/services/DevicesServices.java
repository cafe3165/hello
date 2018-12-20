package com.cafe.spring_boot_hello.services;

import org.springframework.stereotype.Service;

import com.cafe.spring_boot_hello.po.Device;


@Service
public class DevicesServices extends Device implements Services{

	@Override
	public String getServicesname() {
		// TODO Auto-generated method stub
		return null;
	}

}
