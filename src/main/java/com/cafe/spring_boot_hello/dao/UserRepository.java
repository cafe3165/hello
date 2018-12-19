package com.cafe.spring_boot_hello.dao;

import org.springframework.data.neo4j.repository.GraphRepository;
import java.util.List;
//import com.cafe.spring_boot_hello.po.Device;
import com.cafe.spring_boot_hello.po.User;

public interface UserRepository extends GraphRepository<User>{
	List<User> findByUserName(String userName);
	List<User> findByUserNameAndDescribe(String userName,String describe);
}
