package com.cafe.spring_boot_hello.po;


import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.GraphId;

@NodeEntity
public class User {
	@GraphId
	private Long id;
	private String userName;
	private String describe;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
	
//	public User() {
//	}
//	public User(String userName) {
//		this.userName = userName;
//	}
//	public User(String userName, String describe) {
//		this.userName = userName;
//		this.describe = describe;
//	}
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//	public String getDescribe() {
//		return describe;
//	}
//	public void setDescribe(String describe) {
//		this.describe = describe;
//	}
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", userName=" + userName + ", describe=" + describe + "]";
//	}
	
	
	
	
}
