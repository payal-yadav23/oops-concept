package com.tka;

public class Car {

	private int carNo;
	private String carBrand;
	private String carModel;
	private String carPrice;

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(String carPrice) {
		this.carPrice = carPrice;
	}

	@Override
	public String toString() {
		return "----------CAR DETAILS------------ \ncarNo= " + carNo + ", \ncarBrand= " + carBrand + ", \ncarModel= " + carModel + ", \ncarPrice= " + carPrice;
	}
	
	

}
