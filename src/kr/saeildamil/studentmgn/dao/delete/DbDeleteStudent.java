package kr.saeildamil.studentmgn.dao.delete;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.saeildamil.studentmgn.dao.DBConn;


public class DbDeleteStudent implements DeleteStudent {

	@Override
	public void deleteStudent(int idx) {
		String query = "delete from student where stdNo = ?";
		PreparedStatement pstmt = null;

		try {
			pstmt = DBConn.getInstance().getConn().prepareStatement(query);
			pstmt.setInt(1, idx);

			pstmt.executeUpdate();
			System.out.println("deleteStudent(int idx) - 학생 삭제 성공");

		} catch (SQLException ee) {
			System.out.println("deleteStudent(int idx) - 학생 삭제 실패!!"	+ ee.getMessage());
		} finally {
			try { pstmt.close(); DBConn.getInstance().closeConn();} catch (SQLException e) { }
		}
	}

}
