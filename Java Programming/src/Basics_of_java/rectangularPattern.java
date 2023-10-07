package Basics_of_java;
import java.util.Scanner;
public class rectangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int c = sc2.nextInt();

        for(int i = 1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print(j);
                 
            }
            System.out.println();
        }
    }
}
