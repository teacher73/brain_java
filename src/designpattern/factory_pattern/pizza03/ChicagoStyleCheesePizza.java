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

public class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza(){
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		toppings.add("Shredded Mozzarella Cheese");
	}

	/**
	 * @see designpattern.factory_pattern.pizza03.Pizza#cut()
	 */
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
	
	
}
