import java.util.Scanner;

public class ProblemK {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        long a = hr.nextInt(), b = hr.nextInt(), c = hr.nextInt();

        long min = Math.min(a, Math.min(b, c));
        long max = Math.max(a, Math.max(b, c));

        System.out.println(min + " " + max);

        hr.close();
    }
}