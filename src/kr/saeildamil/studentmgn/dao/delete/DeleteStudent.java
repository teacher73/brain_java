package kr.saeildamil.studentmgn.dao.delete;

import java.util.ArrayList;

import kr.saeildamil.studentmgn.common.Student;

public interface DeleteStudent {
	void deleteStudent(ArrayList<Student> stdList, int idx);
}
