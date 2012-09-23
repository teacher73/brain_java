/**
 *
 * @package		: factory_pattern.old
 * @FileName	: CheesePizza.java
 * @Date  		: 2012. 9. 23.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package designpattern.factory_pattern.pizza03;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 23. 오전 9:38:16
 * @version	1.0.0
 */

public class NYStyleCheesePizza extends Pizza{
	public NYStyleCheesePizza(){
		name = "NYStyle Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		toppings.add("Grated Reggiano Cheese");
	}
}
