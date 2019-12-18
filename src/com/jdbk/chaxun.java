package com.jdbk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class chaxun {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		//通过驱动获得连接连接对象
		Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306","root","123456");
		//通过连接对象获得语句
		Statement yuju=lianjie.createStatement();
		//定义更新spl语句
		String sql="select * from tb_user";
		ResultSet rSet=yuju.executeQuery(sql);
		System.out.println("id | name | sex");
		while(rSet.next()) {
			int id=rSet.getInt("id");
			String name=rSet.getString("name");
			String sex=rSet.getString("sex");
			System.out.println(id+"|"+name+"|"+sex);
		}
	}

}
