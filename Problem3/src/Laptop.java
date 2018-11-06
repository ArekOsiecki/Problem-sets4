public class Laptop extends Computer {

    private boolean touchScreen;

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public String toString(){

        String laptopString = "Laptop Id: "+getId()+"\nLaptop Make: "+getMake()+"\nLaptop Memory "+memory.toString();
        return laptopString;
    }

    public Laptop(String id,String make, String memType, int memSize, boolean touchScreen){

       super(id, make,memType, memSize);
       setTouchScreen(true);

    }
}
