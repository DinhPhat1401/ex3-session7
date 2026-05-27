public class Dog extends Animal{
    private String color;
    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public Dog(){
    }
    public String makeSound() {
        return "Woof";
    }
    public void bark() {
        System.out.println(makeSound());
    }


}
