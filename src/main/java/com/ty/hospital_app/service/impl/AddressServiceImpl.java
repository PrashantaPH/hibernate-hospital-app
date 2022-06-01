package com.ty.hospital_app.service.impl;

import com.ty.hospital_app.dao.impl.AddressDaoImpl;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.service.AddressService;

public class AddressServiceImpl implements AddressService {


	AddressDaoImpl addressDaoImpl=new AddressDaoImpl();
	@Override
	public boolean saveAddress(int branch_Id, Address address) {
		return addressDaoImpl.saveAddress(branch_Id, address);
	}

	@Override
	public boolean deleteAddressById(int address_Id) {
		return addressDaoImpl.deleteAddressById(address_Id);
	}

	@Override
	public boolean updateAddress(int address_Id, Address address) {
		return addressDaoImpl.updateAddress(address_Id, address);
	}

	@Override
	public Address getAddressById(int address_Id) {
		return addressDaoImpl.getAddressById(address_Id);
	}
}
