// # Inheritance 🍵

// ### Task 🐧
//  - Create a class called Parent:
//    - Make an instance variable called last_name
//    - Make an instace variable called eye color
//    - Create a constructor and set all the instace varaiables to the parameters passed in
//    - Make a public method called `getLastName()` that returns the last name

//  - Create a class called 'Child' that inherits (extends) Parent:
//    - Make an instance variable called first_name
//    - Make a constructor that first, sets first_name, and second, calls the constructor of Parent (Make sure to pass in the last name and eye color)
//    - Create a method that returns the first and last name in a String 
//    - Create a method that returns the eye color color of the parent

// ### Requirements 🏫
// ```
// 1. A .java file
// 2. Prints the first and last name of the child
// 3. Prints the eye color of the parent
// ```
package JavaTraining2024.Week3.Inheritance;

public class Child extends Parent{
    String first_name;
    String last_name;
    String eye_color;
    
    public Child(String first_name, String last_name, String eye_color){
        super(last_name, eye_color);
        this.last_name = last_name;
        this.first_name = first_name;
        this.eye_color = eye_color;
    }

    public String getFullName(){
        return first_name + last_name;
    }

    String getEyeColor(){
        return eye_color;
    }
}