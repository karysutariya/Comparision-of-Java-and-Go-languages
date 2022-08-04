package code;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger; 

/**
 * The Recursion class has been implemented 
 * to perform standard deviation using recursion.  
 */
public class Recursion {
    
  /**
   * mean is used to store mean value. 
   */
  public static double mean;
  /**
   * var is used to store variance value. 
   */
  public static double var;
  /**
   * std is square root value of var. 
   */
  public static double std;
  /**
   * LOG is used to print log on console. 
   */
  public static final Logger LOG = Logger.getLogger("Iterative");
  /**
   * totaln is integer given by user. 
   */
  public static int totaln;

  /**
   * calMean can be used to calculate the mean.
   *
   * @param numbers input from the user.
   * @param key integer value which is by default zero. 
   * @return mean of all numbers
   */
  public static double calMean(final double[] numbers, final int key) {
    if (key == totaln) {
      mean = mean / totaln;
      return mean;
    }
    mean += numbers[key];
    final int tempk = key + 1;
    return calMean(numbers, tempk);
  }

  /**
   * square gives squares of numbers.
   *
   * @param temp can be a real number. 
   * @return square of the temp.
   */
  public static double square(final double temp) {
    return temp * temp;
  }

  /**
   * Variance calculates variance for given numbers. 
   *
   * @param numbers input from users.
   * @param key integer value which is by default zero.
   * @return variance. 
   */
  public static double variance(final double[] numbers, final int key) {
    if (key == totaln) {
      var = var / totaln;
      return var;
    }
    final double temp = numbers[key] - mean;
    var += square(temp);
    final int tempk = key + 1;
    return variance(numbers, tempk);
  }

  /**
   * sqrt gives the square root of numbers.
   *
   * @return 0 or square root.
   */
  public static double sqrt() {
    if (var != 0) {
      double top;
      double sqrtRoot = var / 2;
      do {
        top = sqrtRoot;
        sqrtRoot = (top + (var / top)) / 2;
      } while (top - sqrtRoot != 0);
      return sqrtRoot; // second exit
    }
    return 0; // first exit
  }

  /**
   * This is the driver method or main method of the Recursive class. 
   *
   * @param args given by the user.
   */
  public static void main(String[] args) {
    LOG.info("How many numbers do you want to find standard deviation?");
    final Scanner inputUser = new Scanner(System.in);
    boolean conditon = true;
    while (conditon) {
      try {
        totaln = inputUser.nextInt();
        conditon = false;
      } catch (InputMismatchException e) {
        inputUser.next();
        LOG.warning("Please enter a number!");
      }
    }
    double[] numbers = new double[totaln];
    LOG.info("Kindly let me know the numbers!");
    int ijk = 0;
    while (ijk < totaln) {
      try {
        numbers[ijk] = inputUser.nextDouble();
        ijk++;
      } catch (InputMismatchException e) {
        inputUser.next();
        LOG.warning("Please enter a number!");
      }
    }
    inputUser.close();
    mean = calMean(numbers, 0);
    var = variance(numbers, 0);
    std = sqrt();
    LOG.info("Standard deviation is " + std); 
  }
}
