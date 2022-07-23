import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class recursionTest {
    recursion rec;

    @BeforeEach
    void setUp() {
        rec = new recursion();
    }

    @Test
    public void cal_mean() {
        double[] numbers = {2,2,2};
        int k=0;
        rec.n = 3;
        rec.mean = 0;
        assertEquals (2.0,recursion.cal_mean(numbers,k));
    }


    @Test
    public void square() {
        assertEquals (4.0,rec.square(2.0));
    }

    @Test
    public void variance() {
        rec.mean = 2;
        rec.n = 3;
        int k=0;
        double[] numbers = {2,2,2};
        assertEquals (0.0,rec.variance(numbers, k));
    }

    @Test
    public void sqrt() {
        rec.var = 0.0;
        assertEquals (0.0,rec.sqrt());
        rec.var = 4.0;
        assertEquals (2.0,rec.sqrt());
    }

    @Test
    public void main_test() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("2 2 2".getBytes());
        System.setIn(in);
        String [] args = new String[0];
        rec.main(args);
        System.setIn(sysInBackup);
    }
}