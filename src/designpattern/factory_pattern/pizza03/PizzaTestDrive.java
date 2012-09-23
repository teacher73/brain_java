/**
 *
 * @package		: factory_pattern.pizza03
 * @FileName	: PizzaTestDrive.java
 * @Date  		: 2012. 9. 23.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package designpattern.factory_pattern.pizza03;

/**
 * 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 23. 오전 11:42:25
 * @version	1.0.0
 */

public class PizzaTestDrive {
	public static void main(String[] args){
		PizzaStore nyStyle = new NYPizzaStore();
		PizzaStore chicagoStyle = new ChicagoPizzaStore();
		
		Pizza pizza = nyStyle.oderPizza("cheese");
		System.out.println("민수 ordered a "+pizza.getName() + "\n");
		
		pizza = chicagoStyle.oderPizza("cheese");
		System.out.println("주하 ordered a "+pizza.getName() + "\n");
	}
}
