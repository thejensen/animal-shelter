import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Animal skunk = new Animal("skunk", 2, "black and white", "strawberries", 2);
    Animal giraffe = new Animal("Giraffe", 13, "Brown and white", "Leaves", 3);
    Animal cat = new Animal("cat", 5, "calico", "human hearts", 100);
    Animal dog = new Animal("dog", 3, "black", "cats", 6);

    List<Animal> allAnimals = new ArrayList<Animal>();
    allAnimals.add(skunk);
    allAnimals.add(giraffe);
    allAnimals.add(cat);
    allAnimals.add(dog);

    boolean programRunning = true;

    while(programRunning) {
      System.out.println("Welcome to the Animal Shelter. What would you like to do? Enter one of the following options: All Animals, Search Age, or Add Animal");
      String navigationChoice = myConsole.readLine();

      if (navigationChoice.equals("All Animals")) {
        for ( Animal individualAnimal : allAnimals ) {
          System.out.println("-------------");
          System.out.println( "I am a " + individualAnimal.mSpecies );
          System.out.println( "I am " + individualAnimal.mAge + " years old" );
          System.out.println( "I'm colored " + individualAnimal.mColor );
          System.out.println( "My favorite treat is " + individualAnimal.mFavoriteTreat );
          System.out.println( "I've been in the shelter for " + individualAnimal.mTimeInShelter + " months" );
        }
      } else if (navigationChoice.equals("Exit")) {
        programRunning = false;
      } else if (navigationChoice.equals("Search Age")) {
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
      } else if (navigationChoice.equals("Add Animal")) {
          System.out.println("Alright, let's add an animal! What species is your animal?");
          String userAnimalSpecies = myConsole.readLine();
          System.out.println("Great! How many years old is your animal?");
          int userAnimalAge = Integer.parseInt(myConsole.readLine());
          System.out.println("Got it! What color is it?");
          String userAnimalColor = myConsole.readLine();
          System.out.println("And what's its favorite treat?");
          String userAnimalFavoriteTreat = myConsole.readLine();
          System.out.println("Finally, how long has it been in any shelter for?");
          int userAnimalTimeInShelter = Integer.parseInt(myConsole.readLine());

          Animal userAnimal = new Animal(userAnimalSpecies, userAnimalAge, userAnimalColor, userAnimalFavoriteTreat, userAnimalTimeInShelter);
          allAnimals.add(userAnimal);

          System.out.println("Alright, here's your new animal:");
          System.out.println( "----------------------" );
          System.out.println( userAnimal.mSpecies );
          System.out.println( userAnimal.mAge );
          System.out.println( userAnimal.mColor );
          System.out.println( userAnimal.mFavoriteTreat );
          System.out.println( userAnimal.mTimeInShelter );
      } else {
        System.out.println("I'm sorry, we don't recognize your input");
      }
    }

  }
}
