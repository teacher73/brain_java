/**
 *
 * @package		: factory_pattern.old
 * @FileName	: Pizza.java
 * @Date  		: 2012. 9. 23.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package designpattern.factory_pattern.pizza03;

import java.util.ArrayList;

/**
 * 
 * @author MinSu Kim (net94@nate.com)
 * @since 2012. 9. 23. 오전 9:41:54
 * @version 1.0.0
 */

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings;

	public Pizza(){
		toppings = new ArrayList<String>();
	}
	/**
	 * 피자준비
	 *
	 */
	public void prepare(){ 
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("adding toppings : ");
		for(String topping:toppings)
			System.out.println("    "+topping);
	} 
	 /** 피자 굽기
	 * 
	 */
	public void bake() {
		System.out.println("Bake ofr 25 minutes at 350");
	}

	/**
	 * 피자 자르기
	 * 
	 */
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	/**
	 * 피자 박싱하기
	 * 
	 */
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}
}
