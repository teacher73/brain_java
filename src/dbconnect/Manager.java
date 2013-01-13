package dbconnect;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	private DBConn con;
	private DepartmentDAO obj;
	private Scanner sc;

	public Manager(DBConn con) {
		this.con = con;
		obj = new DepartmentDAO(con);
		init();
	}

	public void init() {
		int result = 0;
		sc = new Scanner(System.in);
		do {
			prnList();
			System.out
					.println("1. 부서 추가  2. 부서 정보 수정  3. 부서정보 삭제 4. 부서정보 리스트 5. 종료");
			result = sc.nextInt();
			switch (result) {
			case 1:
				insert();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			case 4:
				prnList();
				break;
			default:
				sc.close();
				con.dbClose();
			}
		} while (result != 5);
		System.exit(0);
	}

	private void delete() {
		System.out.println("삭제할 부서번호를 입력하세요. ");
		int result = sc.nextInt();
		obj.deleteDepartment(result);
	}

	private void update() {
		System.out.println("수정하고자하는 부서번호를 입력하세요.");
		int deptNo = sc.nextInt();
		DepartmentDTO deptDTO = obj.deptInfo(deptNo);

		System.out.println("부서명");
		deptDTO.setDeptName(sc.next().trim());
		System.out.println("부서위치");
		deptDTO.setFloor(sc.nextInt());
		obj.editDepartment(deptDTO);
	}

	private void insert() {
		System.out.println("부서명");
		String deptName = sc.next();
		System.out.println("부서위치");
		int deptFloor = sc.nextInt();
		DepartmentDTO dept = new DepartmentDTO();
		dept.setDeptName(deptName.trim());
		dept.setFloor(deptFloor);
		obj.registerDepartment(dept);
	}

	private void prnList() {
		ArrayList<DepartmentDTO> list = new ArrayList<DepartmentDTO>();
		list = obj.listDepartment();
		for (DepartmentDTO dept : list) {
			System.out.print(dept.getDeptNo() + "\t");
			System.out.print(dept.getDeptName() + "\t");
			System.out.print(dept.getFloor() + "\n");
		}
	}
}
