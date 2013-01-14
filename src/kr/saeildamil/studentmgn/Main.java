package kr.saeildamil.studentmgn;

import kr.saeildamil.studentmgn.ctrl.StudentManger;
import kr.saeildamil.studentmgn.dao.FileConn;

public class Main {
	public static void main(String[] args) {
		new StudentManger(new FileConn());
	}
}
