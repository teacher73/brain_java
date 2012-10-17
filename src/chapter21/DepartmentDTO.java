/**
 *
 * @package		: chapter21
 * @FileName	: DepartmentDTO.java
 * @Date  		: 2012. 10. 17.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package chapter21;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 10. 17. 오후 11:55:58
 * @version	1.0.0
 */

public class DepartmentDTO {
	private int deptNo;
	private String deptName;
	private int floor;
	
	/**
	 * Constructor of DepartmentDTO.java class
	 */
	public DepartmentDTO() {}

	/**
	 * Constructor of DepartmentDTO.java class
	 * @param deptNo
	 * @param deptName
	 * @param floor
	 */
	public DepartmentDTO(int deptNo, String deptName, int floor) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.floor = floor;
	}

	/**
	 * @return the deptNo
	 */
	public int getDeptNo() {
		return deptNo;
	}

	/**
	 * @param deptNo the deptNo to set
	 */
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * @return the floor
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	
}
