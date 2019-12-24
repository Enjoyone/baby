package com.baby.service.loginregister.impl;

import com.baby.dao.loginregisterdao.impl.LoginRegisterDaoImpl;
import com.baby.entity.Parent;
import com.baby.service.loginregister.LoginRegisterService;

public class LoginRegisterServiceImpl implements LoginRegisterService {

	public LoginRegisterServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Parent backParentByParentID(String parentID) {
		// TODO Auto-generated method stub
		
		
		return new LoginRegisterDaoImpl().backParentByParentID(parentID);
	}

	@Override
	public boolean isExist(String parentID) {
		// TODO Auto-generated method stub
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
	public boolean loginCheck(String parentID, String password) {
		// TODO Auto-generated method stub
		Parent parent =  backParentByParentID(parentID);
		if(password.equals(parent.getPwd())&&parent.isStatus()){
			return true;
		}
		
		
		return false;
	}


}
