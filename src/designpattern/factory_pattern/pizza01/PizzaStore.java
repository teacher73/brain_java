/**
 *
 * @package		: factory_pattern.old
 * @FileName	: PizzaStore.java
 * @Date  		: 2012. 9. 23.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package designpattern.factory_pattern.pizza01;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 23. 오전 9:41:16
 * @version	1.0.0
 */

public class PizzaStore {
	
	Pizza oderPizza(String type){
		Pizza pizza = null;
		
		if(type.equals("cheese"))
			pizza = new CheesePizza();
		else if (type.equals("greek"))
			pizza = new GreekPizza();
		else if (type.equals("pepperoni"))
			pizza = new PepperoniPizza();
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	public static void  main(String[] args){
		PizzaStore ps = new PizzaStore();
		ps.oderPizza("greek");
	}
}
