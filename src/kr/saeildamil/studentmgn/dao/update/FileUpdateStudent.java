package kr.saeildamil.studentmgn.dao.update;

import java.util.ArrayList;

import kr.saeildamil.studentmgn.common.Student;

public class FileUpdateStudent implements UpdateStudent{
	ArrayList<Student> stdList;
	
	public FileUpdateStudent(ArrayList<Student> stdList) {
		this.stdList = stdList;
	}
	@Override
	public void updateStudent(int idx, Student std) {
		stdList.set(idx-1, std);
	}

}
