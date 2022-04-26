package abstraction;

public class RepairShop {
	public static void repaircar(Car  car) {
		
		System.out.println("car is repaired");
	}

	public static void main(String[] args) {
		
		Wagonr wagonr = new Wagonr();
		Audi audi = new Audi();
		repaircar(wagonr);
		repaircar(audi);
		
		audi.accelerate();
		

	}

}
