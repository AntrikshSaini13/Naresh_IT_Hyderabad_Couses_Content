import java.util.*;
// package Java_Class_Codes.jan_02_24;

public class PlayerData {

    int playerId;
    String playerName;
    double basePrice;
    
    public void setPlayerData()
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Player id :");
       int playerId = sc.nextInt();
       System.out.print("Enter Player name :");
       String playerName = sc.nextLine();
       playerName = sc.nextLine();
       System.out.print("Enter Player price :");
       double basePrice = sc.nextDouble();
       sc.close();
      
    }
    
    public void getPlayerData()
    {
    	System.out.println("Player id is :"+playerId);
    	System.out.println("Player name is :"+playerName);
    	System.out.println("Player Base price is :"+basePrice);
    }
        
	public static void main(String[] args) 
	{
	   PlayerData p1 = new PlayerData();
	   p1.setPlayerData();
	   p1.getPlayerData();

	}
}