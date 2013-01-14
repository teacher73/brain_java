package kr.saeildamil.studentmgn.dao;

import java.util.ArrayList;

import kr.saeildamil.studentmgn.common.Student;
import kr.saeildamil.studentmgn.dao.delete.DeleteStudent;
import kr.saeildamil.studentmgn.dao.insert.InsertStudent;
import kr.saeildamil.studentmgn.dao.update.UpdateStudent;

public abstract class Conn {
	protected ArrayList<Student> stdList;
	protected InsertStudent insStd;
	protected UpdateStudent upStd;
	protected DeleteStudent delStd;
	
	abstract public void openCon();
	abstract public void closeCon();
	abstract public void insertStudent(Student std);
	abstract public void updateStudent(int idx, Student std);
	abstract public void deleteStudent(int idx);
	
	public ArrayList<Student> getStdList() {
		return stdList;
	}
	public void setInsStd(InsertStudent insStd) {
		this.insStd = insStd;
	}
	
	public void setUpStd(UpdateStudent upStd) {
		this.upStd = upStd;
	}
	
	public void setDelStd(DeleteStudent delStd) {
		this.delStd = delStd;
	}
	
	public void prnStdList() {
		int idx = 1;
		for (Student std : stdList){
			System.out.print(idx++ + " : " + std);
			System.out.println();
		}
		System.out.println();
	}
}
