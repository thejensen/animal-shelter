class Animal {
  public String mSpecies;
  public int mAge;
  public String mColor;
  public String mFavoriteTreat;
  public int mTimeInShelter;

  public boolean youngPet(int maxAge) {
    return ( mAge < maxAge );
  }  
}
