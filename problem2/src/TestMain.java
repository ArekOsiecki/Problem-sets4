import javax.swing.*;
import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {


        String amountAsString, accountNumAsString, name, accountNumChoiceAsString, accountsNumAsString, countAsString;
        int accountNum, input, count, choice, accountNumChoice, choice2;
        double amount, balance = 0.0;

        SavingsAccount[] accounts = null;

        SavingsAccount sa;

        input = JOptionPane.showConfirmDialog(null, "Click on ok to start adding accounts",
                "Book adding", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        countAsString = JOptionPane.showInputDialog("How many accounts you wish to add?");
        count = Integer.parseInt(countAsString);


        for (int i = 0; i < count; i++) {

            accounts = new SavingsAccount[count];
            accountNumAsString = JOptionPane.showInputDialog(null, "Please enter account number: ",
                    "Banking Interface", JOptionPane.INFORMATION_MESSAGE);
            accountNum = Integer.parseInt(accountNumAsString);
            name = JOptionPane.showInputDialog(null, "Please enter owner's name: ",
                    "Banking Interface", JOptionPane.INFORMATION_MESSAGE);
            sa = new SavingsAccount(balance, name, accountNum);
            accounts[i] = sa;
        }

        input = JOptionPane.showConfirmDialog(null,"Do you wish to manage accounts?, press cancel to exit","Banking Interface",JOptionPane.OK_CANCEL_OPTION);

        while(input!=JOptionPane.CANCEL_OPTION) {
            accountNumChoiceAsString = JOptionPane.showInputDialog(null, "Which account you wish to manage?: ",
                    "Banking Interface", JOptionPane.INFORMATION_MESSAGE);
            accountNumChoice = Integer.parseInt(accountNumChoiceAsString);

            for (BankAccount bkAcc : accounts) {

                if (accountNumChoice == bkAcc.getAccNum()) {


                    Object options[] = {"Lodge", "Withdraw", "Calculate tax"};
                    choice2 = JOptionPane.showOptionDialog(null, "What transaction you wish to perform?",
                            "Banking Interface " + bkAcc.getAccNum(), JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);

                    if (choice2 == JOptionPane.YES_OPTION) {

                        amountAsString = JOptionPane.showInputDialog("Please enter the amount you wish to lodge: ");
                        amount = Double.parseDouble(amountAsString);
                        bkAcc.lodge(amount);
                        JOptionPane.showMessageDialog(null, bkAcc.toString(), "Banking interface", JOptionPane.INFORMATION_MESSAGE);


                    } else if (choice2 == JOptionPane.NO_OPTION) {

                        amountAsString = JOptionPane.showInputDialog("Please enter the amount you wish to withdraw: ");
                        amount = Double.parseDouble(amountAsString);
                        bkAcc.withdraw(amount);

                        JOptionPane.showMessageDialog(null, bkAcc.toString(), "Banking interface", JOptionPane.INFORMATION_MESSAGE);

                    } else if (choice2 == JOptionPane.CANCEL_OPTION) {

                        JOptionPane.showMessageDialog(null, "Your tax amount is: " + bkAcc.calcTax() + "\u20ac",
                                "Banking Interface", JOptionPane.INFORMATION_MESSAGE);


                    } else {

                        JOptionPane.showMessageDialog(null, "There ia no such account!", "Error", JOptionPane.INFORMATION_MESSAGE);
                        accountNumChoiceAsString = JOptionPane.showInputDialog(null, "Which account you wish to manage?: ",
                                "Banking Interface", JOptionPane.INFORMATION_MESSAGE);
                        accountNumChoice = Integer.parseInt(accountNumChoiceAsString);
                    }

                }
            }
        }
        JOptionPane.showMessageDialog(null, "Thank you for using our service", "Banking Interface", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
            }







