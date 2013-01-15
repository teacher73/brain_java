package kr.saeildamil.studentmgn.dao;

import kr.saeildamil.studentmgn.dao.delete.DeleteStudent;
import kr.saeildamil.studentmgn.dao.insert.InsertStudent;
import kr.saeildamil.studentmgn.dao.select.SelectStudent;
import kr.saeildamil.studentmgn.dao.update.UpdateStudent;

public abstract class Conn {

	protected InsertStudent insStd;
	protected UpdateStudent upStd;
	protected DeleteStudent delStd;
	protected SelectStudent selStd;
	
	abstract public void openCon();
	abstract public void closeCon();
	
	public void setInsStd(InsertStudent insStd) {
		this.insStd = insStd;
	}
	
	public void setUpStd(UpdateStudent upStd) {
		this.upStd = upStd;
	}
	
	public void setDelStd(DeleteStudent delStd) {
		this.delStd = delStd;
	}
	
	public void setSelStd(SelectStudent selStd) {
		this.selStd = selStd;
	}
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
	
}
