 import javax.swing.*;
 import java.util.Random;
public class menu {
    public static void main(String[]args) {
        String Menu;
        String Account;
        String w;
        int account = 10000;
        do {
            JOptionPane.showMessageDialog(null, "welcome to yo bank ");
            Menu = JOptionPane.showInputDialog("Choose an option" + "\n 1.New User \n" +
                    "2.Already a User\n");

            if (Menu.equals("1")) {
                String a = JOptionPane.showInputDialog("enter your name");
                Random random = new Random();
                int nextInt = random.nextInt(10000);
                JOptionPane.showMessageDialog(null, "hi" + a + "your account number is " + ":" + nextInt * 5);
                Account = JOptionPane.showInputDialog("Choose an option" + "\n  1.want to know your account balance \n " +
                        "2.want to add money\n" + "3.want to withdraw money");
                if (Account.equals("1")) {

                    JOptionPane.showMessageDialog(null, "your account balance is " + ":" + account);
                } else if (Account.equals("2")) {
                    String Amount_add = JOptionPane.showInputDialog(null, "Enter the amount to be added");
                    int aa = Integer.parseInt(Amount_add);
                    int sum = account + aa;
                    JOptionPane.showMessageDialog(null, "your new balance is " + sum);
                } else if (Account.equals(3)) {
                    String Amount_sub = JOptionPane.showInputDialog("enter the amount to be withdrawal");
                    int bb = Integer.parseInt(Amount_sub);
                    int withdrawal_money = account - bb;

                }
            } else if (Menu.equals("2")) {
                Account = JOptionPane.showInputDialog("Choose an option" + "\n  1.want to know your account balance \n " +
                        "2.want to add money\n" + "3.want to withdraw money");
                if (Account.equals("1")) {

                    JOptionPane.showMessageDialog(null, "your account balance is " + ":" + account);
                } else if (Account.equals("2")) {
                    String Amount_add = JOptionPane.showInputDialog(null, "Enter the amount to be added");
                    int aa = Integer.parseInt(Amount_add);
                    int sum = account + aa;
                    JOptionPane.showMessageDialog(null, "your new balance is " + sum);
                } else if (Account.equals("3")) {
                    String Amount_sub = JOptionPane.showInputDialog("enter the amount to be withdrawal");
                    int bb = Integer.parseInt(Amount_sub);
                    int withdrawal_money = account - bb;

                }

            } else {
                JOptionPane.showMessageDialog(null, "Wrong Input");
            }

            w = JOptionPane.showInputDialog("do you wish to continue ");
        } while (w.equals("yes"));
    }
}
