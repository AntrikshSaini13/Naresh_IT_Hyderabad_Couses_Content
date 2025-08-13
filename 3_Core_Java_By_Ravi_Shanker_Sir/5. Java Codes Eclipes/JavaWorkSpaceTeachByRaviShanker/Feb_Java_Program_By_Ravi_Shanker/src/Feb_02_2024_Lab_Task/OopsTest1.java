package Feb_02_2024_Lab_Task;

class NIT
{
	static int a=90;
	String object;
	public NIT(String name) {
		this.object=name;
		NIT.this.a+=1;
	}
	static int get_counter()
	{
		return NIT.a;
	}
}

public class OopsTest1
{
	public static void main(String[] args) {
		NIT nit = new NIT("nit");
		NIT nit1 = new NIT("nit");
		NIT nit2 = new NIT("nit");
		NIT nit3 = new NIT("nit");
		NIT nit4 = new NIT("nit");
		NIT nit5 = new NIT("nit");
		NIT nit6 = new NIT("nit");
		NIT nit7 = new NIT("nit");
		System.out.println(NIT.get_counter()-91);
	}
}