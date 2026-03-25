package creational.singleton.lazy;

public class Main {
    public static void main(String[] args) {
        LazySingleton obj1 = LazySingleton.getInstance();
        LazySingleton obj2 = LazySingleton.getInstance();
        LazySingleton obj3 = LazySingleton.getInstance();

        // Check if all references point to the same object
        System.out.println(obj1 == obj2); // true
        System.out.println(obj2 == obj3); // true

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
    }
}
