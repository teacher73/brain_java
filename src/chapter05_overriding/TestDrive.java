/**
 *
 * @package		: chapter05_overriding
 * @FileName	: TestDrive.java
 * @Date  		: 2012. 9. 19.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package chapter05_overriding;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 19. 오후 10:49:31
 * @version	1.0.0
 */

public class TestDrive {
	public static void main(String[] args) {
		Line line = new Line();
		line.draw();
		
		DObject dojt = new Line();
		dojt.draw();
	
		System.out.println(line.getClass().getName());
		System.out.println(line.hashCode());
	}//end of main
}
