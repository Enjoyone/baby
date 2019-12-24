package com.baby.dao;

import java.sql.Connection;
import java.sql.ResultSet;

public interface DBObject {

	// 连接
	  Connection open();
	// 查询
	 ResultSet executeQuery(String sql, Object[] param );
	//插入或修改
	 int executeUpdate(String sql, Object[] param);
	// 关闭
	 void close();
}
