package practice1;

public class RoboDog extends Robot implements Pet{

    @Override
    public void greetOwner() {
        System.out.println("play bark sound and light up.");
    }
}
