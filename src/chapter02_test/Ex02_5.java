package chapter02_test;

import java.util.Scanner;

public class Ex02_5 {
	public static void main(String[] args) {
		String[] sbj = {"국어", "영어", "수학", "총점", "평균"};
		float[][] table = new float[3][5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<table.length; i++){
			System.out.println("성적을 입력하세요..");
			float total=0;
			
			for(int j=0; j<table[i].length-2; j++){
				System.out.print(sbj[j] + "점수 입력 ");
				table[i][j] = sc.nextFloat();
				total +=table[i][j];
			}

			table[i][table[i].length-2] = total;
			table[i][table[i].length-1] = total/3;
			/*System.out.println(table[i][0] + "\t"+ table[i][1] + "\t"+table[i][2] + "\t"+table[i][3] + "\t"+table[i][4] + "\t");*/
		}
		
		printArr(table, sbj);
	}

	private static void printArr(float[][] table, String[] subj) {
		System.out.println("============================");
		for(int i=0; i<subj.length; i++)System.out.print(subj[i]+ "\t");
		System.out.println();
		float totKor=0.0F, totEng=0.0F, totMath=0.0F, totSum=0.0F, totAvg=0.0F;
		
		for(int i=0; i<table.length; i++){
			for(int j=0; j<table[i].length; j++){
				System.out.printf("%3.1f \t",table[i][j]);
			}
			System.out.println();
		}
		for(int i=0; i<table.length; i++){
			totKor +=table[i][0];
			totEng +=table[i][1];
			totMath +=table[i][2];
			totSum +=table[i][3];
			totAvg +=table[i][4];
		}
		System.out.println("============================");
		System.out.printf("%3.1f \t%3.1f\t%3.1f\t%3.1f\t%3.1f",
				totKor/table.length,totEng/table.length, totMath/table.length, totSum/table.length, totAvg/table.length);
		
	}
}
