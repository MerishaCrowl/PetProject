public class Pet {  //Create a Pet class with instance variables
    private String name; //name (Private)
    private int age; //age (Private)
    private String location; //location (Private)
    private String type; //type (Private)



    public Pet() { //Create an empty constructor

    }

    //Create constructor with all attributes
    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    //Code Get method for name:
    public String getName() {
        return name;
    }

    //Code Get method for age:
    public int getAge() {
        return age;
    }

    //Code Get method for type:
    public String getType() {
        return type;
    }

    //Code Set method for name:
    public void setName(String name) {
        this.name = name;
    }

    //Code Set method for age:
    public void setAge(int age) {
        this.age = age;
    }

    //Set method for location:
    public void setLocation(String location) {
        this.location = location;
    }

    //Set method for type:
    public void setType(String type) {
        this.type = type;
    }
}