import javax.swing.*;
import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {


        String amountAsString, accountNumAsString, name, accountNumChoiceAsString, accountsNumAsString, countAsString;
        int accountNum, input,count, choice, accountNumChoice;
        double amount, balance = 0.0;

        SavingsAccount [] accounts = null;

        SavingsAccount sa;

        input = JOptionPane.showConfirmDialog(null, "Click on ok to start adding accounts",
                "Book adding", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        countAsString = JOptionPane.showInputDialog("How many accounts you wish to add?");
        count = Integer.parseInt(countAsString);


            for(int i = 0; i<count; i++){

                accounts = new SavingsAccount[count];
                accountNumAsString = JOptionPane.showInputDialog(null, "Please enter account number: ",
                        "Banking Interface", JOptionPane.INFORMATION_MESSAGE);
                accountNum = Integer.parseInt(accountNumAsString);
                name = JOptionPane.showInputDialog(null, "Please enter owner's name: ",
                        "Banking Interface", JOptionPane.INFORMATION_MESSAGE);
                sa = new SavingsAccount(balance, name, accountNum);
                accounts[i]=sa;
            }

        Object options[] = {"Create an account", "Manage account", "Cancel"};

        choice = JOptionPane.showOptionDialog(null, "What action you wish to perform?",
                "Banking Interface", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);

        while(choice!= JOptionPane.CANCEL_OPTION) {
            if (choice == JOptionPane.YES_OPTION) {

                accounts = new SavingsAccount[count + 1];
                accountNumAsString = JOptionPane.showInputDialog(null, "Please enter account number: ",
                        "Banking Interface", JOptionPane.INFORMATION_MESSAGE);
                accountNum = Integer.parseInt(accountNumAsString);
                name = JOptionPane.showInputDialog(null, "Please enter owner's name: ",
                        "Banking Interface", JOptionPane.INFORMATION_MESSAGE);


            } else if (choice == JOptionPane.NO_OPTION) {

                accountNumChoiceAsString = JOptionPane.showInputDialog(null, "Which account you wish to manage?: ",
                        "Banking Interface", JOptionPane.INFORMATION_MESSAGE);
                accountNumChoice = Integer.parseInt(accountNumChoiceAsString);


                for (BankAccount bkAcc : accounts) {

                    if (accountNumChoice == bkAcc.getAccNum()) {


                        Object options2[] = {"Lodge", "Withdraw", "Calculate tax"};
                        choice = JOptionPane.showOptionDialog(null, "What transaction you wish to perform?",
                                "Banking Interface " + bkAcc.getAccNum(), JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options2, null);

                        if (choice == JOptionPane.YES_OPTION) {

                            amountAsString = JOptionPane.showInputDialog("Please enter the amount you wish to lodge: ");
                            amount = Double.parseDouble(amountAsString);
                            bkAcc.lodge(amount);


                        } else if (choice == JOptionPane.NO_OPTION) {

                            amountAsString = JOptionPane.showInputDialog("Please enter the amount you wish to withdraw: ");
                            amount = Double.parseDouble(amountAsString);
                            bkAcc.withdraw(amount);
                        }
                        if (choice == JOptionPane.CANCEL_OPTION) {

                            JOptionPane.showMessageDialog(null, "Your tax amount is: " + bkAcc.calcTax() + "\u20ac",
                                    "Banking Interface", JOptionPane.INFORMATION_MESSAGE);
                        } else {

                            JOptionPane.showMessageDialog(null, "Thank you for using our service", "Banking Interface", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }

                        choice = JOptionPane.showOptionDialog(null, "What action you wish to perform?",
                                "Banking Interface", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);

                    } else {

                        JOptionPane.showMessageDialog(null, "There ia no such account!", "Error", JOptionPane.INFORMATION_MESSAGE);
                        accountNumChoiceAsString = JOptionPane.showInputDialog(null, "Which account you wish to manage?: ",
                                "Banking Interface", JOptionPane.INFORMATION_MESSAGE);
                        accountNumChoice = Integer.parseInt(accountNumChoiceAsString);
                    }
                }

            } else {

                JOptionPane.showMessageDialog(null, "Thank you for using our service", "Banking Interface", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
    }
}
