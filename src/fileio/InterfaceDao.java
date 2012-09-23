package fileio;

import java.util.ArrayList;


public interface InterfaceDao {
	void insertDao(Student student);
	void deleteDao(Student student);
	ArrayList<Student> selectDao(Student student);
	ArrayList<Student> listDao();
	void updateDao(Student student);
}
