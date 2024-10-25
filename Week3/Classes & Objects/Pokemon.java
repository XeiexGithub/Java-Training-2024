public class Pokemon {
    String name;
    int level;

    Pokemon(){
        level = 1; // default value
    }

    Pokemon(String pName, int pLevel){
        name = pName;
        level = pLevel;
    }

    void attack(){
        System.out.println(name + " attack!");
    }
    public static void main(String[] args) {
    
        Pokemon p1 = new Pokemon("andrew", "0");

        System.out.println(p1.level);
    }
}
