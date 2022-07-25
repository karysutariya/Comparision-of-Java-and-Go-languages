package test;
import code.iterative;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IterativeTest {
   
    @Test
    public void cal_mean() {
        double[] numbers = {2,2,2};
        iterative.n = 3;
        assertEquals (2.0,iterative.cal_mean(numbers));
    }

    @Test
    public void square() {
        assertEquals (4.0,iterative.square(2.0));
    }

    @Test
    public void variance() {
    	iterative.mean = 2;
    	iterative.n = 3;
        double[] numbers = {2,2,2};
        assertEquals (0.0,iterative.variance(numbers));
    }

    @Test
    public void sqrt() {
    	iterative.var = 0.0;
        assertEquals (0.0,iterative.sqrt());
        iterative.var = 4.0;
        assertEquals (2.0,iterative.sqrt());
    }

    @Test
    public void main_test() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("2 2 2".getBytes());
        System.setIn(in);
        String [] args = new String[0];
        iterative itr = new iterative();
        itr.main(args);
        System.setIn(sysInBackup);
    }

}