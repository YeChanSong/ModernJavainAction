package Modern.java.in.action.chap3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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

    public String processFile() throws IOException {
        File file = new File(".");
        try (BufferedReader br = new BufferedReader(new FileReader(file.getCanonicalFile()+"/src/main/resources/text.txt"))) {
            return br.readLine();
        }
    }
}
