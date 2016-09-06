public class App {
  public static void main(String[] args) {
    Animal skunk = new Animal();
    skunk.mSpecies = "Skunk";
    skunk.mAge = 2;
    skunk.mColor = "Black and white";
    skunk.mFavoriteTreat = "Strawberries";
    skunk.mTimeInShelter = 2;

    Animal giraffe = new Animal();
    giraffe.mSpecies = "Giraffe";
    giraffe.mAge = 13;
    giraffe.mColor = "Brown and white";
    giraffe.mFavoriteTreat = "Leaves";
    giraffe.mTimeInShelter = 3;

    Animal cat = new Animal();
    cat.mSpecies = "Cat";
    cat.mAge = 5;
    cat.mColor = "Calico";
    cat.mFavoriteTreat = "Human hearts";
    cat.mTimeInShelter = 100;

    Animal dog = new Animal();
    dog.mSpecies = "Dog";
    dog.mAge = 3;
    dog.mColor = "Black";
    dog.mFavoriteTreat = "Cats";
    dog.mTimeInShelter = 6;

    Animal[] allAnimals = { skunk, giraffe, cat, dog };

    System.out.println("All Animals:");

    for ( Animal individualAnimal : allAnimals ) {
      System.out.println("-------------");
      System.out.println( "I am a " + individualAnimal.mSpecies );
      System.out.println( "I am " + individualAnimal.mAge + " years old" );
      System.out.println( "I'm colored " + individualAnimal.mColor );
      System.out.println( "My favorite treat is " + individualAnimal.mFavoriteTreat );
      System.out.println( "I've been in the shelter for " + individualAnimal.mTimeInShelter + " months" );

    }

  }
}
