package Singleton_package;

public class Singleton {
    private static Singleton uniqueInstance = null;
    String s;

    private Singleton(){
        System.out.println("Initiation of the Singleton");
    }

    public static Singleton getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        else{System.out.println("Use already intiated Singleton");}
        return uniqueInstance;
    }
}
