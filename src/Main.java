public class Main {
    public static void main(String[] args) {
        //Create a Pet object using the empty constructor
        Pet pet1 = new Pet();

        //Set attributes using the set methods
        pet1.setName("Jumper");
        pet1.setAge(3);
        pet1.setLocation("Texas");
        pet1.setType("Dog");

        //Create another Pet Object using the constructor with all attributes
        Pet pet2 = new Pet("Bella", 2, "Louisiana", "Unicorn");

        // Retrieve attributes using the get methods and print them
        System.out.println("Pet 1: " + pet1.getName() + ", " + pet1.getAge() + " years old, " + pet1.getType());
        System.out.println("Pet 2: " + pet2.getName() + ", " + pet2.getAge() + " years old, " + pet2.getType());
        }
    }
