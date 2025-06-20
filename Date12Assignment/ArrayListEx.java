package Date12Assignment;

import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Adding elements
        list.add("arun");
        list.add("vinod");
        list.add("sunil");
        list.add("laxminarasimha");
        list.add("lavanyaks");

        // 1. Print original list
        System.out.println("Original List: " + list);

        // 2. Get element at index 2
        System.out.println("Element at index 2: " + list.get(2));

        // 3. Set (replace) element at index 1
        list.set(1, "vinodkumar");
        System.out.println("After setting index 1: " + list);

        // 4. Remove element by index
        list.remove(3);
        System.out.println("After removing index 3: " + list);

        // 5. Remove element by value
        list.remove("lavanyaks");
        System.out.println("After removing 'lavanyaks': " + list);

        // 6. Check if list contains a name
        System.out.println("Contains 'arun'? " + list.contains("arun"));

        // 7. Size of the list
        System.out.println("Size of list: " + list.size());

        // 8. Sort the list
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // 9. Reverse the list
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);

        // 10. Iterate using enhanced for loop
        System.out.println("Iterating through list:");
        for (String name : list) {
            System.out.println(name);
        }

        // 11. Clear the list
        list.clear();
        System.out.println("List after clear: " + list);

        // 12. Check if list is empty
        System.out.println("Is list empty? " + list.isEmpty());
    }
}

