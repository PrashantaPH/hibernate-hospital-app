package com.ty.hospital_app.service;

import com.ty.hospital_app.dto.Address;

public interface AddressService {

	public abstract boolean saveAddress(int branch_Id, Address address);

	public boolean deleteAddressById(int address_Id);

	public boolean updateAddress(int address_Id, Address address);

	public Address getAddressById(int address_Id);
}
