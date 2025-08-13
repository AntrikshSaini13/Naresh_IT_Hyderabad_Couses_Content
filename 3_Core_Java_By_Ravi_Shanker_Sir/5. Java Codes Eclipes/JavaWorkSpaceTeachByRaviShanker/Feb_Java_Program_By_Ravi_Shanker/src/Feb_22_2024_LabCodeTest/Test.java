package Feb_22_2024_LabCodeTest;

interface Employee {
int id=2;
String name="ajay";
void displayDetail(int id,String name);
}

class Iam implements Employee {

@Override
public void displayDetail(int id,String name) {
    Employee.id=id;
    Employee.name=name;
    System.out.println(id+" "+Employee.name);
}
}

public class Test {
public static void main(String[] args) {
Employee e=new Iam();
e.displayDetail(1,"raj");
}
}
