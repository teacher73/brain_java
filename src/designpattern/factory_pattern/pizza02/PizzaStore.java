/**
 *
 * @package		: factory_pattern.old
 * @FileName	: PizzaStore.java
 * @Date  		: 2012. 9. 23.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package designpattern.factory_pattern.pizza02;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 23. 오전 9:41:16
 * @version	1.0.0
 */

public class PizzaStore {
	SimplePizzaFactory factory;
	
	/**
	 * Constructor of PizzaStore.java class
	 * @param factory
	 */
	public PizzaStore(SimplePizzaFactory factory) {
		super();
		this.factory = factory;
	}

	Pizza oderPizza(String type){
		Pizza pizza=null;
		pizza = factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	public static void  main(String[] args){
		SimplePizzaFactory fact = new SimplePizzaFactory();
		PizzaStore ps = new PizzaStore(fact);
		ps.oderPizza("veggie");
	}
}
