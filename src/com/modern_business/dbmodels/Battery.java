package com.modern_business.dbmodels;

public class Battery {

	private int batteryId;
	private String batteryName;
	private double liveHour;
	private double voltage;
	
	
	
	public Battery() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Battery(String batteryName, double liveHour, double voltage) {
		super();
		this.batteryName = batteryName;
		this.liveHour = liveHour;
		this.voltage = voltage;
	}



	public Battery(int batteryId, String batteryName, double liveHour, double voltage) {
		super();
		this.batteryId = batteryId;
		this.batteryName = batteryName;
		this.liveHour = liveHour;
		this.voltage = voltage;
	}



	public int getBatteryId() {
		return batteryId;
	}



	public void setBatteryId(int batteryId) {
		this.batteryId = batteryId;
	}



	public String getBatteryName() {
		return batteryName;
	}



	public void setBatteryName(String batteryName) {
		this.batteryName = batteryName;
	}



	public double getLiveHour() {
		return liveHour;
	}



	public void setLiveHour(double liveHour) {
		this.liveHour = liveHour;
	}



	public double getVoltage() {
		return voltage;
	}



	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}



	@Override
	public String toString() {
		return "Battery [batteryId=" + batteryId + ", batteryName=" + batteryName + ", liveHour=" + liveHour
				+ ", voltage=" + voltage + "]";
	}
	
	

}
