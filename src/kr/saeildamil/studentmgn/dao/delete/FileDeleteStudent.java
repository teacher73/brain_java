package kr.saeildamil.studentmgn.dao.delete;

import java.util.ArrayList;

import kr.saeildamil.studentmgn.common.Student;

public class FileDeleteStudent implements DeleteStudent{

	@Override
	public void deleteStudent(ArrayList<Student> stdList, int idx) {
		stdList.remove(idx);
	}

}
