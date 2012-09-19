/**
 *
 * @package		: chapter05_overriding
 * @FileName	: Line.java
 * @Date  		: 2012. 9. 19.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package chapter05_overriding;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 19. 오후 10:48:26
 * @version	1.0.0
 */

public class Line extends DObject {

	/**
	 * @see chapter05_overriding.DObject#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Line");
	}

}
