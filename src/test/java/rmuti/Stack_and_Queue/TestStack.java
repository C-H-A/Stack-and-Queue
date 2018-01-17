package rmuti.Stack_and_Queue;

public class TestStack {
	
	public static void main(String[] args) {
		ArrayListStack stack = new ArrayListStack();
		stack.push("macos");
		stack.push("linux");
		stack.push("window");
		System.out.println(stack);
		
		String data = (String)stack.pop();
		System.out.println(stack);
	}
}