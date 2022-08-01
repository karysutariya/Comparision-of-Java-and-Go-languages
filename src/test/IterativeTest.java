package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import code.Iterative;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
import org.junit.Test;

/**
 * The IterativeTest class tests Iterative class.
 */
public class IterativeTest {

  /**
   * Test method for calMean.
   */
  @Test
    public void calMeanTest() {
    final double[] numbers = { 2, 2, 2 };
    Iterative.totaln = 3;
    assertEquals(2.0, Iterative.calMean(numbers), "Problem in calMeanTest()");
  }

  /**
   * Test method for square.
   */
  @Test
    public void squareTest() {
    assertEquals(4.0, Iterative.square(2.0), "Problem in square()");
  }

  /**
   * Test method for variance.
   */
  @Test
    public void varianceTest() {
    Iterative.mean = 2;
    Iterative.totaln = 3;
    final double[] numbers = { 2, 2, 2 };
    assertEquals(0.0, Iterative.variance(numbers), "Problem in variance()");
  }

  /**
   * Test method 1 for sqrt.
   */
  @Test
    public void sqrtTest1() {
    Iterative.var = 0.0;
    assertEquals(0.0, Iterative.sqrt(), "Problem in sqrtTest1()");
  }
  
  /**
   * Test method 2 for sqrt.
   */
  @Test
    public void sqrtTest2() {
    Iterative.var = 4.0;
    assertEquals(2.0, Iterative.sqrt(), "Problem in sqrtTest2()");
  }

  /**
   * Test method for main.
   */
  @Test
    public void mainTest() {
    final InputStream sysInBackup = System.in;
    final ByteArrayInputStream inp = new ByteArrayInputStream("c 2 2 g 2".getBytes());
    System.setIn(inp);
    final String[] args = new String[0];
    Iterative.main(args);
    System.setIn(sysInBackup);
    try {
      sysInBackup.close();
    } catch (IOException e) {
      final Logger Log = Logger.getLogger("IterativeTest");
      Log.warning(e.getMessage());
    }
  }

}