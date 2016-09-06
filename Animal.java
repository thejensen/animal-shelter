class Animal {

  public String mSpecies;
  public int mAge;
  public String mColor;
  public String mFavoriteTreat;
  public int mTimeInShelter;

  public Animal(String species, int age, String color, String favoriteTreat, int timeInShelter) {
    mSpecies = species;
    mAge = age;
    mColor = color;
    mFavoriteTreat = favoriteTreat;
    mTimeInShelter = timeInShelter;
  }

  public boolean youngPet(int maxAge) {
    return (maxAge > mAge);
  }

}
