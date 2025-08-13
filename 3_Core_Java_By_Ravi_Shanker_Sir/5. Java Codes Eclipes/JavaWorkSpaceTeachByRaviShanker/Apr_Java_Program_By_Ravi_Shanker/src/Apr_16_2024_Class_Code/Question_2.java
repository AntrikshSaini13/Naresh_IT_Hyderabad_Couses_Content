package Apr_16_2024_Class_Code;

//static nested inner class
class BigOuter
{
     static class Nest   //static nested inner class   
     {
          void go()  //Instance method of static inner class
          {
               System.out.println("Hello welcome to static nested class");  
          }  
     }
}
public class Question_2
{    
      public static void main(String args[])
      {
          BigOuter.Nest n = new BigOuter.Nest();
          n.go();
			
			
      } 
}
