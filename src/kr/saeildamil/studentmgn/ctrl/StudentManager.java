package kr.saeildamil.studentmgn.ctrl;

import java.util.Scanner;

import kr.saeildamil.studentmgn.common.Student;
import kr.saeildamil.studentmgn.dao.Conn;

public class StudentManager {
	Conn con;

	public StudentManager(Conn con) {
		this.con = con;
		menu();
	}

	private void menu() {
		boolean isFinish = false;
		con.getSelStd().selectStudent();
		do {
			
			switch (Integer.parseInt(inputKey("1.입력 2.수정 3.삭제 4.출력 5.종료"))) {
			case 1:
				con.getInsStd().insertStudent(registerStd(inputKey("학생명,국어,영어,수학")));
				break;
			case 2:
				con.getUpStd().updateStudent(Integer.parseInt(inputKey("수정 할 학생 번호"))-1, registerStd(inputKey("학생명,국어,영어,수학")));
				break;
			case 3:
				con.getDelStd().deleteStudent(Integer.parseInt(inputKey("삭제 할 학생 번호"))-1);
				break;
			case 4:
				con.getSelStd().selectStudent();
				break;
			default:
				isFinish = true;
				con.closeCon();
				break;
			}
		} while (!isFinish);

	}

	private Student registerStd(String str) {
		String[] strDat = str.split(",");
		if(strDat.length!=4)return null;
		Student std = new Student(strDat[0], Float.parseFloat(strDat[1]),
				Float.parseFloat(strDat[2]), Float.parseFloat(strDat[3]));
		return std;
	}
	
	
	private String inputKey(String str) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println(str + " 를(을) 입력하세요");
		return sc2.next();
	}
}
