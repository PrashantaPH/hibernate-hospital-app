package com.ty.hospital_app.dao;

import com.ty.hospital_app.dto.Address;

public interface AddressDao {

	public boolean saveAddress(int branch_Id, Address address);

	public boolean deleteAddressById(int address_Id);

	public boolean updateAddress(int address_Id, Address address);

	public Address getAddressById(int address_Id);
}
