package com.baby.dao.loginregisterdao;

import java.util.List;
import java.util.Map;

import com.baby.entity.Parent;

public interface LoginRegisterDao {
	List<Parent> backParent(Map<String, String> maps);

	boolean addParent(Parent parent);
}
