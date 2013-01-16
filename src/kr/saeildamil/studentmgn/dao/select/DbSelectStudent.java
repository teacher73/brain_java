package kr.saeildamil.studentmgn.dao.select;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.saeildamil.studentmgn.common.Student;
import kr.saeildamil.studentmgn.dao.DBConn;

public class DbSelectStudent implements SelectStudent {

	@Override
	public void listStudent() {
		String query = "select stdNo, stdName, korScore, engScore, mathScore from student";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = DBConn.getInstance().getConn().prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Student std =  new Student(rs.getString("stdName"),rs.getFloat("korScore"),rs.getFloat("engScore"),rs.getFloat("mathScore"));
				System.out.println(rs.getInt("stdNo") + " : " + std);
			}
			System.out.println();
		} catch (SQLException ee) {
			System.out.println("listStudent() - 학생리스트 가져오기 실패!!");
		} finally {
			try { pstmt.close(); rs.close(); DBConn.getInstance().closeConn();} catch (SQLException e) { }
		}
	}

	@Override
	public void selectStudent(int idx) {
		String query = "select stdName, korScore, engScore, mathScore from student where stdNo = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = DBConn.getInstance().getConn().prepareStatement(query);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			rs.next();
			Student std =  new Student(rs.getString("stdName"),rs.getFloat("korScore"),rs.getFloat("engScore"),rs.getFloat("mathScore"));
			System.out.println(std);
		} catch (SQLException ee) {
			System.out.println("selectStudent(String) - 학생정보 가져오기 실패!!" +ee.getMessage());
		} finally {
			try { pstmt.close(); rs.close(); DBConn.getInstance().closeConn();} catch (SQLException e) { }
		}
	}

	@Override
	public void listStdName() {
		String query = "select stdNo, stdName from student";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = DBConn.getInstance().getConn().prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("stdNo") + " : " + rs.getString("stdName"));
			}
			System.out.println();
		} catch (SQLException ee) {
			System.out.println("listStdName() - 학생명리스트 가져오기 실패!!");
		} finally {
			try { pstmt.close(); rs.close(); DBConn.getInstance().closeConn();} catch (SQLException e) { }
		}
	}

}
