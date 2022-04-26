package deque;

//import java.util.ArrayDeque;
//import java.util.Deque;

public class MainClass {

	public static void main(String[] args) {
		
//		Deque<Integer> ad = new ArrayDeque<>();
//		ad.addFirst(12);
//		ad.addFirst(222);
//		ad.addFirst(55);
//		ad.addFirst(66);
//		System.out.println(ad.peekLast());
//		System.out.println(ad.peekFirst());
		
		
		MyDeque<Integer> ad = new MyDeque<>();
		
		ad.addToHead(24);
		ad.addToHead(44);
		ad.addToHead(78);
		ad.addToHead(89);
		System.out.println(ad.peekLast());
		System.out.println(ad.peekFirst());
		
	}

}
