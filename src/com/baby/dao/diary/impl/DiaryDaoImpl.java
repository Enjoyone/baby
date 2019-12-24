package com.baby.dao.diary.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.baby.dao.diary.DiaryDao;
import com.baby.dao.impl.DbObjectImpl;
import com.baby.entity.ArticleType;
import com.baby.entity.Diary;
import com.baby.entity.DiaryType;
import com.baby.entity.Parent;

public class DiaryDaoImpl implements DiaryDao{
	
	public int addDiaryDao(Diary diary) {
		String Driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		 String url = "jdbc:sqlserver://localhost:1433; DatabaseName=baby;user=sa;password=mis123456";
		
	     Connection cn=null;
	     PreparedStatement ps=null;
	     ResultSet rs=null;
	    
		System.out.println("dao-insert print article:--begin");
		System.out.println(diary.getDiaryType().getDiaryTypeID());
		System.out.println(diary.getParentID().getParentID());
		System.out.println(diary.getDiaryTitle());
		System.out.println(diary.getDiaryContent());
		System.out.println("end");

		String sql = "insert into diary(diaryTypeID,parentID,diaryTitle,diaryContent) "
				+ "values (?,?,?,?)";
		int addID=0;
		try {
			Class.forName(Driver);
			cn=DriverManager.getConnection(url);
			ps=cn.prepareStatement(sql);
			ps.setInt(1,diary.getDiaryType().getDiaryTypeID());
			ps.setString(2,diary.getParentID().getParentID());
			ps.setString(3,diary.getDiaryTitle());
			ps.setString(4,diary.getDiaryContent());
			
			ps.executeUpdate();
			rs=ps.getGeneratedKeys();
			rs.next();
			addID=rs.getInt(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return addID;
	}

	public boolean updateDiary(Diary diary) {

		String sql = null;
		Object[] param = null;
		sql = "update diary set diaryTypeID=?,diaryTitle=?,diaryContent=?,where userID=? and articleID=?";

		param = new Object[9];
		param[0] = diary.getDiaryType().getDiaryTypeID();
		param[1] = diary.getDiaryTitle();
		param[2] =diary.getDiaryContent();
		param[3] =diary.getParentID().getParentID(); 
		param[8] =diary.getDiaryID();

		boolean success = false;
		int q = -1;
		// 加载驱动
		try {
			q = new DbObjectImpl().executeUpdate(sql, param);
			System.out.println(q);
			if (q > 0) {
				success = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		System.out.println("dao:::" + success);
		return success;
	}

	public List<DiaryType> backDiaryType(Map<String, String> maps) {

		ResultSet rs = null;
		// 声明变量
		DiaryType diaryType = null;
		Parent parent = null;
		List<DiaryType> diaryTypes = new ArrayList<>();

		String sql = null;
		Object[] param = null;

		if (maps.size() == 2) {
			// 单个类型
			System.out.println("==2--->");
			sql = "select * from diaryType where parentID=? and diaryTypeName=?";
			param = new Object[2];
			param[0] = maps.get("parentID");
			param[1] = maps.get("diaryTypeName");
		}
		if (maps.size() == 1) {
			System.out.println("==1--->");
			sql = "select * from diaryType where parentID=?";
			param = new Object[1];
			param[0] = maps.get("parentID");

		}
		if (maps.size() < 1) {
			System.out.println("<1--->");
			sql = "select * from diaryType";

		}
		// 加载驱动
		try {
			rs = new DbObjectImpl().executeQuery(sql, param);
			while (rs.next()) {
				diaryType = new DiaryType();
				parent = new Parent();
				diaryType.setDiaryTypeID(rs.getInt("diaryTypeID"));
				diaryType.setDiaryTypeName(rs.getString("diaryTypeName"));
				diaryType.setCreateTime(rs.getString("createTime"));
				
				parent.setParentID(rs.getString("parentID"));
				
				diaryType.setDiaryTypeStatus(rs.getBoolean("diaryTypeStatus"));
				
				diaryTypes.add(diaryType);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			new DbObjectImpl().close();
		}

		return diaryTypes;
		
	}

	
	

}
