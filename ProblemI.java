import java.util.Scanner;

public class ProblemI {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        int a = hr.nextInt(), b = hr.nextInt();

        String result = (a >= b) ? "Yes" : "No";
        System.out.println(result);

        hr.close();
    }
}