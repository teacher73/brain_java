/**
 *
 * @package		: chapter21
 * @FileName	: DepartmentDAO.java
 * @Date  		: 2012. 10. 18.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package chapter21;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 
 * @author MinSu Kim (net94@nate.com)
 * @since 2012. 10. 18. 오전 12:07:14
 * @version 1.0.0
 */

public class DepartmentDAO {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(DepartmentDAO.class);

	private Connection conn;

	public DepartmentDAO() {
		conn = DBConn.getInstance().getConn();
	}

	public boolean registerDepartment(DepartmentDTO departDto) {
		String query = "insert into department values (null, ?, ?)";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, departDto.getDeptName());
			pstmt.setInt(2, departDto.getFloor());
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException ee) {
			logger.error("registerMember(DepartmentDTO) - 부서 등록 실패!!"
					+ ee.getMessage());
			return false;
		} finally {
			try { pstmt.close(); } catch (SQLException e) { }
		}
		return true;
	}

	public ArrayList<DepartmentDTO> listDepartment() {
		ArrayList<DepartmentDTO> dptList = new ArrayList<DepartmentDTO>();
		String query = "select deptno, deptname, floor from department";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				DepartmentDTO obj = new DepartmentDTO();
				obj.setDeptNo(rs.getInt("deptno"));
				obj.setDeptName(rs.getString("deptname"));
				obj.setFloor(rs.getInt("floor"));
				dptList.add(obj);
			}

		} catch (SQLException ee) {
			logger.error("listDepartment(String) - 부서리스트 가져오기 실패!!" + ee.getMessage());
		} finally {
			try { pstmt.close(); rs.close(); } catch (SQLException e) { }
		}
		return dptList;
	}

	public boolean editDepartment(DepartmentDTO departDto) {
		String query = "update department set deptname = ?, floor = ? where deptno = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, departDto.getDeptName());
			pstmt.setInt(2, departDto.getFloor());
			pstmt.setInt(3, departDto.getDeptNo());

			pstmt.executeUpdate();

		} catch (SQLException ee) {
			logger.error("editDepartment(DepartmentDTO) - 부서 정보수정 실패!!" + ee.getMessage());
			return false;
		} finally {
			try { pstmt.close(); } catch (SQLException e) { }
		}
		return true;
	}

	public boolean deleteDepartment(String deptNo) {
		String query = "delete from department where deptno = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, deptNo);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException ee) {
			logger.error("deleteDepartment(String) - 부서 삭제 실패!!" + ee.getMessage());
			return false;
		} finally {
			try { pstmt.close(); } catch (SQLException e) { }
		}
		return true;
	}

}
