package kr.saeildamil.studentmgn.dao.update;

import java.util.ArrayList;

import kr.saeildamil.studentmgn.common.Student;

public interface UpdateStudent {
	void updateStudent(ArrayList<Student> stdList, int idx, Student std);
}
