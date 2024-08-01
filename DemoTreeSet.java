package Collection;

import java.util.TreeSet;

public class DemoTreeSet {
	
    public static void main(String[] args) {
        // Create a TreeSet of String type
        TreeSet<String> countrySet = new TreeSet<>();

        // Adding country names to the TreeSet
        countrySet.add("India");
        countrySet.add("Australia");
        countrySet.add("Canada");
        countrySet.add("Brazil");
        countrySet.add("Denmark");

        // Attempting to add duplicate elements
        countrySet.add("Australia");
        countrySet.add("India");

        // Display the TreeSet elements
        System.out.println("Country's: " + countrySet);

        // Removing an element
        countrySet.remove("Brazil");
        System.out.println("After removing Brazil: " + countrySet);

        // Checking if an element exists
        boolean containsCanada = countrySet.contains("Canada");
        System.out.println("Contains Canada: " + containsCanada);

        // Iterating through the TreeSet
        System.out.println("Iterating through TreeSet:");
        for (String country : countrySet) {
            System.out.println(country);
        }
    }
}
