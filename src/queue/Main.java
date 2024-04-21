package queue;

public class Main {

	public static void main(String[] args) {
		
		ArrayQueue queue = new ArrayQueue(10);
		
		queue.enqueue(5);
		queue.enqueue(3);
		queue.enqueue(8);
		queue.enqueue(1);
		queue.display();
		queue.dequeue();
		queue.dequeue();
		System.out.println();
		queue.display();
		System.out.println();
		queue.enqueue(3);
		queue.enqueue(12);
		queue.front();
		
		
	}

}
