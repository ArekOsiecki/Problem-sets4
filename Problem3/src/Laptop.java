public class Laptop extends Computer {

    private boolean touchScreen;

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public String toString(){

        String laptopString = "Laptop Id: "+getId()+"\nLaptop Make: "+getMake()+"Laptop Memory"+getMemory();
        return laptopString;
    }

    public Laptop(String make,String id, String memType, int memSize, boolean touchScreen){

       super();
       setTouchScreen(true);
    }
}
