// package Question_4(Static Method in Saime Class);

// If a static method available in the same class then we can call the static 
// method directly from another static method of the same class without object 
// as shown in the program.


public class StaticMethod {

    public static void display(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        display();
    }
}
