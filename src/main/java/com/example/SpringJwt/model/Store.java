package com.example.SpringJwt.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Store extends AuditModel {
	@Id
	@GeneratedValue
	 private Long id;
     private String name;
     private String aglc;
     private String phoneNumber;
     private String emailAddress;
     private String address;
     private int workingDays;
     private String deliveryOption;
     private float amountForFreeDelivery;
     private float deliveryFlatRate;
     private float deliveryRadius;
     private String radiusUnits;
     private String businessNumber;
     private String businessName;
     private String vendorNumber;
     private String  contactName;
     private String contactTitle;
     private Date openingTime;
     private Date closingTime;
     private String state;
     private String  city;
     private String zipcode;
     // location: this._fb.group({ lat: [], lng: [] }),
     private float  amountForFreeStorePickup;
     private float storePickupFlatRate;
     private float minimumOrderAmount;
     // private String optedTaxes: [],
     // cancellationChargesType: ['%'],
     // cancellationChargesValue: [],
     // stripeSecretKey: [],
     // stripePublishableKey:[]
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAglc() {
		return aglc;
	}
	public void setAglc(String aglc) {
		this.aglc = aglc;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getWorkingDays() {
		return workingDays;
	}
	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}
	public String getDeliveryOption() {
		return deliveryOption;
	}
	public void setDeliveryOption(String deliveryOption) {
		this.deliveryOption = deliveryOption;
	}
	public float getAmountForFreeDelivery() {
		return amountForFreeDelivery;
	}
	public void setAmountForFreeDelivery(float amountForFreeDelivery) {
		this.amountForFreeDelivery = amountForFreeDelivery;
	}
	public float getDeliveryFlatRate() {
		return deliveryFlatRate;
	}
	public void setDeliveryFlatRate(float deliveryFlatRate) {
		this.deliveryFlatRate = deliveryFlatRate;
	}
	public float getDeliveryRadius() {
		return deliveryRadius;
	}
	public void setDeliveryRadius(float deliveryRadius) {
		this.deliveryRadius = deliveryRadius;
	}
	public String getRadiusUnits() {
		return radiusUnits;
	}
	public void setRadiusUnits(String radiusUnits) {
		this.radiusUnits = radiusUnits;
	}
	public String getBusinessNumber() {
		return businessNumber;
	}
	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getVendorNumber() {
		return vendorNumber;
	}
	public void setVendorNumber(String vendorNumber) {
		this.vendorNumber = vendorNumber;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactTitle() {
		return contactTitle;
	}
	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}
	public Date getOpeningTime() {
		return openingTime;
	}
	public void setOpeningTime(Date openingTime) {
		this.openingTime = openingTime;
	}
	public Date getClosingTime() {
		return closingTime;
	}
	public void setClosingTime(Date closingTime) {
		this.closingTime = closingTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public float getAmountForFreeStorePickup() {
		return amountForFreeStorePickup;
	}
	public void setAmountForFreeStorePickup(float amountForFreeStorePickup) {
		this.amountForFreeStorePickup = amountForFreeStorePickup;
	}
	public float getStorePickupFlatRate() {
		return storePickupFlatRate;
	}
	public void setStorePickupFlatRate(float storePickupFlatRate) {
		this.storePickupFlatRate = storePickupFlatRate;
	}
	public float getMinimumOrderAmount() {
		return minimumOrderAmount;
	}
	public void setMinimumOrderAmount(float minimumOrderAmount) {
		this.minimumOrderAmount = minimumOrderAmount;
	}

}
