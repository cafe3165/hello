package com.cafe.spring_boot_hello.services;

import org.springframework.stereotype.Service;

import com.cafe.spring_boot_hello.po.Location;

@Service
public class LocationsServices extends Location implements Services{

	@Override
	public String getServicesname() {
		// TODO Auto-generated method stub
		return "Bedroom";
	}

	
	
		
}
