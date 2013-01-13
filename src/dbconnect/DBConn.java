/*
 *
 * @package		: chapter21
 * @FileName	: DBConn.java
 * @Date  		: 2012. 10. 18.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package dbconnect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 10. 18. 오전 12:07:37
 * @version	1.0.0
 */

public class DBConn {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(DBConn.class);

	private String driver;
	private String url;
	private String id;
	private String pass;
	private Connection conn;

	private DBConn() {
		File data = new File("dbinfo.damil");
		try {
			BufferedReader in = new BufferedReader(new FileReader(data));
			driver = in.readLine();
			url = in.readLine();
			id =in.readLine();
			pass = in.readLine();
			in.close();
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pass);
			if (logger.isDebugEnabled()) {
				logger.debug("DBConn() - DB 연결 성공");
			}
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
			if (logger.isDebugEnabled()) {
				logger.debug("DBConn() - DB 검색 실패");
			}
			System.exit(-1);
		} catch (SQLException e) {
			if (logger.isDebugEnabled()) {
				logger.debug("DBConn() - Connection 객체 생성 실패");
			}
			System.exit(-1);// -1인 경우 비정상 종료로 컴퓨터가 인식
		}
	}
	
	public static DBConn getInstance(){
		return new DBConn();
	}

	public Connection getConn(){
		return this.conn;
	}
	
	public void dbClose(){
		if (conn != null){
			try {
				if (!conn.isClosed()){
					conn.close();
					if (logger.isDebugEnabled()) {
						logger.debug("close() - DB 종료");
					}
				}
			} catch (SQLException e) {
				if (logger.isDebugEnabled()) {
					logger.debug("close() - Connection 객체 해제 실패");
				}
			} finally{
				conn = null;
			}
		}
	}
	
}
