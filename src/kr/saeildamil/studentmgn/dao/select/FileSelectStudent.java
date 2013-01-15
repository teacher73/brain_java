package kr.saeildamil.studentmgn.dao.select;

import java.util.ArrayList;

import kr.saeildamil.studentmgn.common.Student;

public class FileSelectStudent implements SelectStudent {

	@Override
	public void selectStudent(ArrayList<Student> stdList) {
		if (stdList.isEmpty()) return;
		int idx = 1;
		for (Student std : stdList){
			System.out.print(idx++ + " : " + std);
			System.out.println();
		}
		System.out.println();
	}

}
