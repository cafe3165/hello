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

//	@SuppressWarnings("null")
	@RequestMapping("/userinroom")
	public String UserinLocation() {

		user.setUserName("Jack");
		location.setLocationName("Bedroom");
		DevicesServices d1 = new DevicesServices();
		DevicesServices d2 = new DevicesServices();

		d1.setDeviceName("Air-condition");
		device.add(d1);
		d2.setDeviceName("Smart-Light");
		device.add(d2);
		System.out.println(device.get(1));
		System.out.println(device.get(2));

		String log1 = "", log2 = "", log = "";
		log1 = user.getUserName() + " in " + location.getLocationName() + " now ";
		log2 = device.get(1).getDeviceName() + " and " + device.get(2).getDeviceName() + " in "
				+ location.getLocationName();
		log = log1 + log2;
		
		System.out.println("666");

		return log;

	}

}
