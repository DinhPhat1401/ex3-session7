//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 3, "brown");
        Cat cat = new Cat("Whiskers", 2);
        System.out.println(dog.name + " says: " + dog.makeSound());
        System.out.println(cat.name + " says: " + cat.makeSound());
    }
}