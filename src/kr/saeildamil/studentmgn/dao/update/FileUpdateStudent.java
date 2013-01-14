package kr.saeildamil.studentmgn.dao.update;

import java.util.ArrayList;

import kr.saeildamil.studentmgn.common.Student;

public class FileUpdateStudent implements UpdateStudent{

	@Override
	public void updateStudent(ArrayList<Student> stdList, int idx, Student std) {
		stdList.set(idx, std);
	}

}
