package JavaTraining2024.Week3.Project;

public class Charizard extends Pokemon{
    int health;
    String name;

    // overiding the attack class
    @Override
    public void attack(Pokemon opposite_pokemon){
        take_damage(5);
    }

    // setting up default values
    Charizard() {
        super(20, "Charizard");
    }

    // non default constructor so you can set up values
    Charizard(int health, String name) {
        super(health, name);
        this.health = health;
        this.name = name;
    }
}
