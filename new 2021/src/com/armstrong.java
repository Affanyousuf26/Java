package com;
import java.util.Scanner;

public class armstrong {
   /* public static void main(String[] args) {
        System.out.print("enter a 3 digit number to check for armstrong");
        Scanner sc=new Scanner(System.in);
        int sum;
        int n = sc.nextInt(),a,result=0;
        /*  int  a=n%10;
        n=n/10;
        int  b=n%10;
        n=n/10;
        int c=n%10;
        n=n/10; */
       /* while (n!=0){
            a=n%10;
            result+=Math.pow(a,3);
            n=n/10;
        }
        if(result==n)
            System.out.print(n+"is an Armstrong");
        else
                System.out.print(n+"not");*/
      /* public static void main(String[] args) {
           int number = 371, originalNumber, remainder, result = 0;
           originalNumber = number;
           while (originalNumber != 0)
           {
               remainder = originalNumber % 10;
               result += Math.pow(remainder, 3);
               originalNumber /= 10;
           }
           if(result == number)
               System.out.println(number + " is an Armstrong number.");
           else
               System.out.println(number + " is not an Armstrong number.");
       }
    }*/
   public static void main(String[] args) {
       System.out.println("enter a 3 digit number");
       Scanner sc=new Scanner(System.in);
       int num;
       double sum = 0;
       int newnum=153;

      // int newnum=sc.nextInt();
       do {
          num= newnum%10;
           double A = Math.pow(num, 3);
          newnum/=10;
          num= newnum%10;
           double B = Math.pow(num, 3);
           newnum/=10;
           num= newnum%10;
           double C = Math.pow(num, 3);
           newnum/=10;
           sum=A+B+C;


       }while (newnum!=0);
       if(sum==newnum){
           System.out.print(sum+"hey");
       }else
           System.out.println(sum+"m");





   }







}
