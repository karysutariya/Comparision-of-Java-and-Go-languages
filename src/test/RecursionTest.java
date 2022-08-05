package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import code.Recursion;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;

/**
 * The RecursionTest class tests Recursion class.
 */
public class RecursionTest {
    
  /**
   * Test method for calMean.
   */
  @Test
    public void calMeanTest() {
    final double[] numbers = { 2, 2, 2 };
    Recursion.totaln = 3;
    Recursion.mean = 0;
    assertEquals(2.0, Recursion.calMean(numbers, 0), "Problem in calMeanTest()");
  }

  /**
   * Test method for square.
   */
  @Test
    public void squareTest() {
    assertEquals(4.0, Recursion.square(2.0), "Problem in square()");
  }

  /**
   * Test method for variance.
   */
  @Test
    public void variance() {
    Recursion.mean = 2;
    Recursion.totaln = 3;
    final double[] numbers = { 2, 2, 2 };
    assertEquals(0.0, Recursion.variance(numbers, 0), "Problem in variance()");
  }

  /**
   * Test method 1 for sqrt.
   */
  @Test
    public void sqrtTest1() {
    Recursion.var = 0.0;
    assertEquals(0.0, Recursion.sqrt(), "Problem in sqrtTest1()");
  }

  /**
   * Test method 2 for sqrt.
   */
  @Test
    public void sqrtTest2() {
    Recursion.var = 4.0;
    assertEquals(2.0, Recursion.sqrt(), "Problem in sqrtTest2()");
  }

  /**
   * Test method for main.
   */
  @Test
    public void mainTest() {
    final InputStream sysInBackup = System.in;
    final String[] args = new String[0];
    ByteArrayInputStream inp = new ByteArrayInputStream("c 2 2 g 2".getBytes());
    System.setIn(inp);
    Recursion.main(args);
    inp = new ByteArrayInputStream("-5 2 2 g 2".getBytes());
    System.setIn(inp);
    Recursion rec = new Recursion();
    rec.main(args);
    System.setIn(sysInBackup);
  }
}