public class Person {
    // Declaring Instance Variables
    private String name;
    private int age;
    private int height;

    // Constructor
    public Person() {
        this.name = "default";
        this.age = 0;
        this.height = 0;
    }
    public Person(String name) {
        this.age = age;
        this.name = "default";
        this.height = 0;
    }

    // Setters or Mutators
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    // Getters or Accessors
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getHeight() {
        return height;
    }
}