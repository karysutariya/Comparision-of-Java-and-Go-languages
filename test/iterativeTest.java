import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class iterativeTest {
    iterative ite;

    @BeforeEach
    void setUp() {
        ite = new iterative();
    }


    @org.junit.Test
    public void cal_mean() {
        double[] numbers = {2,2,2};
        ite.n = 3;
        assertEquals (2.0,ite.cal_mean(numbers));
    }

    @org.junit.Test
    public void square() {
        assertEquals (4.0,ite.square(2.0));
    }

    @org.junit.Test
    public void variance() {
        ite.mean = 2;
        ite.n = 3;
        double[] numbers = {2,2,2};
        assertEquals (0.0,ite.variance(numbers));
    }

    @org.junit.Test
    public void sqrt() {
        assertEquals (2.0,ite.sqrt(4.0));
        assertEquals (0.0,ite.sqrt(0.0));
    }

    @org.junit.Test
    public void main_test() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("2 2 2".getBytes());
        System.setIn(in);
        String [] args = new String[0];
        ite.main(args);
        System.setIn(sysInBackup);
    }

}