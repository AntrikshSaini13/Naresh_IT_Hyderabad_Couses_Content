// package Question_3(Differnt Class same file but both class contain 'Public');

// BLC

public class Sum {
    public static void sum(int a, int b) {
        System.out.println("Sum : "+(a+b));
    }
    
}

// ELC

public class Main {
    public static void main(String[] args) {
        Sum.sum(15, 16);
    }
}


// output : Main.java:6: error: class Sum is public, should be declared in a file named Sum.java
// public class Sum {
//        ^
// 1 error