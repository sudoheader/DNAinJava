import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueus {

	public static void main(String[] args) {
		
		// Priority Queue = A FIFO data structure that serves elements
		//					with the highest priorities first
		//					before elements with lower priority
		
		Queue<Double> queue = new LinkedList<>();
		
		queue.offer(3.0);
		queue.offer(2.5);
		queue.offer(4.0);
		queue.offer(1.5);
		queue.offer(2.0);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

		System.out.println();
		
		Queue<String> queueGrades = new PriorityQueue<>();
		
		queueGrades.offer("B");
		queueGrades.offer("C");
		queueGrades.offer("A");
		queueGrades.offer("F");
		queueGrades.offer("D");
		
		while(!queueGrades.isEmpty()) {
			System.out.println(queueGrades.poll());
		}
		
		System.out.println();

		Queue<String> queueGradesReverse = new PriorityQueue<>(Collections.reverseOrder());

		queueGradesReverse.offer("B");
		queueGradesReverse.offer("C");
		queueGradesReverse.offer("A");
		queueGradesReverse.offer("F");
		queueGradesReverse.offer("D");

		while(!queueGradesReverse.isEmpty()) {
			System.out.println(queueGradesReverse.poll());
		}
	}
}
