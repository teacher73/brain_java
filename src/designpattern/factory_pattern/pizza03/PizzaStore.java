/**
 *
 * @package		: factory_pattern.old
 * @FileName	: PizzaStore.java
 * @Date  		: 2012. 9. 23.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package designpattern.factory_pattern.pizza03;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 23. 오전 9:41:16
 * @version	1.0.0
 */

public abstract class PizzaStore {
	
	Pizza oderPizza(String type){
		Pizza pizza=null;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	abstract Pizza createPizza(String type);

}
