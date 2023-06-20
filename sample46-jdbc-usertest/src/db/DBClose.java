package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBClose {
	public void close(PreparedStatement psmt,Connection conn,ResultSet rs ) {
		try {
			if(psmt != null) { // 아직 연결되어있다면
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
			if(rs!= null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
