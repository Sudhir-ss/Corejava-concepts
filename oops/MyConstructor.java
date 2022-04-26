package oops;

class Vehicle {
	
	int wheels;
	//Vehicle(){
	Vehicle(int wheels){
		 this.wheels = wheels;
		
	}
	
}

public class MyConstructor {
	
	MyConstructor() {
		System.out.println("object is now created");
	}

	public static void main(String[] args) {
		
	MyConstructor obj = new MyConstructor();
	MyConstructor obj1 = new MyConstructor();
	
	
    Vehicle car =  new Vehicle(4); 
     Vehicle scooty =  new Vehicle(2); 
     
     System.out.println(scooty.wheels +" wheels");
	}

	

}
