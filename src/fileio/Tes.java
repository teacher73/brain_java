package fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tes {
	public static void main(String[] args) {
		PrintWriter fw=null;
		Scanner scanner = null;
        File file = new File("data.txt");
        String[] data={"김태희;99;98;97","이민정;81;82;83", "수지;77;78;79"};
        
        try {
        	fw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        	for(String str:data){
        		fw.printf(str+"\n");
        	}
        	fw.close();

            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//fw.close();
			scanner.close();
		}
         
    }
}
