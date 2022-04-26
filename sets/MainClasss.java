package sets;

import java.util.*;

public class MainClasss {

	public static void main(String[] args) {
		
		Set<Integer> x = new HashSet<>();
		
		x.add(25);
		x.add(3);
		x.add(44);
		x.add(56);
		
		Set<Integer> y = new HashSet<>();
		
  //  y.add(22);
		//y.add(21);
		y.add(25);
		//y.add(66);
		
	//	x.addAll(y);	  all the elements of the y is in the x	 or x union y
	//	x.retainAll(y);	  all the elements commen in x and y  or x intersectiojn y
		
		System.out.println(x.containsAll(y));   //containsAll function returns bollean value true or false 
												//or we can say y is the subsey of x
		
		

	}

}
