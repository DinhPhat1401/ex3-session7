public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animal(){
    }
    public String makeSound() {
        return "Sound not defined";
    }
}
