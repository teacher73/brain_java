package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Tes {
	public static void main(String[] args) {
		
		
		
        File file = new File("data.txt");
        
        try {
/*        	FileWriter fw = new FileWriter(file);
        	fw.write("aaaaaa");*/
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
    }
}
