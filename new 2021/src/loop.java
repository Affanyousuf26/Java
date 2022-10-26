import java.util.Scanner;

  public class loop {
      public static void main(String[] args) {
          int[] arr = {1, 5, 7, 3, 4, 5};
          String[] names = new String[2];
          Scanner sc = new Scanner(System.in);

          for (int i = 0; i < names.length; i++) {
              String input = sc.nextLine();
              names[i] = input;
          }
          // while loop and do while loop from here:
          int x;
          do{
              System.out.println("type a number");
              x = sc.nextInt();
          }while (x !=10);
      }

  }