package Apr_16_2024_Class_Code;

class MyOuter3
{
      private String x = "Outer class Data";

      public void doSttuff()
      { 
           String z = "local variable";  
           class MyInner        
           {
        	     String z = "CLASS variable"; 
                 public void seeOuter()
                 {
                      System.out.println("Outer x is "+x);
                      System.out.println("Local variable z is : "+z);
                 }
           }
           MyInner mi = new MyInner();
     	   mi.seeOuter();  
	  }
//	  MyInner mi = new MyInner();
//	  mi.seeOuter();     
}
public class Question_1
{
      public static void main(String args[])
      {
            MyOuter3 m = new MyOuter3();
            m.doSttuff();  
      } 
}

