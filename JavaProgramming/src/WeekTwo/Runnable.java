package WeekTwo;

public class Runnable {
    public static void main(String[] args) {
        // Create an instance of Person
        Person sohaib = new Person();

        // Set the information of sohaib (name, age, height)
        sohaib.setName("Sohaib Mohiuddin");
        sohaib.setAge(45);
        sohaib.setHeight(6);
        sohaib.setNationality("Indian");

        // Get the information of sohaib
        System.out.println("The name is: " + sohaib.getName());
        System.out.println("The age is: " + sohaib.getAge() + " years old");
        System.out.println(sohaib.getName() + "'s height is: " + sohaib.getHeight() + "'");
        System.out.println("The nationality is: " + sohaib.getNationality());

        // Creating a new person
        Person randomPerson = new Person("Timbaktu");
        System.out.println(randomPerson.getName() + "'s age is: " + randomPerson.getAge());
    }
}