package Modern.java.in.action.chap3;

public class FunctionalInterface {
    public static void functionalInterface(){
        Runnable r1 = () -> System.out.println("Hello World");
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World2");
            }
        };
        process(r1);
        process(r2);
        process(() -> System.out.println("HelloWorld3"));
    }
    public static void process(Runnable r){
        r.run();
    }
}
