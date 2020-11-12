package space.harbour.java.hw3;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Ahmed", "123-456-789");
        contacts.put("Vasilii", "987-654-321");
        contacts.put("Pierre", "567-890-342");

        System.out.println(contacts.get("Ahmed"));
    }
}
