package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static void initConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success");
		}catch (ClassNotFoundException e) {
			System.out.println("jdcb.Driver 가 없습니다.");
			e.printStackTrace();
		}
	}
	public static Connection getConnecttion() {
		Connection conn = null;
	try {
		conn = DriverManager.getConnection(null, "root", null);
	}catch(SQLException e) {
		System.out.println("Database와 연결이 되지 않았습니다.");
	}
	return conn;
	}
}
