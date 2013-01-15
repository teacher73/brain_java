package kr.saeildamil.studentmgn;

import java.util.Scanner;

import kr.saeildamil.studentmgn.ctrl.StudentManager;
import kr.saeildamil.studentmgn.dao.DBConn;
import kr.saeildamil.studentmgn.dao.FileConn;

public class Main {
	public static void main(String[] args) {
		if (question()==1)
			new StudentManager(new FileConn());
		else
			new StudentManager(new DBConn());
	}
	
	public static int question(){
		System.out.println("1. 파일처리 2.DB처리");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
