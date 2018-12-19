package com.cafe.spring_boot_hello.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe.spring_boot_hello.po.User;
import com.cafe.spring_boot_hello.services.VideoService;


@RestController
public class HomeController {
	@Autowired
	@Qualifier("videoB")
	  private VideoService videoService;

	  @RequestMapping("/video")
	  public String videoName(){
	    return videoService.getVideoName();
	  }
	  
//	 @Autowired
//	 private User user;
//	 @RequestMapping("/user")
//	  public String userName(){
//	    return user.getUserName();
//	  }


}
