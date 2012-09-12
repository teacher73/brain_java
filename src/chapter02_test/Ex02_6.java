package chapter02_test;

import java.util.Scanner;

public class Ex02_6 {
	public static void main(String[] args) {
		String[] sbj = {"국어", "영어", "수학", "총점", "평균"};
		float[][] table = new float[3][5];
		
		for(int i=0; i<table.length; i++){
			table[i]=addJumsu();
		}
		
		printArr(table, sbj);
	}

	private static float[] addJumsu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.. ex) 국어;영어;수학");
		
		String[] str = sc.next().split(";");
		float[] jumsu = new float[5];
		float total=0;
		
		for(int i =0; i<jumsu.length-2; i++){
			jumsu[i]=Float.parseFloat(str[i]);
			total +=jumsu[i];
		}
		jumsu[jumsu.length-2]= total;
		jumsu[jumsu.length-1] = total/3;
		
		return jumsu;
	}
	
	private static void printArr(float[][] table, String[] subj) {
		System.out.println("============================");;
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
