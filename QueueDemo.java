package Collection;


import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
	
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		// Add elements to pq
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		
	 // Display the elements in the pq
      System.out.println(pq);
      
      System.out.println (pq.peek());
      System.out.println(pq.poll());
      
      System.out.println(pq);
      
    
      
	}

}
