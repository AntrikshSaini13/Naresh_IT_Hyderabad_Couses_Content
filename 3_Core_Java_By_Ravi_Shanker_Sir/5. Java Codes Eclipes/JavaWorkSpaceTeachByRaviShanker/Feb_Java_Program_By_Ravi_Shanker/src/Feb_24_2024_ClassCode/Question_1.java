package Feb_24_2024_ClassCode;

interface A 
{
  	
}

public class Question_1 
{
   public static void main(String[] args) 
   {
	  A a = null;
	  a.equals(null);
	  a.hashCode();
	  a.toString();
	  a.getClass();
  }
}

//Output :
//	
//	Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.equals(Object)" because "a" is null
//	at Feb_24_2024_ClassCode.Question_1.main(Question_1.java:13)