public class Memory {

    private String type;
    private int size;

    public int getSize() {
        return this.size;
    }

    public String getType() {
        return type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Memory(String type, int size){
        this.size = size;
        this.type = type;

    }

    public String toString(){

        String memoryString = " "+getSize()+"GB  "+getType();
        return memoryString;
    }
}
