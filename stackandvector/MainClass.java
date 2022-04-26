package stackandvector;

public class MainClass {
	
	public static void main(String[] args) throws Exception {
		
		MyStack<Integer> stack = new MyStack<>();
		
		stack.push(12);
		stack.push(23);
		stack.push(44);
		
		int pooped = stack.pop();
		System.out.println(pooped);
		int peeked = stack.peek();
		System.out.println(peeked);
		
		
	}
	
}
