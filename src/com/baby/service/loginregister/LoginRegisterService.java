package com.baby.service.loginregister;

import java.util.List;

import com.baby.entity.Parent;

public interface LoginRegisterService {
	public Parent backParentByParentID(String parentID);
	public boolean isExist(String parentID);
	public boolean addParent(Parent parent);
	
	public boolean loginCheck(String parentID,String password);
}
