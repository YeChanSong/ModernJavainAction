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
        assertThat(fi.processFile() == "11111");
    }
}