package Date12Assignment;

import java.util.HashMap;
import java.util.Map;

import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Adding entries
        map.put("ViratKohli", 01);
        map.put("SachinTendulkar", 100);
        map.put("Jaqualis", 78);
        map.put("RohitSharma", 10000);
        map.put("dhoni", 120000);

        // 1. Print the map
        System.out.println("Original Map: " + map);

        // 2. Get value by key
        System.out.println("Runs of dhoni: " + map.get("dhoni"));

        // 3. Replace value for a key
        map.put("ViratKohli", 18000);  // Overwriting value
        System.out.println("Updated runs of ViratKohli: " + map.get("ViratKohli"));

        // 4. Remove a key-value pair
        map.remove("Jaqualis");
        System.out.println("Map after removing Jaqualis: " + map);

        // 5. Check if a key exists
        System.out.println("Contains key 'SachinTendulkar'? " + map.containsKey("SachinTendulkar"));

        // 6. Check if a value exists
        System.out.println("Contains value 10000? " + map.containsValue(10000));

        // 7. Size of the map
        System.out.println("Size of map: " + map.size());

        // 8. Iterate through keys
        System.out.println("Iterating over keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // 9. Iterate through values
        System.out.println("Iterating over values:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        // 10. Iterate through key-value pairs
        System.out.println("Iterating over key-value pairs:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        // 11. Clear the map
        map.clear();
        System.out.println("Map after clear: " + map);

        // 12. Check if map is empty
        System.out.println("Is map empty? " + map.isEmpty());
    }
}
