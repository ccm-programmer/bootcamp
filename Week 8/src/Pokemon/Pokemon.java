package Pokemon;

public abstract class Pokemon {

  private int number;
  private String name;
  private String[] skills;
  private String pokemonType;

  public Pokemon(int number, String name, String pokemonType){
    this.name = name;
    this.number = number;
    this.pokemonType = pokemonType;
    this.skills = new String[4];
  }

  public void setSkills(String skill){
    this.skills[3] = skill;
  }

  @Override
  





  
}
