import java.util.Scanner;

public class main_class {

    public static double cal_mean(double[] numbers, int n) {
        int total = 0;
        for(int i=0; i<n; i++)
        {
            total+=numbers[i];
        }
        return total/n;
    }

    public static double square(double temp)
    {
        return temp*temp;
    }

    public static double variance(double mean, double[] numbers,int n) {
        double total = 0;
        for(int i=0; i<n; i++)
        {
            double temp =0;
            temp =  numbers[i] - mean;
            total += square(temp);
        }
        return total/n;
    }

    public static double sqrt(double var)
    {
        double t;
        double sqrtroot=var/2;
        do
        {
            t=sqrtroot;
            sqrtroot=(t+(var/t))/2;
        }
        while((t-sqrtroot)!= 0);
        return sqrtroot;
    }


    public static void main(String[] args) {
        int n;
        double mean, var, SD;
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
        mean = cal_mean(numbers, n);
        var = variance(mean, numbers, n);
        SD = sqrt(var);
        System.out.print("Standard deviation is "+SD);
    }
}