/**
 *
 * @package		: studentmanager
 * @FileName	: ResConn.java
 * @Date  		: 2013. 1. 13.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package studentmanager.DAO;

import java.util.ArrayList;

import studentmanager.Student;
import studentmanager.DAO.insert.InsertStd;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 13. 오후 1:21:38
 * @version	1.0.0
 */

public abstract class ResDao {
	InsertStd insertStd;
	ArrayList<Student> stdList;
	
	public abstract ArrayList<Student> readRes();
	public abstract void writeRes(boolean append);
	public abstract void insertStudent(Student std);
	
	/**
	 * @return the insertStd
	 */
	public InsertStd getInsertStd() {
		return insertStd;
	}
	/**
	 * @param insertStd the insertStd to set
	 */
	public void setInsertStd(InsertStd insertStd) {
		this.insertStd = insertStd;
	}
	
	public void prnStdList() {
		for (Student std : stdList){
			System.out.print(std);
			System.out.println();
		}
		System.out.println();
	}
	
	
}
