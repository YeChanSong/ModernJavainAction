package Modern.java.in.action.chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class lambdaExp {
    static StringBuilder sb = new StringBuilder();
    public static void lambdaWithBody(){
        int[] arr = {1,3,2,5,7,9,6,8};
        ArrayList<Integer> list = new ArrayList<>();
        sb.append("original: ");
        for(int i:arr) {
            sb.append(i).append(' ');
            list.add(i);
        }
        sb.append('\n').append("sorted:   ");
        list.sort((a, b) -> Integer.compare(a,b));
        for(int i:list)
            sb.append(i).append(' ');
        System.out.println(sb);
    }

}
