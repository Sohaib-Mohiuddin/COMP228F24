public class Runnable {
    public static void main(String[] args) {
        // Create an instance of Person
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        // Set user information
        person1.setName("Sohaib");
        person1.setAge(21);
        person1.setHeight(6);

        // Get user information
        System.out.println("The name of the Person: " + person1.getName());
        System.out.println("The age of the Person: " + person1.getAge());
        System.out.println("The height of the Person: " + person1.getHeight());
    }
}