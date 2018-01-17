package rmuti.Stack_and_Queue;

public class TestQueue {

	public static void main(String[] args) {
		ArrayListQueue queue = new ArrayListQueue();
		queue.enqueue("macos");
		queue.enqueue("linux");
		queue.enqueue("window");
		System.out.println(queue);
		
		String data = (String)queue.dequeue();
		System.out.println(queue);
	}
}
