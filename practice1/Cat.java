package practice1;

public class Cat extends Feline implements Pet{
    public Cat(String food, String size) {
        super(food, size);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void printAnimalFood() {
        System.out.println(this.food);
    }
    public void scratch(){
        System.out.println("I'm a cat I can scratch.");
    }

    @Override
    public void greetOwner() {
        System.out.println("Licks face");
    }
}
