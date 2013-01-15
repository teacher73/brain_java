package kr.saeildamil.studentmgn.dao.insert;

import java.util.ArrayList;

import kr.saeildamil.studentmgn.common.Student;

public class FileInsertStudent implements InsertStudent{
	ArrayList<Student> stdList;
	
	public FileInsertStudent(ArrayList<Student> stdList) {
		this.stdList = stdList;
	}

	@Override
	public void insertStudent(Student std) {
		stdList.add(std);
	}

}
