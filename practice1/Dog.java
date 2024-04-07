package practice1;

public class Dog extends Canine implements Pet{
    public Dog(String food, String size) {
        super(food, size);
    }

    @Override
    public void makeSound(){
        System.out.println("Bark");
    }

    @Override
    public void printAnimalFood() {
        System.out.println(this.food);
    }
    public void fetch(){
        System.out.println("I'm a dog, I can fetch.");
    }

    @Override
    public void greetOwner() {
        System.out.println("Lick feet");
    }
}
