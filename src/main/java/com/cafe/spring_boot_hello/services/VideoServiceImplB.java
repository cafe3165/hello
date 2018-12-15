package com.cafe.spring_boot_hello.services;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("videoB")
//@Primary
public class VideoServiceImplB implements VideoService {
	@Override
	  public String getVideoName() {
	    return "人民的名义";
	  }
	
}
