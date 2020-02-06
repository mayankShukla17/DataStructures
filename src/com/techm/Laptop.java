package com.techm;
public class Laptop {
	private String laptopId;
	private String hostname;
	private String make;
	private String status;
	public Laptop(String laptopId) {
		this.laptopId=laptopId;
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", hostname=" + hostname + ", make=" + make + ", status=" + status
				+ "]";
	}
	public String getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(String laptopId) {
		this.laptopId = laptopId;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
