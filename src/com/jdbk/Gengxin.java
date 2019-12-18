package com.jdbk;

import java.sql.*;

public class Gengxin{

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//通过驱动获得连接连接对象
		Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306","root","123456");
		//通过连接对象获得语句
		Statement yuju=lianjie.createStatement();
		//定义更新spl语句
		String sql="UPDATE tb_user SET email='jack@163.com' WHERE id=1";
		//通过语句对象执行spl
		yuju.execute(sql);
	}

}
