import java.util.LinkedList;

public class LinkedLists {
	public static void main(String[] args) {
		
		// *****************************************************
		  
		// LinkedList =  Nodes are in 2 parts (data + address)
		//                        Nodes are in non-consecutive memory locations
		//                        Elements are linked using pointers
				
		//    advantages?
		//    1. Dynamic Data Structure (allocates needed memory while running)
		//    2. Insertion and Deletion of Nodes is easy. O(1) 
		//    3. No/Low memory waste

		//    disadvantages?
		//    1. Greater memory usage (additional pointer)
		//    2. No random access of elements (no index [i])
		//    3. Accessing/searching elements is more time consuming. O(n)

		//    uses?
		//    1. implement Stacks/Queues
		//    2. GPS navigation
		//    3. music playlist
		//

		// *****************************************************
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		// Linked list as a Stack
//		linkedList.push("A");
//		linkedList.push("B");
//		linkedList.push("C");
//		linkedList.push("D");
//		linkedList.push("F");
//		linkedList.pop(); /* remove F (top of "stack" [linked list as a stack]) */

		// Linked list as a Queue
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
//		linkedList.poll(); /* remove A (head of "queue" [linked list as a queue]) */
		
		linkedList.add(4, "E");
		linkedList.remove("E");
//		System.out.println(linkedList.indexOf("F")); /* prints 4 */
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		linkedList.addFirst("0");
		linkedList.addLast("G");
		String first = linkedList.removeFirst();
		String last = linkedList.removeLast();
		
		System.out.println(linkedList);
		System.out.println("First: " + first + "\nLast: " + last);
	}
}
