package JavaTraining2024.Week3.Project;

abstract class Pokemon {
    // Private variables as per ReadMe (encapuslation)
    private int health;
    private String name;

    // non-default constructor enabling user to input a health and name value
    Pokemon(int health, String name){
        this.health = health;
        this.name = name;
    }

    // method to calculate damage taken
    public void take_damage(int damage){
        health = health - damage;
    }

    // method to find out if the pokemon is fainted or not
    public boolean getIsFainted(){
        if (health <= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    // abstract method to be used when this class is used in another class and supposed to be overridden
    public abstract void attack(Pokemon opposite_pokemon);

    // simple method to get the name of the pokemon
    public String getName(){
        return name;
    }
    
}
