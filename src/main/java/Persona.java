public class Persona {
    private String name;
    private int age;
    private int yearBorn;

    public Persona(String name, int yearBorn) {
        this.name = name;
        this.yearBorn = yearBorn;
        this.age = 2024-yearBorn;
    }

    @Override
    public String toString() {
        return "name:" +name+" age: " +age;

    }
}
