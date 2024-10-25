public class Me {
    String name;
    int age;

    Me(String name, int age){
        this.name = name;
        this.age = age;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }
    public static void main(String[] args) {
        Me dhyan = new Me("dhyan", 14);
        System.out.println("Name: " + dhyan.getName() + ", Age: " + dhyan.getAge());
    }
}
