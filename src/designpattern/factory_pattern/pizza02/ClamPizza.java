/**
 *
 * @package		: factory_pattern.pizza02
 * @FileName	: ClamPizza.java
 * @Date  		: 2012. 9. 23.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package designpattern.factory_pattern.pizza02;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 23. 오전 10:55:33
 * @version	1.0.0
 */

public class ClamPizza extends Pizza {
	public ClamPizza() {
		super();
		name = "ClamPizza";
		System.out.println("ClamPizza");
	}
}
