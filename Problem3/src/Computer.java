public class Computer {

    private String id;
    private String make;
    protected Memory memory;

    public String getMake() {
        return make;
    }

    public String getId() {
        return id;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public String toString(){

        String computerString = "Computer Id: "+getId()+"\nComputer Make: "+getMake()+"Computer Memory"+getMemory();
        return computerString;

    }

    public Computer(String make, String memType, int memSize){
        this.id =getId();
        this.make = getMake();
        Memory memory = new Memory(memType, memSize);

    }

    public Computer(){
        this.id = getId();
        this.make = getMake();
        this.memory = getMemory();

    }
}
