package com.baby.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbObject{
	private  static final String Driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private  static final String url = "jdbc:sqlserver://localhost:1433; DatabaseName=baby;user=sa;password=mis123456";
	
    private Connection cn=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
	
	
// 连接
	public  Connection open(){
	        try {
	            Class.forName(Driver);
	            cn = DriverManager.getConnection(url);
	         
	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
	        return cn;	
	}
	
	// 查询
	
	
	public ResultSet executeQuery(String sql, Object[] param ){
		try {
			cn=open();
			ps=cn.prepareStatement(sql);
			if(param!=null){
				for (int i = 0; i < param.length; i++) {
					ps.setObject(i+1,param[i]);
				}
			}
			rs=ps.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return rs;

	}
	
	
	//插入或修改
	
	public int executeUpdate(String sql, Object[] param){
		int row=0;
		try {
			cn=open();
			ps=cn.prepareStatement(sql);
			if (param!=null) {
				for (int i = 0; i < param.length; i++) {
					ps.setObject(i+1, param[i]);
				}
			}
			row=ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			close();
		}
		return row;

	}
	
	
	public void close(){
		 try {
             if (rs != null) {
                 rs.close();
             }
             if (ps != null) {
                 ps.close();
             }
             if (cn != null) {
                 cn.close();
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
	}
	
}
