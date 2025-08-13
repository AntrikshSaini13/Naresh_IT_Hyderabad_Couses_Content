package Feb_08_2024_ClassCode;

//method Chaining

public class Question_1 {
	public static void main(String[] args) 
	{
		String str = "india";
	    int len =	str.concat(" is great").toUpperCase().length();
	    System.out.println(len);
	    
	    String str1 = "india";
	    char ch = str1.concat(" is great").toUpperCase().charAt(1);
	    System.out.println(ch);
	}
}
