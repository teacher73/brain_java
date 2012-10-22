package chapter17;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DistChart implements Serializable{
	int[][] arr;

	public DistChart() {
		this.arr = new int[10][10];
	}
	
	private void writeObject(ObjectOutputStream out) throws IOException{
		for(int row=0; row<arr.length;row++)
			for(int col=0; col<arr[0].length;col++)
				if(arr[row][col]!=0){
					out.writeInt(row);
					out.writeInt(col);
					out.writeInt(arr[row][col]);
				}
	}
	
	private void readObject(ObjectInputStream in) throws IOException,ClassNotFoundException{
		arr = new int[10][10];
		try{
			while(true){
				int row = in.readInt();
				int col = in.readInt();
				arr[row][col] = in.readInt();
			}
		}catch(EOFException e){}
	}
	
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		ObjectInputStream in = null;
		
		try{
			oos = new ObjectOutputStream(new FileOutputStream("output5.dat"));
			DistChart obj = new DistChart();
			obj.arr[0][1]=2;
			obj.arr[4][5]=5;
			obj.arr[6][1]=2;
			obj.arr[7][7]=7;
			obj.arr[8][4]=21;
			oos.writeObject(obj);
		}catch(IOException e){
			System.out.println("파일로 출력 불가능");
		}finally{
			try{ oos.close(); } catch(Exception e){}
		}
		
		try {
			in = new ObjectInputStream(new FileInputStream("output5.dat"));
			DistChart obj = (DistChart) in.readObject();
			
			for(int row=0; row<obj.arr.length;row++){
				for(int col=0; col<obj.arr[0].length; col++)
					System.out.printf("%3d", obj.arr[row][col]);
				System.out.println();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			try{ in.close(); } catch(Exception e){}
		}

	}
}
