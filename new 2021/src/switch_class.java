import java.util.Scanner;
public class switch_class {
    public static void main( String [] args){
        int n1 ,n2;
        char ab;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        n1= sc.nextInt();
        System.out.println("ENTER THE OPERATION");
        ab = sc.next().charAt(0);
        System.out.println("Enter second Number");
        n2= sc.nextInt();
        switch (ab) {
            case '+' -> {
                sum = n1 + n2;
                System.out.println(sum);
            }
            case '-' -> {
                sum = n1 - n2;
                System.out.println(sum);
            }
            case '*' -> {
                sum = n1 * n2;
                System.out.println(sum);
            }
            case '%' -> {
                sum = n1 % n2;
                System.out.println(sum);
            }
            default -> System.out.println("Wrong operation");
        }
    }
}
