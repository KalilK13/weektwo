package practice1;

public interface Pet {
    void greetOwner();
    default void printPetClassName(Pet pet){
        System.out.println(pet.getClass().getSimpleName());
    }

    static void printPetGreeting(Pet[] pets){
        for(Pet p : pets){
            p.greetOwner();
        }
    }
}
