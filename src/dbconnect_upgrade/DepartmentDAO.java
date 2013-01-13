/**
 *
 * @package		: chapter21
 * @FileName	: DepartmentDAO.java
 * @Date  		: 2012. 10. 18.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package dbconnect_upgrade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

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

	public void registerDepartment(DepartmentDTO departDto) {
		String query = "insert into department values (null, ?, ?)";
		PreparedStatement pstmt = null;

		try {
			DBConn.getInstance();
			pstmt = DBConn.getConn().prepareStatement(query);
			pstmt.setString(1, departDto.getDeptName());
			pstmt.setInt(2, departDto.getFloor());
			pstmt.executeUpdate();
			if (logger.isDebugEnabled()) {
				logger.debug("registerDepartment(DepartmentDTO) - 부서 등록 성공");
			}
		} catch (SQLException ee) {
			logger.error("registerMember(DepartmentDTO) - 부서 등록 실패!!"	+ ee.getMessage());
		} finally {
			try { pstmt.close(); DBConn.dbClose();} catch (SQLException e) { }
		}
	}

	public ArrayList<DepartmentDTO> listDepartment() {
		ArrayList<DepartmentDTO> dptList = new ArrayList<DepartmentDTO>();
		String query = "select deptno, deptname, floor from department";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			DBConn.getInstance();
			pstmt = DBConn.getConn().prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				DepartmentDTO obj = new DepartmentDTO();
				obj.setDeptNo(rs.getInt("deptno"));
				obj.setDeptName(rs.getString("deptname"));
				obj.setFloor(rs.getInt("floor"));
				dptList.add(obj);
			}
			if (logger.isDebugEnabled()) {
				logger.debug("listDepartment() - 부서리스트 가져오기  성공");
			}
		} catch (SQLException ee) {
			logger.error("listDepartment(String) - 부서리스트 가져오기 실패!!");
		} finally {
			try { pstmt.close(); rs.close(); DBConn.dbClose();} catch (SQLException e) { }
		}
		return dptList;
	}

	public void editDepartment(DepartmentDTO departDto) {
		String query = "update department set deptname = ?, floor = ? where deptno = ?";
		PreparedStatement pstmt = null;
		try {
			DBConn.getInstance();
			pstmt = DBConn.getConn().prepareStatement(query);
			pstmt.setString(1, departDto.getDeptName());
			pstmt.setInt(2, departDto.getFloor());
			pstmt.setInt(3, departDto.getDeptNo());

			pstmt.executeUpdate();
			if (logger.isDebugEnabled()) {
				logger.debug("editDepartment(DepartmentDTO) - 부서 정보 수정 성공");
			}
		} catch (SQLException ee) {
			logger.error("editDepartment(DepartmentDTO) - 부서 정보수정 실패!!");
		} finally {
			try { pstmt.close();DBConn.dbClose();} catch (SQLException e) { }
		}
	}

	public void deleteDepartment(int deptNo) {
		String query = "delete from department where deptno = ?";
		PreparedStatement pstmt = null;
		try {
			DBConn.getInstance();
			pstmt = DBConn.getConn().prepareStatement(query);
			pstmt.setInt(1, deptNo);
			pstmt.executeUpdate();
			if (logger.isDebugEnabled()) {
				logger.debug("deleteDepartment(String) - 부서 정보 삭제 성공");
			}
		} catch (SQLException ee) {
			logger.error("deleteDepartment(String) - 부서 삭제 실패!!");
		} finally {
			try { pstmt.close();DBConn.dbClose();} catch (SQLException e) { }
		}
	}
	
	public DepartmentDTO deptInfo(int deptNo){
		String query = "select * from department where deptno = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DepartmentDTO deptDto = null;
		try {
			DBConn.getInstance();
			pstmt = DBConn.getConn().prepareStatement(query);
			pstmt.setInt(1, deptNo);
			rs = pstmt.executeQuery();
			rs.next();
			deptDto = new DepartmentDTO(rs.getInt(1),rs.getString(2), rs.getInt(3));
			if (logger.isDebugEnabled()) {
				logger.debug("deleteDepartment(String) - 부서 정보 삭제 성공");
			}
		} catch (SQLException ee) {
			logger.error("deleteDepartment(String) - 부서 삭제 실패!!");
		} finally {
			try { pstmt.close();} catch (SQLException e) { }
		}
		return deptDto;
	}
	
}
