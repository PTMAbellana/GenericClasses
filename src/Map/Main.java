package Map;

public class Main {
    public static void main(String[] args) {
        MyMap<String, Integer> myMap = new MyMap<>();
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        System.out.println("Value for key 'one': " + myMap.get("one"));
        System.out.println("Value for key 'two': " + myMap.get("two"));
        System.out.println("Value for key 'four': " + myMap.get("four"));

        System.out.println("Removing key 'two', value: " + myMap.remove("two"));
        System.out.println("Value for key 'two' after removal: " + myMap.get("two"));
    }
}
