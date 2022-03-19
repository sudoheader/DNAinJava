import java.util.LinkedList;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {

		// *********************************************************************

		// Queue - FIFO data structure. First-In First-Out (ex. A line of people)
		//		   A collection designed for holding elements prior to processing
		// 		   Linear data structure
		
		// 		   add = enqueue, offer()
		//		   remove = dequeue, poll()
		//		   peek = examine and return queue

		// Where are queues useful?
		
		// 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
		// 2. Printer Queue (Print jobs should be completed in order)
		// 3. Used in LinkedLists, PriorityQueues, Breadth-first search
		
		// *********************************************************************
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
//		System.out.println(queue.isEmpty());
//		System.out.println(queue.size());
//		System.out.println(queue.contains("Harold"));
		
//		System.out.println(queue.peek());
//		queue.poll();
//		queue.poll();
//		queue.poll();
//		queue.poll();
//		queue.element();
		
		System.out.println(queue);
	}

}
