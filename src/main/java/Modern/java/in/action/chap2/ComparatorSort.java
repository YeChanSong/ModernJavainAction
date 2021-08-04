package Modern.java.in.action.chap2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorSort {
    public static List<Apple> compSort(){
        List<Apple> inventory = Arrays.asList(  new Apple(80,"GREEN"),
                                                new Apple(155,"GREEN"),
                                                new Apple(120,"RED"));
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple apple, Apple t1) {
                return Integer.compare(apple.getWeight(), t1.getWeight());
            }
        });
        return inventory;
    }

    public static List<Apple> lambdaSort(){
        List<Apple> inventory = Arrays.asList(  new Apple(80,"GREEN"),
                                                new Apple(155,"GREEN"),
                                                new Apple(120,"RED"));

        inventory.sort((Apple a1, Apple a2) -> Integer.compare(a1.getWeight(),a2.getWeight()));
        return inventory;
    }
}

class Apple{
    private final int weight;
    private final String color;

    public Apple(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    public int getWeight(){
        return this.weight;
    }
    public String getColor(){
        return this.color;
    }
}
