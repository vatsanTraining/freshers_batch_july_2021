package com.trainig.demo.entity;

public class CabDriver {

	 private int driverId;
	 private String driverName;
	 private double rating;
	public CabDriver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CabDriver(int driverId, String driverName, double rating) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.rating = rating;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "CabDriver [driverId=" + driverId + ", driverName=" + driverName + ", rating=" + rating + "]";
	}
	 
	 
}
