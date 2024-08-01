package Collection;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {
    public static void main(String[] args) {
    	
        // Create a LinkedHashSet of String type
        LinkedHashSet<String> Lhs = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        Lhs.add("Apple");
        Lhs.add("Banana");
        Lhs.add("Mango");
        Lhs.add("Grapes");

        // Attempting to add duplicate elements
        Lhs.add("Apple");
        Lhs.add("Banana");

        // Display the LinkedHashSet elements
        System.out.println("LinkedHashSet elements: " + Lhs);

        // Removing an element
        Lhs.remove("Mango");
        System.out.println("After removing Mango: " + Lhs);

        // Checking if an element exists
        boolean containsApple = Lhs.contains("Apple");
        System.out.println("Contains Apple: " + containsApple);

        // Iterating through the LinkedHashSet
        System.out.println("Iterating through LinkedHashSet:");
        for (String fruit : Lhs) {
            System.out.println(fruit);
        }
    }
}
