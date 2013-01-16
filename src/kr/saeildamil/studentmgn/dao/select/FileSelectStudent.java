package kr.saeildamil.studentmgn.dao.select;

import java.util.ArrayList;

import kr.saeildamil.studentmgn.common.Student;

public class FileSelectStudent implements SelectStudent {
	ArrayList<Student> stdList;
	
	public FileSelectStudent(ArrayList<Student> stdList) {
		this.stdList = stdList;
	}
	@Override
	public void listStudent() {
		int idx = 1;
		for (Student std : stdList){
			System.out.print(idx++ + " : " + std);
			System.out.println();
		}
		System.out.println();
	}
	@Override
	public void selectStudent(int idx) {
		if (stdList.contains(stdList.get(idx-1))){
			System.out.println(stdList.get(idx-1));
		}
	}
	@Override
	public void listStdName() {
		int idx = 1;
		for (Student std : stdList){
			System.out.print(idx++ + " : " + std.getStdName());
			System.out.println();
		}
		System.out.println();
	}

}
