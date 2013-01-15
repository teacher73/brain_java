package kr.saeildamil.studentmgn.dao.insert;

import java.util.ArrayList;

import kr.saeildamil.studentmgn.common.Student;

public class FileInsertStudent implements InsertStudent{

	@Override
	public void insertStudent(ArrayList<Student> stdList, Student std) {
		stdList.add(std);
	}

}
