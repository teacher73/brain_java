/**
 *
 * @package		: fileio
 * @FileName	: DBCon.java
 * @Date  		: 2012. 9. 25.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package fileio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 25. 오후 11:46:16
 * @version	1.0.0
 */

public class DBCon {
	private static Connection con;

	private DBCon() { }
	
	static{

		try {
			String url = "jdbc:mysql://localhost:3306/test";
			String user="";
			String password="";
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection(){
		return con;
	}
	
}
