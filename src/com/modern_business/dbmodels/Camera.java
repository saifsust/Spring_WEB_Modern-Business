package com.modern_business.dbmodels;

public class Camera {

	private int cameraId;
	private double cameraPixel;
	
	
	
	public Camera() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Camera(double cameraPixel) {
		super();
		this.cameraPixel = cameraPixel;
	}



	public Camera(int cameraId, double cameraPixel) {
		super();
		this.cameraId = cameraId;
		this.cameraPixel = cameraPixel;
	}



	public int getCameraId() {
		return cameraId;
	}



	public void setCameraId(int cameraId) {
		this.cameraId = cameraId;
	}



	public double getCameraPixel() {
		return cameraPixel;
	}



	public void setCameraPixel(double cameraPixel) {
		this.cameraPixel = cameraPixel;
	}



	@Override
	public String toString() {
		return "Camera [cameraId=" + cameraId + ", cameraPixel=" + cameraPixel + "]";
	}
	
	

}
