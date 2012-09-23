/**
 *
 * @package		: factory_pattern.old
 * @FileName	: PepperoniPizza.java
 * @Date  		: 2012. 9. 23.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package designpattern.factory_pattern.pizza03;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 23. 오전 9:40:32
 * @version	1.0.0
 */

public class ChicagoStylePepperoniPizza extends Pizza{

	/**
	 * Constructor of PepperoniPizza.java class
	 */
	public ChicagoStylePepperoniPizza() {
		super();
		name = "PepperoniPizza";
		System.out.println("PepperoniPizza");
	}

}
