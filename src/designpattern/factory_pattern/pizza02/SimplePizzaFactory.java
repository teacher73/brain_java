/**
 *
 * @package		: factory_pattern.pizza02
 * @FileName	: SimplePizzaFactory.java
 * @Date  		: 2012. 9. 23.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package designpattern.factory_pattern.pizza02;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 23. 오전 10:53:03
 * @version	1.0.0
 */

public class SimplePizzaFactory {
	
	public Pizza createPizza(String type){
		Pizza pizza = null;
	
		if(type.equals("cheese"))
			pizza = new CheesePizza();
		else if (type.equals("pepperoni"))
			pizza = new PepperoniPizza();
		else if (type.equals("clam"))
			pizza = new ClamPizza();
		else if (type.equals("veggie"))
			pizza = new VeggiePizza();
		return pizza;
	}
}
