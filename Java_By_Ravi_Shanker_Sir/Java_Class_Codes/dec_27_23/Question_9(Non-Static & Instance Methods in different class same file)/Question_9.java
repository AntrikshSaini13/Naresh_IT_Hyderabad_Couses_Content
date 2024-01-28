// package Question_9(Non-Static & Instance Methods in Same class);

// here is instance method we are calling with the help of object becozof without object we can't access the instance class

class Calculate{
    public void sum(int a, int b){
        System.out.println("Sum : "+(a+b));
    }
}

public class Question_9 {
    public static void main(String[] args) {
        Calculate c1 = new Calculate();

        c1.sum(12, 13);
    }
}
