package com.baby.service.loginregister.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baby.dao.loginregisterdao.impl.LoginRegisterDaoImpl;
import com.baby.entity.Parent;
import com.baby.service.loginregister.LoginRegisterService;

public class LoginRegisterServiceImpl implements LoginRegisterService {

	public List<Parent> backParent(Map<String, String> map) {
		return new LoginRegisterDaoImpl().backParent(map);
	}

	@Override
	public boolean loginCheck(String parentID, String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("parentID", parentID);

		Parent parent = backParent(map).get(0);

		if (password.equals(parent.getPwd())) {
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public boolean addParent(Parent parent) {

		if (!isExist(parent.getParentID())) {
			if (new LoginRegisterDaoImpl().addParent(parent)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	@Override
	public boolean isExist(String parentID) {
		Map<String, String> map = new HashMap<>();
		map.put("parentID", parentID);
		Parent parent = backParent(map).get(0);
		if (parent == null) {
			return true;
		} else {
			return false;
		}
	}

}
