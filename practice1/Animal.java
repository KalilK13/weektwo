package practice1;

public abstract class Animal {

     protected String food;
     public int id;
     public static int uniqueID = 0;
     private Size size;

     public Animal(String food, String size){
          this.food = food;
          if(size.equalsIgnoreCase("small")){
               setSize(Size.SMALL);
          }
          else if(size.equalsIgnoreCase("medium")){
               setSize(Size.MEDIUM);
          }
          else if (size.equalsIgnoreCase("large")){
               setSize(Size.LARGE);
          }
//          this.size = size;
          id = uniqueID++;
     }
     public Animal(){
     }

     public abstract  void makeSound();

     public void setSize(Size size) {
          this.size = size;
     }

     public abstract void printAnimalFood();
     public static void printUniqueAnimalMethod(Animal animal){
          if(animal instanceof Dog){
               ((Dog)animal).fetch();
          }
          if(animal instanceof Cat){
               ((Cat)animal).scratch();
          }
     }
     public static void animalSize(Animal animal){
          if(animal.size == Size.SMALL){
               System.out.println("This is a small animal.");
          }
          else if(animal.size == Size.MEDIUM){
               System.out.println("This animal is a medium sized animal.");
          }
          else if(animal.size == Size.LARGE){
               System.out.println("This is a large sized animal.");
          }
          else{
               System.out.println("This is an animal of unknown size.");
          }
     }
}
