package Date12Assignment;

import java.util.HashSet;
import java.util.Set;

import java.util.*;

public class SetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Adding elements
        set.add("Bangalore");
        set.add("Vijaynagara");
        set.add("Rashtriyavidyalayaroad");
        set.add("lalbagh");
        set.add("jayanagara");

        // 1. Print the set
        System.out.println("Original Set: " + set);

        // 2. Try to add duplicate element
        boolean added = set.add("Bangalore"); // Should not be added
        System.out.println("Trying to add duplicate 'Bangalore': " + added);

        // 3. Check if set contains an element
        System.out.println("Contains 'lalbagh'? " + set.contains("lalbagh"));

        // 4. Remove an element
        set.remove("jayanagara");
        System.out.println("After removing 'jayanagara': " + set);

        // 5. Size of set
        System.out.println("Size of the set: " + set.size());

        // 6. Iterate through the set
        System.out.println("Iterating over set:");
        for (String location : set) {
            System.out.println(location);
        }

        // 7. Clear the set
        set.clear();
        System.out.println("Set after clear: " + set);

        // 8. Check if set is empty
        System.out.println("Is set empty? " + set.isEmpty());
    }
}
