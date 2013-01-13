/**
 *
 * @package		: dbconnect_upgrade
 * @FileName	: LogException.java
 * @Date  		: 2013. 1. 6.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package dbconnect_upgrade;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 6. 오전 1:30:53
 * @version	1.0.0
 */

public class LogException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9076656403436192607L;

	/**
	 * Constructor of LogException.java class
	 * @param message
	 * @param throwable
	 */
	public LogException(String message, Throwable throwable) {
		super(message, throwable);
	}
	
}
