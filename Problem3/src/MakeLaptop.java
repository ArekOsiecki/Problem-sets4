import javax.swing.*;

public class MakeLaptop {
    public static void main(String[] args) {

        String make, id, memType, memSizeAsString;
        int memSize;
        boolean touchScreen = true;

        make = JOptionPane.showInputDialog("What is your laptop make? ");
        id = JOptionPane.showInputDialog("What is your laptop id? ");
        memType = JOptionPane.showInputDialog("What is your laptop memory size? ");
        memSizeAsString = JOptionPane.showInputDialog("What is your laptop memory size? ");
        memSize = Integer.parseInt(memSizeAsString);

        Laptop laptop = new Laptop(make, id, memType, memSize, touchScreen);



    }
}
