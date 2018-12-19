package com.cafe.spring_boot_hello.po;


import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.GraphId;


@NodeEntity
public class Service {
	
	@GraphId
	private Long id;
	private String serviceName;
	private String describe;
	
	
	public Service() {

	}
	
	public Service(String serviceName) {
		this.serviceName = serviceName;
	}
	

	public Service(String serviceName, String describe) {
		this.serviceName = serviceName;
		this.describe = describe;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}

	@Override
	public String toString() {
		return "Serviice [id=" + id + ", serviiceName=" + serviceName + ", describe=" + describe + "]";
	}
	
	
	
}
