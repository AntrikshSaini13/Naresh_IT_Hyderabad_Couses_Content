

class A{
   static void m1(){
	   System.out.println("A class static method");  
   }
   void m2(){
       System.out.println("A class non static method");         
     }                                               
                                                          
 }                                                              
                                                          
class B extends A{                                        
    static void m1(){
       System.out.println("B class static method");                               
     }                                                                            
   void m2(){
       System.out.println("B class non static method");
     }
 }

 class Test{
     public static void main(String [] args)
      {
            A a =new A();
            a.m1();//  -------------- from A 
            a.m2();//  -------------- from A

            B b=new B();
            b.m1();// ---------------from B
            b.m2();// ---------------from B
      
           A a1=new B();
           a1.m1();// --------------from A ( compile time polymorphism)
           a1.m2();// --------------from B ( runtime polymorphism )
        }
 }
