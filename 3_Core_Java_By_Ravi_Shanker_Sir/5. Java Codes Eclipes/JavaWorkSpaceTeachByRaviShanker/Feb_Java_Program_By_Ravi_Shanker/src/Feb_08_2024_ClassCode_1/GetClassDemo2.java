package Feb_08_2024_ClassCode_1;

import Feb_08_2024_ClassCode.Demo2;

public class GetClassDemo2 
{
  public static void main(String[] args) 
  {
	    Demo2 d1 = new Demo2();
		String name = d1.getClass().getName();
		System.out.println(name);
  }
}