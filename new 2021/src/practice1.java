import java.util.Scanner;
public class practice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("input your number");
        int a= sc.nextInt();
        if (a%2==0) {
            System.out.println("not a prime number");
        }
        else {
            System.out.println("prime number");
        }

    }



}
