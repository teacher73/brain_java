package fileio;

import java.io.File;
import java.io.PrintWriter;

public class Connect {
	protected static Connect conInstance;
	
	public Connect() {
		PrintWriter fw=null;
		File file = new File("data.txt");
	}

	public static synchronized Connect getInstance() {
		if (conInstance == null) {
			conInstance = new Connect();
		}
		return conInstance;
	}
 
}
