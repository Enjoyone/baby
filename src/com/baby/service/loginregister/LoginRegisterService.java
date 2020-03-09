package com.baby.service.loginregister;

import java.util.List;
import java.util.Map;

import com.baby.entity.Parent;

public interface LoginRegisterService {
	List<Parent> backParent(Map<String, String> map);

	boolean isExist(String parentID);

	boolean addParent(Parent parent);

	boolean loginCheck(String parentID, String password);
}
