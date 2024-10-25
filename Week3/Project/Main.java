package JavaTraining2024.Week3.Project;

public class Main {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu(40, "Pikachu");
        Charizard charizard = new Charizard(30, "AwesomeCharizard");

        while (!pikachu.getIsFainted() && !charizard.getIsFainted()){
            pikachu.attack(charizard);
            charizard.attack(pikachu);
        }
        if (pikachu.getIsFainted()){
            System.out.println(pikachu.getName() + " fainted :(");
        }
        if (charizard.getIsFainted()){
            System.out.println(charizard.getName() + " fainted :(");
        }
    }
}
