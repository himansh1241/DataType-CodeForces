import java.util.Scanner;

public class ProblemH {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        long a = hr.nextLong(), b = hr.nextLong();

        double result = (double) a / b;
    
        System.out.println("floor " + a + " / " + b + " = " + (long)Math.floor(result));
        System.out.println("ceil " + a + " / " + b + " = " + (long)Math.ceil(result));
        System.out.println("floor " + a + " / " + b + " = " + Math.round(result));

        hr.close();
    }
}