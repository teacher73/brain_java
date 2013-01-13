/**
 *
 * @package		: studentmanager
 * @FileName	: ResConn.java
 * @Date  		: 2013. 1. 13.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package studentmanager;

import java.util.ArrayList;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 13. 오후 1:21:38
 * @version	1.0.0
 */

public abstract class ResConn {
	ArrayList<Student> stdList;
	RegisterStd resigerStd;
	UpdateStd updateStd;
	DeleteStd deleteStd;
	ListStd listStd;
	
	abstract void insertStudent(Student std);
	abstract void updateStudent(Student std);
	abstract void deleteStudent(Student std);
	abstract void listStudent(Student std);
}
