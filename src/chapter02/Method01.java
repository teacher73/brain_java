package chapter02;

public class Method01 {

	public static void main(String[] args) {
		
		int[][] table = new int[3][];
		table[0] = new int[3];
		table[1] = new int[4];
		table[2] = new int[5];
		
		int num=1;
		
		for(int i=0; i<table.length; i++){
			for(int j=0; j<table[i].length; j++){
				table[i][j] = num++; 
			}
		}
		
		printArr(table);
	}

	static void printArr(int[][] t){
		for(int i=0; i<t.length; i++){
			for(int j=0; j<t[i].length; j++){
				System.out.print(t[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
