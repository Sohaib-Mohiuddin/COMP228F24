package WeekTwo;

public class Person {
    // Declaring Instance Variables
    private String name;
    private int age;
    private int height;
    private String nationality;

    // Constructor
    public Person() {
        this.name = "default";
        this.age = 0;
        this.height = 0;
        this.nationality = "default";
    }
    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.height = 0;
        this.nationality = "default";
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
    public void setNationality(String nationality) {
        this.nationality = nationality;
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
    public String getNationality() {
        return nationality;
    }
}