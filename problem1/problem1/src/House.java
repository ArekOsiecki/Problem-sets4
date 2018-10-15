public class House {

    private String address, type;
    private double price;
    private Person owner;

    public void setAddress(String address){
        this.address = address;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setOwner(Person person ){
        this.owner = person;
    }
    public String getAddress(){
        return address;
    }
    public String getType(){
        return type;
    }
    public double getPrice(){
        return price;
    }
    public Person getOwner(){
        return owner;
    }

    public String toString(){

        String houseString = "Address: "+address+"\nType: "+type+"\nPrice: "+price+" \u20ac"+"\nOwner: "+owner;
        return houseString;
    }

    public House(){

        setAddress("No Address Specified");
        setType("No Type Specified");
        setPrice(0.0);
        setOwner(new Person("No Owner Specified",0,'u'));
    }
    public House(String address, String type, double price, String name, int age, char gender){

       setAddress(address);
       setType(type);
       setPrice(price);
       setOwner(new Person(name, age, gender));
    }
}
