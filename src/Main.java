import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min=1;
        int max=2;
        System.out.println("Enter your Input");
        System.out.println("For Rock press 1\nFor Paper press 2\nFor Sessior press 3 :- ");
        int input = sc.nextInt();
        double randomNumber = Math.ceil(Math.random() * (max - min + 1) + min ) ;
        System.out.println(randomNumber);
        if (input==randomNumber){
            System.out.println("Draw");
        } else if (input==1 && randomNumber==2) {
            System.out.println("System Win");
        }
        else if (input==1 && randomNumber==3) {
            System.out.println("User Win");
        }
        else if (input==2 && randomNumber==1) {
            System.out.println("User Win");
        }
        else if (input==2 && randomNumber==3) {
            System.out.println("System Win");
        }
        else if (input==3 && randomNumber==1) {
            System.out.println("System Win");
        }
        else if (input==3 && randomNumber==2) {
            System.out.println("User Win");
        }
        else {
            System.out.println("Error");
        }

    }
}