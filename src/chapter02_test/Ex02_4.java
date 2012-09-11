package chapter02_test;

public class Ex02_4 {

	public static void main(String[] args) {
		int[] answer = {90, 80, 70, 65, 98, 81, 55, 78, 88, 91, 
						78, 91, 85, 82, 76, 41, 35, 22, 9, 19, 
						66, 43, 42, 24, 35, 7, 6, 69, 99, 99, 93};
		int[] counter = new int[10];
		
		for(int i=0; i<answer.length; i++){
			counter[answer[i]/10]++;
		}
		
		for(int i=counter.length-1; i >=0 ; i--){
			System.out.printf("%2d 점이상 :", i*10);
			for(int j=0; j<counter[i]; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
