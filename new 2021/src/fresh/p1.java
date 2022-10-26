
import java.util.Scanner;


public class p1 {
    public static void main(String[] args) {
        int negativeNumber = 0;
        int positiveEvenNumber = 0;
        int positiveOddNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numers");
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;

            if (n < 0) {
                negativeNumber += n;
            } else if (n % 2 == 0) {
                positiveEvenNumber += n;
            } else {
                positiveOddNumber += n;
            }
        }
        System.out.println("sum of negative number are :" + negativeNumber);
        System.out.println("sum of positive even  number are :" + positiveEvenNumber);
        System.out.println("sum of positive odd number are :" + positiveOddNumber);
    }
}