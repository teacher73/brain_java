/**
 *
 * @package		: chapter05_overriding
 * @FileName	: Rect.java
 * @Date  		: 2012. 9. 19.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package chapter05_overriding;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 19. 오후 10:49:01
 * @version	1.0.0
 */

public class Rect extends DObject {

	/**
	 * @see chapter05_overriding.DObject#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Rect");
	}
	
}
