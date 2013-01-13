/**
 *
 * @package		: chapter21
 * @FileName	: TestDrive.java
 * @Date  		: 2012. 10. 18.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package dbconnect;


/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 10. 18. 오전 1:04:19
 * @version	1.0.0
 */

public class TestDrive {
	public static void main(String[] args) {
		new Manager(DBConn.getInstance());
	}
}
