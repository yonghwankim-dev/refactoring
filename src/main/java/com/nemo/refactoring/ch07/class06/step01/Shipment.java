package com.nemo.refactoring.ch07.class06.step01;

public class Shipment {
	private TrackingInformation trackingInformation;

	public Shipment(TrackingInformation trackingInformation) {
		this.trackingInformation = trackingInformation;
	}

	public String trackingInfo(){
		return trackingInformation.display();
	}

	public void setShippingCompany(String shippingCompany) {
		trackingInformation.setShippingCompany(shippingCompany);
	}

	public String getShippingCompany() {
		return trackingInformation.getShippingCompany();
	}
}
