/**
 *
 * @package		: chapter21
 * @FileName	: Employee.java
 * @Date  		: 2012. 10. 17.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package dbconnect_upgrade;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 10. 17. 오후 11:50:53
 * @version	1.0.0
 */

public class EmployeeDTO {
	private int empNo;
	private String empName;
	private String title;
	private int manager;
	private int salary;
	private int dno;
	
	public EmployeeDTO(){}
	/**
	 * Constructor of Employee.java class
	 * @param empNo
	 * @param empName
	 * @param title
	 * @param manager
	 * @param salary
	 * @param dno
	 */
	public EmployeeDTO(int empNo, String empName, String title, int manager,
			int salary, int dno) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.title = title;
		this.manager = manager;
		this.salary = salary;
		this.dno = dno;
	}
	/**
	 * @return the empNo
	 */
	public int getEmpNo() {
		return empNo;
	}
	/**
	 * @param empNo the empNo to set
	 */
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the manager
	 */
	public int getManager() {
		return manager;
	}
	/**
	 * @param manager the manager to set
	 */
	public void setManager(int manager) {
		this.manager = manager;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @return the dno
	 */
	public int getDno() {
		return dno;
	}
	/**
	 * @param dno the dno to set
	 */
	public void setDno(int dno) {
		this.dno = dno;
	}
	
}
