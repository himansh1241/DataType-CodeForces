import java.util.Scanner;

public class ProblemH {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        int a = hr.nextInt(), b = hr.nextInt();

        double result = (double) a / b;
    
        System.out.println("floor " + a + " / " + b + " = " + (int)Math.floor(result));
        System.out.println("ceil " + a + " / " + b + " = " + (int)Math.ceil(result));
        System.out.println("floor " + a + " / " + b + " = " + Math.round(result));

        hr.close();
    }
}