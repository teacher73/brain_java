/**
 *
 * @package		: factory_pattern.pizza02
 * @FileName	: VeggiePizza.java
 * @Date  		: 2012. 9. 23.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package designpattern.factory_pattern.pizza03;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 23. 오전 10:56:20
 * @version	1.0.0
 */

public class NYStyleVeggiePizza extends Pizza {

	/**
	 * Constructor of VeggiePizza.java class
	 */
	public NYStyleVeggiePizza() {
		super();
		name = "Veggie Pizza";
		System.out.println("Veggie Pizza");
	}

}
