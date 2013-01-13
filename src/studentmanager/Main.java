package studentmanager;

import java.util.Scanner;

import studentmanager.DAO.DBResDao;
import studentmanager.DAO.FileResDao;
import studentmanager.DAO.ResDao;
import studentmanager.DAO.insert.FileInsert;

public class Main {
	public static void main(String[] args) {
		new StudentManger(checkDao());
	}
	
	private static ResDao checkDao(){
		System.out.println("1. 파일처리 2. DB처리");
		Scanner sc =new Scanner(System.in);
		ResDao dao=null;
		if (sc.nextInt() == 1) {
			dao = new FileResDao();
			dao.setInsertStd(new FileInsert());

		} else {
			return new DBResDao();
		}
		return dao;
	}
}
