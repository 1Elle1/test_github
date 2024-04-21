package queue;

public class ArrayQueue {
	
	private int capacity; // generelle Größe
	private int front;
	private int rear;
	private int [] queue;
	
	
	public ArrayQueue(int capacity) {
		this.front = 0;
		this.rear = 0;
		this.capacity = capacity;
		this.queue = new int[capacity];
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public int getFront() {
		return front;
	}


	public void setFront(int front) {
		this.front = front;
	}


	public int getRear() {
		return rear;
	}


	public void setRear(int rear) {
		this.rear = rear;
	}


	public int[] getQueue() {
		return queue;
	}


	public void setQueue(int[] queue) {
		this.queue = queue;
	}
	
	
	public boolean isEmpty() {
		if(front == rear) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(rear == capacity) {
			return true;
		}
		return false;
	}
	
	
	
	/**
	 * Adds a new element at the end of the queue if there is space available.
	 * This method will insert the element into the queue and increment the rear index.
	 * If the queue is full, it outputs a message and does not add the element.
	 *
	 * @param element The element to be added to the queue.
	 * @throws IllegalStateException if the queue is full, to indicate that the element cannot be added.
	 */
	public void enqueue(int element) {
		if(!isFull()) {
			queue[rear] = element;
			rear++;
		}else {
			System.out.println("Queue is Full!");
		}
	}
	
	
	
	/**
	 * Removes the front element from the queue if it's not empty, shifting all subsequent elements forward.
	 * Sets the last element to zero and decrements the rear index to update the queue's state.
	 * If the queue is empty, outputs a warning message.
	 *
	 */
	public void dequeue() {
		if(!isEmpty()) {
			for(int i = 0; i < rear-1; i++) {
				queue[i] = queue[i+1];
			}
			if(rear < capacity) {
				queue[rear] = 0;
			}
			rear--;
		}else {
			System.out.println("Queue is empty!");
		}
	}
	
	
	
	/**
	 * Retrieves the front element of the queue without removing it.
	 * If the queue is empty, returns -1 as an indicator (consider using exception handling for cleaner code).
	 * 
	 * @return The front element of the queue, or -1 if the queue is empty.
	 */
	public int front() {
		if(!isEmpty()) {
			return queue[front];
		}
		return -1; //keine saubere lösung -> Exception Hadling
	}
	
	
	
	/**
	 * Prints all elements in the queue from front to just before the rear, if the queue is not empty.
	 * If the queue is empty, outputs a message indicating so.
	 */
	public void display() {
		if(!isEmpty()) {
			for(int i = 0; i < rear-1; i++) {
				System.out.println(queue[i]);
			}
		}else {
			System.out.println("Queue is empty!");
		}
	}
	
	
	
	

}
