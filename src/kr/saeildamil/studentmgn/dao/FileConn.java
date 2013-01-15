package kr.saeildamil.studentmgn.dao;

import java.io.File;
import java.util.ArrayList;

import kr.saeildamil.studentmgn.common.Student;
import kr.saeildamil.studentmgn.dao.close.FileCloseDao;
import kr.saeildamil.studentmgn.dao.delete.FileDeleteStudent;
import kr.saeildamil.studentmgn.dao.insert.FileInsertStudent;
import kr.saeildamil.studentmgn.dao.open.FileOpenDao;
import kr.saeildamil.studentmgn.dao.select.FileSelectStudent;
import kr.saeildamil.studentmgn.dao.update.FileUpdateStudent;

public class FileConn extends Conn {
	protected ArrayList<Student> stdList;
	private File file;
	private final String filepath = "StudentList.data"; 
	
	private FileConn() {
		stdList = new ArrayList<>();
		file = new File(filepath);
		openDao = new FileOpenDao(stdList, file);
		openDao.openRes();
		insStd = new FileInsertStudent(stdList);
		upStd = new FileUpdateStudent(stdList);
		delStd = new FileDeleteStudent(stdList);
		selStd = new FileSelectStudent(stdList);	
		closeDao = new FileCloseDao(file, stdList);
	}
	
	public static FileConn getInstance(){
		return new FileConn();
	}
	
}
