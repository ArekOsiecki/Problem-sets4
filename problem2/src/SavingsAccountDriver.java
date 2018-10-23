import javax.swing.*;
/*Napisz prosty sterownik bez zadnych okien.
Ma dodawac konta, dodawac i odejmowac pieniadze z kat oraz wyswietlac saldo.
Bez kombinowania*/
public class SavingsAccountDriver {
    public static void main(String[] args) {


        String amountAsString, accountNumAsString, name, accountNumChoiceAsString,accountsNumAsString;
        int accountNum, accountNumChoice, choice, choice2,accountsNum;
        double amount, balance = 0.0;



        accountsNumAsString = JOptionPane.showInputDialog("How many accounts you wish to create?");
        accountsNum = Integer.parseInt(accountsNumAsString);

        SavingsAccount accounts[] = new SavingsAccount[accountsNum];

        Object options[] = {"Create an account", "Manage account", "Cancel"};
        do {
            choice = JOptionPane.showOptionDialog(null, "What action you wish to perform?",
                    "Banking Interface", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);


            if (choice == JOptionPane.YES_OPTION) {

                accountNumAsString = JOptionPane.showInputDialog(null, "Please enter account number: ",
                        "Banking Interface", JOptionPane.INFORMATION_MESSAGE);
                accountNum = Integer.parseInt(accountNumAsString);
                name = JOptionPane.showInputDialog(null, "Please enter owner's name: ",
                        "Banking Interface", JOptionPane.INFORMATION_MESSAGE);
                SavingsAccount account = new SavingsAccount(balance, name, accountNum);



            } else if (choice == JOptionPane.NO_OPTION) {

                accountNumChoiceAsString = JOptionPane.showInputDialog(null, "Which account you wish to manage?: ",
                        "Banking Interface", JOptionPane.INFORMATION_MESSAGE);
                accountNumChoice = Integer.parseInt(accountNumChoiceAsString);


                for (int i = 0; i <= accounts.length; i++) {

                    accounts[i] = new SavingsAccount();

                    if (i == accountNumChoice) {


                        Object options2[] = {"Lodge", "Withdraw", "Calculate tax"};
                        choice2 = JOptionPane.showOptionDialog(null, "What transaction you wish to perform?",
                                "Banking Interface"+accounts[i], JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options2, null);

                        if (choice2 == JOptionPane.YES_OPTION) {

                            amountAsString = JOptionPane.showInputDialog("Please enter the amount you wish to lodge: ");
                            amount = Double.parseDouble(amountAsString);
                            accounts[i].lodge(amount);


                        } else if (choice2 == JOptionPane.NO_OPTION) {

                            amountAsString = JOptionPane.showInputDialog("Please enter the amount you wish to withdraw: ");
                            amount = Double.parseDouble(amountAsString);
                            accounts[i].withdraw(amount);
                        }
                        if (choice2 == JOptionPane.CANCEL_OPTION) {

                            JOptionPane.showMessageDialog(null, "Your tax amount is: " + accounts[i].calcTax() + "\u20ac",
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
        } while (choice == JOptionPane.YES_OPTION || choice == JOptionPane.NO_OPTION);
    }
}




