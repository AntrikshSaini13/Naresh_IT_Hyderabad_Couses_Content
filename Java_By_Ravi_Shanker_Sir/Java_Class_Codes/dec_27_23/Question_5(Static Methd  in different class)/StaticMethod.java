// package Question_5(Static Methd  in different class);

// If a static method available in the same class then we can directly call from another static method,
//  on the other hand static method available
//  in another class then we need to call the static method with the help of class name as shown in the program below.

public class StaticMethod {

    public static void main(String[] args) {
        Test.display();
    }
}

class Test{
    public static void display() {
        System.out.println("Hello world");
    }
}