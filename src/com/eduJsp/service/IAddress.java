package com.eduJsp.service;

import java.util.List;

import com.eduJsp.vo.AddressVO;

public interface IAddress {

	public AddressVO getAddress(Integer num) ;
	public List<AddressVO> allData();
	public int insertAddress(AddressVO addressVO);
	public int updateAddress(AddressVO addressVO);
	public int deleteAddress(AddressVO addressVO);
	
}
