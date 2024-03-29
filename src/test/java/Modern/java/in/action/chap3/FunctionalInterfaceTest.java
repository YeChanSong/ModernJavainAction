package Modern.java.in.action.chap3;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionalInterfaceTest {

    @Test
    public void functionalInterface() {
        FunctionalInterface.functionalInterface();
    }
    @Test
    public void fileTest() throws IOException {
        FunctionalInterface fi = new FunctionalInterface();
        assertThat(fi.processFile((BufferedReader br) -> br.readLine())).isEqualTo("111111"); // one Line
        assertThat(fi.processFile((BufferedReader br) -> br.readLine()+br.readLine())).isEqualTo("111111222222");
    }

}