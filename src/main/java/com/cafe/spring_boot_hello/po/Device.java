
package com.cafe.spring_boot_hello.po;

import com.fasterxml.jackson.annotation.*;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.typeconversion.DateLong;
import org.springframework.format.annotation.DateTimeFormat;



import java.util.*;



//import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class Device {
	
	@GraphId
	private Long id;
	private String deviceName;
	private String describe;
	
// 	@RelatedTo(type="device_has_function")
// 	Set<Function> function=new HashSet<Function>();

		
	public Device() {

	}
	
	
	public Device(String deviceName) {
		this.deviceName = deviceName;
	}


	public Device(String deviceName, String describe) {
		this.deviceName = deviceName;
		this.describe = describe;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
	@DateLong
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private DateLong create;
	
	@Relationship(type="Provide",direction=Relationship.OUTGOING)
	@JsonIgnore
	private Set<Service> devices = new HashSet<>();
	
	
	
	@Override
	public String toString() {
		return "Device [id=" + id + ", deviceName=" + deviceName + ", describe=" + describe + "]";
	}
	
	
	
	
}
