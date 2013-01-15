package kr.saeildamil.studentmgn.dao.select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.saeildamil.studentmgn.common.Student;
import kr.saeildamil.studentmgn.dao.DBConn;

public class DbSelectStudent implements SelectStudent {
	Connection conn;

	public DbSelectStudent(Connection conn) {
		this.conn = conn;
	}


	@Override
	public void selectStudent() {
		String query = "select no, name, kor, eng, math from student";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(query);
			
			rs = pstmt.executeQuery();
			
			int idx = 1;
			while (rs.next()) {
				Student std =  new Student(rs.getString("name"),rs.getFloat("kor"),rs.getFloat("eng"),rs.getFloat("math"));
				System.out.print(idx++ + " : " + std);
			}
			System.out.println();
		} catch (SQLException ee) {
			System.out.println("listStudent(String) - 학생리스트 가져오기 실패!!");
		} finally {
			try { pstmt.close(); rs.close();} catch (SQLException e) { }
		}
	}

}
