package kr.saeildamil.studentmgn.dao;

import kr.saeildamil.studentmgn.dao.close.CloseDao;
import kr.saeildamil.studentmgn.dao.delete.DeleteStudent;
import kr.saeildamil.studentmgn.dao.insert.InsertStudent;
import kr.saeildamil.studentmgn.dao.open.OpenDao;
import kr.saeildamil.studentmgn.dao.select.SelectStudent;
import kr.saeildamil.studentmgn.dao.update.UpdateStudent;

public abstract class Conn {

	protected InsertStudent insStd;
	protected UpdateStudent upStd;
	protected DeleteStudent delStd;
	protected SelectStudent selStd;
	protected OpenDao openDao;
	protected CloseDao closeDao;

	
	public InsertStudent getInsStd() {
		return insStd;
	}
	public UpdateStudent getUpStd() {
		return upStd;
	}
	public DeleteStudent getDelStd() {
		return delStd;
	}
	public SelectStudent getSelStd() {
		return selStd;
	}
	public OpenDao getOpenDao() {
		return openDao;
	}
	public CloseDao getCloseDao() {
		return closeDao;
	}
	
}
