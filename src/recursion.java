import java.util.Scanner;

public class recursion {
    static double mean=0.0, var=0.0, SD=0.0;
    static int n=0;

    public static double cal_mean(double[] numbers, int k) {
        if(k == n)
        {
            mean = mean/n;
            return mean;
        }
        else
        {
            mean += numbers[k];
            k++;
            return cal_mean(numbers, k);
        }
    }

    public static double square(double temp)
    {
        return temp*temp;
    }

    public static double variance(double[] numbers, int k) {
        if(k == n)
        {
            var = var/n;
            return var;
        }
        else
        {
            double temp = numbers[k] - mean;
            var += square(temp);
            k++;
            return variance(numbers, k);
        }
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
        int k=0;
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
        mean = cal_mean(numbers, k);
        var = variance(numbers, k);
        SD = sqrt();
        System.out.print("Standard deviation is "+SD);
    }
}
