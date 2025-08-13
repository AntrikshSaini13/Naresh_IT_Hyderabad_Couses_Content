package Mar_18_2024_ClassCode;

public class Question_6
{  
	enum Day
		{ 
		  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
		}  
  
public static void main(String args[])
{    
	Day days[] = Day.values();  
	
//	for( Day day : days) {
		switch(days[0])
		{  
		 case SUNDAY:   
		 System.out.println("Sunday");  
		 break;  
		 case MONDAY:   
		 System.out.println("Monday");  
		 break;  
		 default:  
		 System.out.println("other day");  
	    }  
	}
  
//  }
}  
