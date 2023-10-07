package Basics_of_java;
import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int d = 1;
       int an = 1;
       while(d<=n){
          an=d*an;

        System.out.println(an);
        d++;

    }
    }

}
