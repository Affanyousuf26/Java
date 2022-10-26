import java.util.Scanner ;
public class hi {
    public static void main(String[] args){
        int FirstNumber;
        int SecondNumber;
        int Sum = 0;
        int operation;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please choose the operation: ");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        operation = sc.nextInt();
        if (operation == 1){
            System.out.println("Enter first number:");
            FirstNumber = sc.nextInt();
            System.out.println("Enter Second Number:");
            SecondNumber = sc.nextInt();
            int a = FirstNumber + SecondNumber;
            System.out.println(a);

        }
        if (operation==2){
            System.out.println("enter first number");
            FirstNumber =sc.nextInt();
            System.out.println("enter second number");
            SecondNumber=sc.nextInt();
            int b= FirstNumber-SecondNumber;
            System.out.println(b);
        }
        if (operation==3){
            System.out.println("enter first number");
           int s=sc.nextInt();
            System.out.println("enter second number");
          int v=sc.nextInt();
            int c=s*v;
            System.out.println("the product is :");
            System.out.println(c);
        }


    }
}
