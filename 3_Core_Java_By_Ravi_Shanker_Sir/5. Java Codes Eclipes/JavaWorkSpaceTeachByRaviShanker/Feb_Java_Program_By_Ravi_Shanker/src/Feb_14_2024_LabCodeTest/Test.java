package Feb_14_2024_LabCodeTest;


abstract class Food {
{
System.out.println("Food");
}
}

abstract class Launch extends Food {
{
System.out.println("Launch");
}
}

class Biriyani extends Launch {
{
System.out.println("Biriyani");
}
}

public class Test {
public static void main(String[] args) {
Biriyani b = new Biriyani();
System.out.println(b);
}
}