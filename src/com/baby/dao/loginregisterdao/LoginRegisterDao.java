package com.baby.dao.loginregisterdao;

import java.util.List;

import com.baby.entity.Parent;

public interface LoginRegisterDao {
		public List<Parent> backParents();       //此方法后续管理后台用
		public Parent backParentByParentID(String parentID);
		public boolean addParent(Parent parent);
}
