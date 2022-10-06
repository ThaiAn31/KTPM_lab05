package com.example.Lab05.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Lab05.reponsitory.ChungNhanDaoImp;

@Service
public class ChungNhanService implements ChungNhanImpl {

	@Autowired
	private ChungNhanDaoImp chungNhanDaoImp;

	@Override
	public List<String> findByBoeing() {
		return chungNhanDaoImp.findByBoeing();
	}

	@Override
	public List<String> findByNV747() {
		return chungNhanDaoImp.listNVLai747();
	}

	@Override
	public List<String> listMaMBofHN() {

		return chungNhanDaoImp.listMaMBOfHoNguyen("Nguyen");
	}

	@Override
	public List<String> listMaNVLaiLoaiMB() {
		// TODO Auto-generated method stub
		return chungNhanDaoImp.listMaMVLaiLoaiMB("Boeing", "Airbus");
	}

	@Override
	public List<String> listLoaiByMaCB() {
		// TODO Auto-generated method stub
		return chungNhanDaoImp.findbyLoaiByMaCB("VN280");
	}

	@Override
	public List<String> findChuyenBayByLoai() {
		// TODO Auto-generated method stub
		return chungNhanDaoImp.findChuyenBayByLoai("Airbus A320");
	}

	@Override
	public List<String> findTenNVByLoai() {
		// TODO Auto-generated method stub
		return chungNhanDaoImp.findTenNVByLoai("Boeing");
	}

	@Override
	public List<String> listfindMayBayAndCountNV() {
		// TODO Auto-generated method stub
		return chungNhanDaoImp.listfindMayBayAndCountNV();
	}

	@Override
	public List<String> listfindNVHavingMaMB3() {
		// TODO Auto-generated method stub
		return chungNhanDaoImp.listfindNVHavingMaMB3();
	}

	

}
