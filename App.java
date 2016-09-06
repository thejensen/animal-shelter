import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Animal skunk = new Animal("skunk", 2, "black and white", "strawberries", 2);
    Animal giraffe = new Animal("Giraffe", 13, "Brown and white", "Leaves", 3);
    Animal cat = new Animal("cat", 5, "calico", "human hearts", 100);
    Animal dog = new Animal("dog", 3, "black", "cats", 6);

    Animal[] allAnimals = { skunk, giraffe, cat, dog };

    System.out.println("What's the oldest animal you'll accept in years?");
    Integer userPetOldestAge = Integer.parseInt(myConsole.readLine());

    for ( Animal individualAnimal : allAnimals ) {
      if (individualAnimal.youngPet(userPetOldestAge)) {
        System.out.println("-------------");
        System.out.println( "I am a " + individualAnimal.mSpecies );
        System.out.println( "I am " + individualAnimal.mAge + " years old" );
        System.out.println( "I'm colored " + individualAnimal.mColor );
        System.out.println( "My favorite treat is " + individualAnimal.mFavoriteTreat );
        System.out.println( "I've been in the shelter for " + individualAnimal.mTimeInShelter + " months" );
      }
    }
    
  }
}
