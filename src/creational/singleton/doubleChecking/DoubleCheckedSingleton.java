package creational.singleton.doubleChecking;

public class DoubleCheckedSingleton {
    // volatile prevents reordering of instructions in: instance = new Singleton()
    // since it involves three steps: allocate memory, call constructor, assign reference
    private static volatile DoubleCheckedSingleton instance;
    private DoubleCheckedSingleton(){};

    public static DoubleCheckedSingleton getInstance(){
         if(instance == null){
             synchronized (DoubleCheckedSingleton.class){
                 if(instance == null){
                     instance = new DoubleCheckedSingleton();
                 }
             }
         }
         return instance;
    }
}
