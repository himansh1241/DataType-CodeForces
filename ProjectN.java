import java.util.Scanner;

public class ProjectN {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        char ch = hr.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(Character.toUpperCase(ch));
        } else {
            System.out.println(Character.toLowerCase(ch));
        }
    }
}