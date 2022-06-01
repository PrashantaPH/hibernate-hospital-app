package com.ty.hospital_app.controller;

import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.service.impl.AddressServiceImpl;

public class TestSaveAddress {

	public static void main(String[] args) {

		AddressServiceImpl addressServiceImpl = new AddressServiceImpl();

		Address address = new Address();
		address.setCounrty("India");
		address.setPincode(66553322);
		address.setStreet("5th cross");
		address.setState("Karnataka");
		addressServiceImpl.saveAddress(1, address);
	}
}
