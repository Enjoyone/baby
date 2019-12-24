package com.baby.service.loginRegister.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baby.dao.loginregisterdao.impl.LoginRegisterDaoImpl;
import com.baby.entity.Parent;
import com.baby.service.loginRegister.LoginRegisterService;

public class LoginRegisterServiceImpl implements LoginRegisterService {
	
	
	public List<Parent> backParent(Map<String, String> map) {
		
		
		return new LoginRegisterDaoImpl().backParent(map);
	}

	@Override
	public boolean loginCheck(String parentID, String password) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("parentID", parentID);
		
		Parent parent =  backParent(map).get(0);
		
		if(password.equals(parent.getPwd())&&parent.isStatus()){
			return true;
		}
		return false;
	}
	
	@Override
	public boolean addParent(Parent parent) {
		// TODO Auto-generated method stub
		if(!isExist(parent.getParentID())&&new LoginRegisterDaoImpl().addParent(parent)){
			return true;
		}
		
		return false;
	}
	
	@Override
	public boolean isExist(String parentID) {

		
		return false;
	}



}
