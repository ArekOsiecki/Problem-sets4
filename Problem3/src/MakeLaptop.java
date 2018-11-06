import javax.swing.*;

public class MakeLaptop {
    public static void main(String[] args) {

        String make, id, memType, memSizeAsString;
        int memSize;
        boolean touchScreen = true;


        id = JOptionPane.showInputDialog("What is your laptop id? ");
        make = JOptionPane.showInputDialog("What is your laptop make? ");
        memType = JOptionPane.showInputDialog("What is your laptop memory type? ");
        memSizeAsString = JOptionPane.showInputDialog("What is your laptop memory size? ");
        memSize = Integer.parseInt(memSizeAsString);


        Laptop laptop = new Laptop( id, make, memType, memSize, touchScreen);


        JOptionPane.showMessageDialog(null,laptop.toString(),"Laptop spec",JOptionPane.INFORMATION_MESSAGE);

    }
}
