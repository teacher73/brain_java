package kr.saeildamil.studentmgn.dao.update;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.saeildamil.studentmgn.common.Student;
import kr.saeildamil.studentmgn.dao.DBConn;

public class DbUpdateStudent implements UpdateStudent {
	@Override
	public void updateStudent(int idx, Student std) {
		String query = "update student set stdName = ?, korScore = ?, engScore=?, mathScore=?, sumScore=?, avgScore=? where stdNo = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = DBConn.getInstance().getConn().prepareStatement(query);
			int i=1;
			pstmt.setString(i++, std.getStdName());
			pstmt.setFloat(i++, std.getKorScore());
			pstmt.setFloat(i++, std.getEngScore());
			pstmt.setFloat(i++, std.getMathScore());
			pstmt.setFloat(i++, std.getSumScore());
			pstmt.setFloat(i++, std.getAvgScore());
			pstmt.setInt(i, idx);
			pstmt.executeUpdate();
			System.out.println("updateStudent(int idx, Student std) - 학생 수정 성공");
		} catch (SQLException ee) {
			System.out.println("updateStudent(int idx, Student std) - 학생 수정 실패!!"	+ ee.getMessage());
		} finally {
			try { pstmt.close(); DBConn.getInstance().closeConn();} catch (SQLException e) { }
		}
	}

}
