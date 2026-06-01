import java.util.Scanner;

public class ProblemJ {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        long a = hr.nextInt(), b= hr.nextInt();

        String result = (a % b == 0 || b % a == 0) ? "Multiples" : "No Multiples";
        System.out.println(result);

        hr.close();
    }
}