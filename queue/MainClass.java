package queue;

public class MainClass {

	public static void main(String[] args) {

		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(23);
		mq.enqueue(143);
		mq.enqueue(45);
		mq.enqueue(67);
		mq.enqueue(44);
		
		System.out.println(mq.Dequeue());
		System.out.println(mq.Dequeue());
		System.out.println(mq.Dequeue());
		System.out.println(mq.Dequeue());
	}

}
