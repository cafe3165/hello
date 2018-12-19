package com.cafe.spring_boot_hello.services;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe.spring_boot_hello.dao.UserRepository;
import com.cafe.spring_boot_hello.po.Location;
import com.cafe.spring_boot_hello.po.User;



@Service
public class  UserService  {
//	@Override
//	  public String getUserName() {
//	    return "三生三世十里桃花";
//	  }
	@Autowired
	private UserRepository userRepository;
	
//	@Autowired
//	Location_Has_User_Repository location_Has_User_Repository;
//	
	public long getNumberOfUser() {
		return userRepository.count();
	}
	
	public User createUser(User u) {
		return userRepository.save(u);
	}
	
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	public User findLocationById(Long id) {
		return userRepository.findOne(id);
	}

	public void deleteall(){
		userRepository.deleteAll();
	}
	public List<User> findByUserName(String userName){
		return userRepository.findByUserName(userName);
	}
	public List<User> findByUserNameAndDescribe(String userName,String describe){
		return userRepository.findByUserNameAndDescribe(userName, describe);
	}
	
	
	public void addUser(Location location,User user,int num){
//		Location_Has_User location_Has_User=new Location_Has_User();
//		location_Has_User.setUser(user);
//		location_Has_User.setLocation(location);
//		location_Has_User.setNumber(num);
//		location_Has_User_Repository.save(location_Has_User);
	}
	
	public void addUser(Location location,User user){
//		Location_Has_User location_Has_User=new Location_Has_User();
//		location_Has_User.setUser(user);
//		location_Has_User.setLocation(location);
//		location_Has_User_Repository.save(location_Has_User);
	}

	
}

