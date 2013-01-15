package kr.saeildamil.studentmgn.dao.delete;

import java.util.ArrayList;

import kr.saeildamil.studentmgn.common.Student;

public class FileDeleteStudent implements DeleteStudent{
	ArrayList<Student> stdList;
	
	public FileDeleteStudent(ArrayList<Student> stdList) {
		this.stdList = stdList;
	}
	@Override
	public void deleteStudent(int idx) {
		stdList.remove(idx);
	}

}
