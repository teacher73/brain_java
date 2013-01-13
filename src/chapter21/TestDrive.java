/**
 *
 * @package		: chapter21
 * @FileName	: TestDrive.java
 * @Date  		: 2012. 10. 18.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package chapter21;

import java.util.ArrayList;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 10. 18. 오전 1:04:19
 * @version	1.0.0
 */

public class TestDrive {

	public static void main(String[] args) {
		DepartmentDAO obj = new DepartmentDAO();
		//ArrayList<DepartmentDTO> list = new ArrayList<DepartmentDTO>();
		ArrayList<DepartmentDTO> list = obj.listDepartment();
		for(DepartmentDTO dept : list){
			System.out.print(dept.getDeptNo() + "\t");
			System.out.print(dept.getDeptName() + "\t");
			System.out.print(dept.getFloor() + "\n");
		}
	}

}
