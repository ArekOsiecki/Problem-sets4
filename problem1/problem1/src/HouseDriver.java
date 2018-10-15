import javax.swing.*;

public class HouseDriver {
    public static void main(String[] args) {


        String address, type, name, priceAsString, ageAsString, genderAsString;
        double price;
        int age;
        char gender;


        House house = new House();
        JOptionPane.showMessageDialog(null,house.toString(),"House",JOptionPane.INFORMATION_MESSAGE);
        address = JOptionPane.showInputDialog("Please enter address: ");
        type = JOptionPane.showInputDialog("Please enter type of house: ");
        priceAsString = JOptionPane.showInputDialog("Please enter price of the house: ");
        price=Double.parseDouble(priceAsString);
        while(price<0.0){
            JOptionPane.showMessageDialog(null, "You cannot enter a negative value!","Wrong!", JOptionPane.ERROR_MESSAGE);
            priceAsString = JOptionPane.showInputDialog("Please enter correct price of the house: ");
            price=Double.parseDouble(priceAsString);
        }
        name = JOptionPane.showInputDialog("Please enter owner's name: ");
        ageAsString = JOptionPane.showInputDialog("Please owner's age: ");
        age=Integer.parseInt(ageAsString);
        genderAsString= JOptionPane.showInputDialog("Please enter owner's gender: ");
        gender = genderAsString.charAt(0);

        House house1 = new House(address, name, price, type, age, gender);
       JOptionPane.showMessageDialog(null,house1.toString(),"House",JOptionPane.INFORMATION_MESSAGE);



    }
}
