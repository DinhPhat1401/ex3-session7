public class Cat extends Animal {
    private String breed;

    public Cat(String name, int age) {
        super(name, age);
    }
    public Cat(){
    }

    @Override
    public String makeSound() {
        return "Meow";
    }
    public void meow() {
        System.out.println(makeSound());
    }
}
