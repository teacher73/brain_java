package fileio;

import java.util.ArrayList;


public abstract class FileDao {
	InterfaceDao interdao;
	
	public InterfaceDao getInterdao() {
		return interdao;
	}

	public void setInterdao(InterfaceDao interdao) {
		this.interdao = interdao;
	}
	
	public void insertStd(Student student){
		interdao.insertDao(student);
	}
	
	public void deleteStd(Student student){
		interdao.deleteDao(student);
	}
	
	public ArrayList<Student> selectStd(Student student){
		return interdao.selectDao(student);
	}
	
	public ArrayList<Student> listStd(){
		return interdao.listDao();
	}
	
	public void updateStd(Student student){
		interdao.updateDao(student);
	}
}
