package Feb_23_2024_ClassCode;

//By using Constructor (ClassName::new)

@FunctionalInterface
interface A 
{
    Test createObject();//here is return type Test Class
}

class Test 
{
    public Test() 
    {
        System.out.println("Test class Constructor invoked");
    }
}
public class Question_3
{
    public static void main(String[] args) 
    {
        //By using Lambda
        A a1 = ()-> new Test();
        
        a1.createObject(); 
        
        System.out.println("...................");        
        
        //By Using Method Reference
        A a2 = Test::new;   //calling Test class constructor 
        a2.createObject(); 
    }
}
