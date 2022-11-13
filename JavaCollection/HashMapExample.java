package JavaCollection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public void createHashMap() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("First", 1);
        hashMap.put("Second", "Two");
        hashMap.put("Third", 3.3);
        hashMap.put("Fourth", false);

        for (Map.Entry<String, Object> element : hashMap.entrySet()) {
            System.out.println("Key - " + element.getKey() + "; Value - " + element.getValue());
        }

        Object value = "NotSecond";
        hashMap.put("Second", value);
        System.out.println("\nNew Map Values are: ");
        for (Map.Entry<String, Object> element : hashMap.entrySet()) {
            System.out.println("Key - " + element.getKey() + "; Value - " + element.getValue());
        }

        Object value1 = null;
        hashMap.put("Third", value1);
        System.out.println("\nNew Map Values are: ");
        for (Map.Entry<String, Object> element : hashMap.entrySet()) {
            System.out.println("Key - " + element.getKey() + "; Value - " + element.getValue());
        }
    }
}