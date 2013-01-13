/**
 *
 * @package		: advanced_java.collection
 * @FileName	: TreeSetEx.java
 * @Date  		: 2013. 1. 6.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package advanced_java.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 6. 오후 12:33:09
 * @version	1.0.0
 */

public class TreeSetEx {
	public static void main(String[] args) {
		//TreeSet<Integer> set =new TreeSet<Integer>();								//싱글스레드 환경
		SortedSet<Object> set = Collections.synchronizedSortedSet(new TreeSet<>());//멀티스레드 환경
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(2);
		set.add(4);
		
		for(Iterator<Object> iterator=set.iterator(); iterator.hasNext();){
			System.out.println(iterator.next());
		}
	}//end of main
}
