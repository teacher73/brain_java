package kr.saeildamil.studentmgn.dao.insert;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.saeildamil.studentmgn.common.Student;
import kr.saeildamil.studentmgn.dao.DBConn;

public class DbInsertStudent implements InsertStudent {
	
	@Override
	public void insertStudent(Student std) {
		String query = "insert into student values (null, ?, ?, ?, ?, ?, ?)";
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
			pstmt.executeUpdate();
			System.out.println("insertStudent(Student std) - 학생 등록 성공");

		} catch (SQLException ee) {
			System.out.println("insertStudent(Student std) - 학생 등록 실패!!"	+ ee.getMessage());
		} finally {
			try { pstmt.close(); DBConn.getInstance().closeConn();} catch (SQLException e) { }
		}
	}

}
