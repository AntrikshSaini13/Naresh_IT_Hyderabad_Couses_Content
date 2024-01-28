// package Question_2(Different Class same file);

// Note :- In a single Java file we must have only one public class
//  and remaining classes must be declared non-public.



// two class same file
class Square { // class-1
   public static void square(int x){
        System.out.println("Square is : "+x*x);
   }
}

public class FindSquare {   // class-2
    public static void main(String[] args) {
        Square.square(5);
    }
}
