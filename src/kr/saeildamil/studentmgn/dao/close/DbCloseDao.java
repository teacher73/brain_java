package kr.saeildamil.studentmgn.dao.close;

import java.sql.Connection;
import java.sql.SQLException;

public class DbCloseDao implements CloseDao {
	private Connection conn;
	
	public DbCloseDao(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void closeRes() {
		if (conn != null){
			try {
				if (!conn.isClosed()){
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("close() - Connection 객체 해제 실패");
			} finally{
				conn = null;
			}
		}

	}

}
