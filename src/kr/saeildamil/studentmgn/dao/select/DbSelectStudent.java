package kr.saeildamil.studentmgn.dao.select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.saeildamil.studentmgn.common.Student;

public class DbSelectStudent implements SelectStudent {
	Connection conn;

	public DbSelectStudent(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void selectStudent() {
		String query = "select stdNo, stdName, korScore, engScore, mathScore from student";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Student std =  new Student(rs.getString("stdName"),rs.getFloat("korScore"),rs.getFloat("engScore"),rs.getFloat("mathScore"));
				System.out.print(rs.getInt("stdNo") + " : " + std);
			}
			System.out.println();
		} catch (SQLException ee) {
			System.out.println("listStudent(String) - 학생리스트 가져오기 실패!!");
		} finally {
			try { pstmt.close(); rs.close(); conn.close();} catch (SQLException e) { }
		}
	}

}
