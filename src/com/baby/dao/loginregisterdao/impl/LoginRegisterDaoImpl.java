package com.baby.dao.loginregisterdao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.baby.dao.DBObject;
import com.baby.dao.loginregisterdao.LoginRegisterDao;
import com.baby.entity.Parent;


public class LoginRegisterDaoImpl implements LoginRegisterDao {
	@Override
	public List<Parent> backParent(Map<String, String> maps) {
		ResultSet rs = null;
		
		List<Parent> parents=null;
		Object[] param = null;
		Parent parent = null;
		String sql=null;
		if (maps.size()<1) {
			sql="select * from parentShow";
		}
		if (maps.size()==1) {
			if (maps.containsKey("parentID")) {
				 sql = "select * from parentShow where parentID=?";
				 param=new Object[1];
				 param[0]=maps.get("parentID");
			}
		}
		
		try {
			// 4.
			rs = new DBObject().executeQuery(sql, param);
			if (rs.next()) {
				parent = new Parent();
				parents=new ArrayList<>();
				parent.setParentID(rs.getString("parentID"));
				parent.setName(rs.getString("name"));
				parent.setSex(rs.getString("sex"));
				parent.setAddress(rs.getString("address"));
				parent.setBirth(rs.getString("birth"));
				parent.setKidNum(rs.getInt("kidnum"));
				parent.setPhone(rs.getString("phone"));
				parent.setPwd(rs.getString("pwd"));
				parent.setRole(rs.getString("role"));
				parent.setStatus(rs.getBoolean("status"));
				parents.add(parent);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// ¹
			new DBObject().close();
		}
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return parents;
		
	}

	@Override
	public boolean addParent(Parent parent) {
		int i = 0;
		Object[] param = new Object[3];
		param[0] = parent.getParentID();
		param[1] = parent.getPwd();
		param[2] = parent.getName();
		
		
		try {
			String sql = "insert into users(parentID,password,name) values(?,?,?)";
			i = new DBObject().executeUpdate(sql, param);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
