/**
 *
 * @package		: factory_pattern.pizza03
 * @FileName	: NYPizzaStore.java
 * @Date  		: 2012. 9. 23.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package designpattern.factory_pattern.pizza03;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 23. 오전 11:15:59
 * @version	1.0.0
 */

public class NYPizzaStore extends PizzaStore {

	
	/**
	 * @see designpattern.factory_pattern.pizza03.PizzaStore#createPizza(java.lang.String)
	 */
	@Override
	Pizza createPizza(String type) {
		if(type.equals("cheese"))
			return new NYStyleCheesePizza();
		else if (type.equals("pepperoni"))
			return new NYStylePepperoniPizza();
		else if (type.equals("clam"))
			return new NYStyleClamPizza();
		else if (type.equals("veggie"))
			return new NYStyleVeggiePizza();
		else return null;
	}

}
