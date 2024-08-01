package Collection;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

    public static void main(String[] args) {
        // Create a HashMap to store country codes as keys and country names as values
        HashMap<Integer, String> countrycodes = new HashMap<Integer,String>();

        // Inserting countries and their codes into the HashMap
		
		countrycodes.put(1,"US");
		countrycodes.put(91,"India");
		countrycodes.put(7,"Russia");
		countrycodes.put(61,"Australia");
		countrycodes.put(86,"China");
		countrycodes.put(92,"Pakisthan");
		countrycodes.put(null,"france");
		

        // Displaying all entries in the HashMap
        
        // Example of retrieving a country name using its code
        int countryCode = 86;
        String countryName = countrycodes.get(countryCode);
        if (countryName != null) {
            System.out.println("The country with code '" + countryCode + "' is: " + countryName);
        } else {
            System.out.println("Country with code '" + countryCode + "' not found.");
        }
        
    }
}
