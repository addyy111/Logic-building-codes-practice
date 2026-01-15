
import java.util.Scanner;

public class positivecheck {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0 ){
            System.out.println("number is positive");
        }
        else if ( number < 0){
            System.out.println("number is negative");
        }
        else {
            System.out.println("number is 0");
        }
    }
}
