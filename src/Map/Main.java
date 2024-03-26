package Map;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMap<Integer, String> map = new MyMap<>();
        int key;
        String value;

        System.out.println();
        System.out.println("PUT METHOD TEST CASES: ");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
//        map.put(1, "One - Copy");
//        map.put(1, "One");

        System.out.println("CURRENT KEYS AND VALUES: ");
        System.out.println(map.keys);
        System.out.println(map.values);

        System.out.println();
        System.out.println("GET METHOD TEST CASES: ");
        System.out.println("Value of key 3: " + map.get(3));
        System.out.println("Value of key 5: " + map.get(5));
        System.out.println("Value of key 23: " + map.get(23));//dapat null
        System.out.println("Value of key 1: " + map.get(1));
        System.out.println("Value of key 20: " + map.get(20)); //Dapat null

        System.out.println();
        System.out.println("REMOVE METHOD TEST CASES: ");
        System.out.println("Removed value from key 2: " + map.remove(2));
        System.out.println("Current Keys and Values:");
        System.out.println(map.keys);
        System.out.println(map.values);

        System.out.println("Removed value from key 5: " + map.remove(5));
        System.out.println("Current Keys and Values:");
        System.out.println(map.keys);
        System.out.println(map.values);
    }
}
