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
import studentmanager.DAO.delete.DeleteStd;
import studentmanager.DAO.insert.InsertStd;
import studentmanager.DAO.update.UpdateStd;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 13. 오후 1:21:38
 * @version	1.0.0
 */

public abstract class ResDao {
	InsertStd insertStd;
	DeleteStd deleteStd;
	UpdateStd updateStd;
	ArrayList<Student> stdList;
	
	public abstract ArrayList<Student> readRes();
	public abstract void writeRes(boolean append);
	public abstract void insertStudent(Student std);
	public abstract void deleteStudent(int idx);
	public abstract void updateStudent(int idx, Student std);
	/**
	 * @param insertStd the insertStd to set
	 */
	public void setInsertStd(InsertStd insertStd) {
		this.insertStd = insertStd;
	}

	/**
	 * @param deleteStd the deleteStd to set
	 */
	public void setDeleteStd(DeleteStd deleteStd) {
		this.deleteStd = deleteStd;
	}
	
	/**
	 * @param updateStd the updateStd to set
	 */
	public void setUpdateStd(UpdateStd updateStd) {
		this.updateStd = updateStd;
	}
	public void prnStdList() {
		int cnt = 1;
		for (Student std : stdList){
			System.out.print(cnt++ + " : " +  std);
			System.out.println();
		}
		System.out.println();
	}
	
	
}
