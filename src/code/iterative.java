package code;
import java.util.Scanner;

public class iterative {
    public static double mean=0.0, var=0.0, SD=0.0;
    public static int n=0;

    public static double cal_mean(double[] numbers) {
        int total = 0;
        for(int i=0; i<n; i++)
        {
            total+=numbers[i];
        }
        return (double)total/n;
    }

    public static double square(double temp)
    {
        return temp*temp;
    }

    public static double variance(double[] numbers) {
        double total = 0;
        for(int i=0; i<n; i++)
        {
            double temp =numbers[i] - mean;
            total += square(temp);
        }
        total = total /n;
        return total;
    }

    public static double sqrt()
    {
    	if(var != 0) {
            double t;
            double sqrtRoot = var / 2;
            do {
                t = sqrtRoot;
                sqrtRoot = (t + (var / t)) / 2;
            }
            while ((t - sqrtRoot) != 0);
            return sqrtRoot;
        }
        else
            return 0;
    }


    public static void main(String[] args) {

        System.out.println("How many numbers do you want to find standard deviation?");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        double[] numbers = new double[n];
        System.out.println("Kindly let me know the numbers!");
        for(int i=0; i<n; i++)
        {
            numbers[i] = in.nextDouble();
        }
        in.close();
        mean = cal_mean(numbers);
        var = variance(numbers);
        SD = sqrt();
        System.out.print("Standard deviation is "+SD);
    }
}