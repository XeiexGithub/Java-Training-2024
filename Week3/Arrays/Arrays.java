// # Arrays 🍵

// ### Task 🐧
// Create code that consists of an array with the following elements:
//  - An element containing the name of your department
//  - An element contianing the name of the oldest person in the world
//  - An element contianing the name of the Rapid React world champion alliance captains
//  - An element containing the name of the 2019 FRC game

//  - Then print each element, from last to first.

// ### Requirements 🏫
// ```
// 1. A .java file
// 2. Creates an array and prints the elements as specified
// ```
public class Arrays {
    public static void main(String[] args) {
        String[] robotics_array = {"software", "Tomiko", "Ferradermis", "Destination: Deep Space"};
        for (int i = 0; i < 4; i++) {
            System.out.println(robotics_array[i]);
        }
    }
}