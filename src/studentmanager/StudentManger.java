package studentmanager;

import java.util.Scanner;

import studentmanager.DAO.ResDao;

public class StudentManger {
	ResDao resDao;

	public StudentManger(ResDao resDao) {
		this.resDao = resDao;
		this.resDao.prnStdList();
		init();
	}

	private void init() {
		boolean isFinish = false;
		do {
			switch (Integer.parseInt(inputKey("1.입력 2.수정 3.삭제 4.출력 5.종료"))) {
			case 1:
				resDao.insertStudent((Student)getInfo("학생명,국어,영어,수학"));
				break;
			case 2:
				resDao.updateStudent(Integer.parseInt(inputKey("수정할 학생 번호 ")), (Student)getInfo("학생명,국어,영어,수학"));
				break;
			case 3:
				resDao.deleteStudent((int)getInfo("학생 번호"));
				break;
			case 4:
				resDao.prnStdList();
				break;
			default:
				isFinish = true;
				resDao.writeRes(false);
				break;
			}
		} while (!isFinish);

	}

	private Object getInfo(String str){
		String[] strDat = inputKey(str).split(",");
		if(strDat.length ==1) return new Integer(strDat[0]);
		if (strDat.length != 4)	return null;
		return new Student(
				strDat[0],
				Float.parseFloat(strDat[1]), 
				Float.parseFloat(strDat[2]), 
				Float.parseFloat(strDat[3]));
	}

	private String inputKey(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.println(str + " 를(을) 입력하세요");
		return sc.next();
	}

}
