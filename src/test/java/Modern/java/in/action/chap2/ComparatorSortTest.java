package Modern.java.in.action.chap2;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ComparatorSortTest {

    @Test
    public void compSort() {
        List<Apple> ret = ComparatorSort.compSort();
        int[] weights = {80,120,155};
        String[] colors = {"GREEN","RED","GREEN"};
        for(int i=0;i<3;i++){
            assertThat(ret.get(i).getColor()).isEqualTo(colors[i]);
            assertThat(ret.get(i).getWeight()).isEqualTo(weights[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(Apple a: ret){
            sb.append(a.getWeight()).append(' ').append(a.getColor()).append('\n');
        }
        System.out.println(sb);
    }

    @Test
    public void lambdaSort(){
        List<Apple> ret = ComparatorSort.lambdaSort();
        int[] weights = {80,120,155};
        String[] colors = {"GREEN","RED","GREEN"};
        for(int i=0;i<3;i++){
            assertThat(ret.get(i).getColor()).isEqualTo(colors[i]);
            assertThat(ret.get(i).getWeight()).isEqualTo(weights[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(Apple a: ret){
            sb.append(a.getWeight()).append(' ').append(a.getColor()).append('\n');
        }
        System.out.println(sb);
    }
}