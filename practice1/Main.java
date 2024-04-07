package practice1;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Bones","medium");

        Cat cat = new Cat("Tuna","small");

        dog.printAnimalFood();
        cat.printAnimalFood();

        dog.makeSound();
        cat.makeSound();

        Animal dogToCat = new Dog("Bones", "medium");
        //System.out.println(dogToCat instanceof Animal);

        dogToCat = new Cat("Tuna", "small");

        Cat extinctCat = new Cat("unknown", "Unknown");

        ((Cat)dogToCat).scratch();
        System.out.println(dogToCat.id);
        Animal.printUniqueAnimalMethod(dog);

        Pet[] pet = {dog,cat};
        Pet.printPetGreeting(pet);
        dog.printPetClassName(dog);
        Animal.animalSize(cat);
    }
}
