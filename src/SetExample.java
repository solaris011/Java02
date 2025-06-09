import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> uniqueItems = new HashSet<>();

        uniqueItems.add("Apple");
        uniqueItems.add("Banana");
        uniqueItems.add("Orange");
        boolean added = uniqueItems.add("Apple"); 

        System.out.println("Was 'Apple' added again? " + added);
        System.out.println("Set size: " + uniqueItems.size());

        for (String item : uniqueItems) {
            System.out.println("For-each: " + item);
        }

        Iterator<String> it = uniqueItems.iterator();
        while (it.hasNext()) {
            String item = it.next();
            if ("Banana".equals(item)) {
                it.remove(); 
            }
        }

        uniqueItems.forEach(item -> System.out.println("Lambda: " + item));
    }
}
