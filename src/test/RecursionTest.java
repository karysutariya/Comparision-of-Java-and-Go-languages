package test;
import code.recursion;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursionTest {
	
    
    @Test
    public void cal_mean() {
        double[] numbers = {2,2,2};
        int k=0;
        recursion.n = 3;
        recursion.mean = 0;
        assertEquals (2.0,recursion.cal_mean(numbers,k));
    }


    @Test
    public void square() {
        assertEquals (4.0,recursion.square(2.0));
    }

    @Test
    public void variance() {
    	recursion.mean = 2;
    	recursion.n = 3;
        int k=0;
        double[] numbers = {2,2,2};
        assertEquals (0.0,recursion.variance(numbers, k));
    }

    @Test
    public void sqrt() {
    	recursion.var = 0.0;
        assertEquals (0.0,recursion.sqrt());
        recursion.var = 4.0;
        assertEquals (2.0,recursion.sqrt());
    }

    @Test
    public void main_test() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("2 2 2".getBytes());
        System.setIn(in);
        String [] args = new String[0];
        recursion rec = new recursion(); 
        rec.main(args);
        System.setIn(sysInBackup);
    }
}