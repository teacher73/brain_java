package chapter02_test;

public class Ex02_2 {
	static boolean[] lottoTable = new boolean[45];
	
	public static void main(String[] args) {
		
		for (int i=0; i<6; i++){
			createNum();
		}		
		
		for(int i=0; i<lottoTable.length; i++)
			if (lottoTable[i]) System.out.print(i+1 + "\t");
		
	}

	private static void createNum() {
		int num = (int) (Math.random()*45);
		if(!lottoTable[num]) lottoTable[num]=true;
		else createNum();
	}

}
