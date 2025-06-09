import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
      
        // Instantiate a HashSet
        Set<String> uniqueItems = new HashSet<>();

        // Adding elements (duplicates will be ignored)
        uniqueItems.add("Apple");
        uniqueItems.add("Banana");
        uniqueItems.add("Orange");
        boolean added = uniqueItems.add("Apple"); // This will be false because "Apple" already exists

        System.out.println("Was 'Apple' added again? " + added);
        System.out.println("Set size: " + uniqueItems.size());

        // Iterating using a for-each loop
        for (String item : uniqueItems) {
            System.out.println("For-each: " + item);
        }

        // Iterating using an Iterator and safely removing an element
        Iterator<String> it = uniqueItems.iterator();
        while (it.hasNext()) {
            String item = it.next();
            if ("Banana".equals(item)) {
                it.remove(); // Remove "Banana" during iteration
            }
        }

        // Using Java 8+ forEach and lambda expressions
        uniqueItems.forEach(item -> System.out.println("Lambda: " + item));
    }
}
