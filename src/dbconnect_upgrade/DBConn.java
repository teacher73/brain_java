/*
 *
 * @package		: chapter21
 * @FileName	: DBConn.java
 * @Date  		: 2012. 10. 18.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package dbconnect_upgrade;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 10. 18. 오전 12:07:37
 * @version	1.0.0
 */

public final class DBConn {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(DBConn.class);
	private volatile static DBConn instance;
	private static Connection conn;
	
	private DBConn() {
		Properties props = new Properties();
		try {
			props.load(new BufferedInputStream(new FileInputStream("dbinfo.properties")));
			Class.forName(props.getProperty("driver"));
			conn = DriverManager.getConnection(
					props.getProperty("url"), 
					props.getProperty("user"), 
					props.getProperty("pass"));
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
	
	public static DBConn getInstance(){//DCL(Double-Checking Locking)
		if(instance == null){
			synchronized (DBConn.class) {
				if (instance == null){
					instance = new DBConn();
				}
			}
		}
		return instance;
	}	
	
	public static Connection getConn(){
		return conn;
	}

	public static void dbClose(){
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
				instance = null;
				conn = null;
			}
		}
	}

}
