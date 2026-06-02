import java.util.Scanner;

public class ProjectM {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        char x = hr.next().charAt(0);

        if (x >= '0' && x <= '9') {
            System.out.println("IS DIGIT");
        }
        else {
            System.out.println("ALPHA");

            if(x >= 'A' && x <= 'Z') {
                System.out.println("IS CAPITAL");
            }
            else{
                System.out.println("IS SMALL");
            }
        }
    }
}
