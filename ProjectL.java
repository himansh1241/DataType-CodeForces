import java.util.Scanner;

public class ProjectL {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        String F1 = hr.next(), S1 = hr.next(), F2 = hr.next(), S2 = hr.next();
        String result = S1.equals(S2) ? "ARE Brothers" : "NOT";
        System.out.println(result);

        hr.close();
    }
}