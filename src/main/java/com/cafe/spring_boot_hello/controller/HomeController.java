package com.cafe.spring_boot_hello.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cafe.spring_boot_hello.services.DevicesServices;
import com.cafe.spring_boot_hello.services.LocationsServices;
import com.cafe.spring_boot_hello.services.UsersServices;


@RestController
public class HomeController {
	
	@Autowired
	private UsersServices user;
	@Autowired
	private LocationsServices location;
	@Autowired
	private List<DevicesServices> device;

	
	@RequestMapping("/user")
	public String userName() {
		user.setUserName("more");

//	    return user.getServicesname();
		return user.getUserName();
	}

	@RequestMapping("userinroom")
	public String UserinLocation() {

		user.setUserName("Jack");
		location.setLocationName("Bedroom");
		DevicesServices d1 = null;
//		d1.setDeviceName("Air-condition");
//		System.out.println(d1.getDeviceName());
//		device.add(d1);
		
//		device.setDeviceName("Air-conditioning");
//		device.get(0).setDeviceName("Air-condition");
//		device.get(1).setDeviceName("Smart-Light");
		

		String log1= "",log2="",log="";
		log1= user.getUserName() + " in " + location.getLocationName()+" now ";
//		log2=device.get(0).getDeviceName()+" in "+location.getLocationName();
		log=log1+log2;
 
		return log;

//		return "sucess";

	}

}
