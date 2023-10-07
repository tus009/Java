package Basics_of_java;
import java.util.Scanner;
public class takingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int num2 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int num3 = sc2.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1 + " is greatest");

        } else if (num2>num3) {
            System.out.println(num2 + " is greatest");

        }
        else {
            System.out.println(num3 + " is greatest");
        }
    }
}
