package com.baby.dao.loginregisterdao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.baby.dao.DbObject;
import com.baby.dao.loginregisterdao.LoginRegisterDao;
import com.baby.entity.Parent;


public class LoginRegisterDaoImpl implements LoginRegisterDao {

	public LoginRegisterDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Parent> backParents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Parent backParentByParentID(String parentID) {
		// TODO Auto-generated method stub
		DbObject db = new DbObject();
		ResultSet rs = null;
		Parent parent = null;

		try {
			// 4.
			String sql = "select * from parentShow where parentID=?";
			Object param[] = new Object[1];
			param[0] = parentID;
			rs = db.executeQuery(sql, param);
			if (rs.next()) {
				parent = new Parent();
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
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// ¹
			db.close();
		}
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return parent;
		
	}

	@Override
	public boolean addParent(Parent parent) {
		int i = 0;
		Object[] param = new Object[3];
		param[0] = parent.getParentID();
		param[1] = parent.getPwd();
		param[2] = parent.getSex();
		
		
		try {
			String sql = "insert into users(parentID,password,sex) values(?,?,?)";
			i = new DbObject().executeUpdate(sql, param);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
