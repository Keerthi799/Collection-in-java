package Collection;

import java.util.ArrayDeque;

public class Deque {

	public static void main(String[] args) {
       
		// Create an ArrayDeque instance
		ArrayDeque<String> deque = new ArrayDeque<String>();
       
		// Add elements to the Deque
		deque.add("Apple");
		deque.add("Banana");
		deque.add("Cherry");
		deque.add("Mango");
        
		// Display the elements in the deque
		System.out.println(deque);
		 // Peek at the front elements
		System.out.println(deque.peekFirst());
		// Removing elements from the last
		System.out.println(deque.pollLast());
		
		// Add more elements to the deque

		deque.addFirst("Elderberry");
		deque.addLast("Fig");
		
		// Display the elements in the deque after more additions
		System.out.println(deque);
          
		// Using other ArrayDeque methods
		deque.offerFirst("Grape");
		deque.offerLast("Honeydew");

		// Display the elements in the deque after offers
		System.out.println(deque);
        
		// Removing elements using remove methods
		deque.removeFirst();
		deque.removeLast();
		
		// Display the elements in the deque after removes
		System.out.println(deque);
	}

}
