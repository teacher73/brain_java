package kr.saeildamil.studentmgn.dao;

import java.sql.Connection;

import kr.saeildamil.studentmgn.dao.close.DbCloseDao;
import kr.saeildamil.studentmgn.dao.delete.DbDeleteStudent;
import kr.saeildamil.studentmgn.dao.insert.DbInsertStudent;
import kr.saeildamil.studentmgn.dao.open.DbOpenDao;
import kr.saeildamil.studentmgn.dao.select.DbSelectStudent;
import kr.saeildamil.studentmgn.dao.update.DbUpdateStudent;

public class DBConn extends Conn {
	private Connection conn;
	
	private DBConn() {
		insStd = new DbInsertStudent();
		upStd = new DbUpdateStudent();
		delStd = new DbDeleteStudent();
		selStd = new DbSelectStudent();	
		openDao = new DbOpenDao(conn);
		openDao.openRes();
		closeDao = new DbCloseDao(conn);
	}
	
	public static DBConn getInstance(){
		return new DBConn();
	}
	


}
