package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Car {
	
	 //String[] car = { "HondaCity" , "Bugati" , "Lamborgini" , "Verna" , "Fortuner"};

	public static void main(String[] args) {
		
		ArrayList<String> car = new ArrayList<>();
		car.add("maruti");
		car.add("swift");
		car.add("Fortuner");
		car.add("verna");
		
//		ArrayList<String> bike = new ArrayList<>();
//		bike.add("hero");
//		bike.add("pulsur");
//		bike.add("apaache");
//		bike.add("dugati");
		
		
		Collections.shuffle(car);
		System.out.println(car);
//		System.out.println(bike);
		
//		Pair<String, Integer> p1 = new Pair<>("Sudhir", 22);
//		Pair<Boolean , String> p2 = new Pair<>(true , "Parveen is Chutiya and Bawligand");
		
//		p1.getDescription();
//		p2.getDescription();
	}

}
