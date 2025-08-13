package Jan_25_2024_Class_Code;

//Aggregations

class MotherBoard{
	private int ram;
	private String storageDevice;
	private int powerConnection;
	private int COMSBattery;
	public MotherBoard(int ram, String storageDevice, int powerConnection, int COMSBattery) {
		super();
		this.ram = ram;
		this.storageDevice = storageDevice;
		this.powerConnection = powerConnection;
		this.COMSBattery = COMSBattery;
	}
	@Override
	public String toString() {
		return "MotherBoard [ram=" + ram + ", storageDevice=" + storageDevice + ", powerConnection=" + powerConnection
				+ ", COMSBattery=" + COMSBattery + "]";
	}
	
}

class Laptop{
	private String brandLaptop;
	private int genLaptop;
	private MotherBoard motherboard;
	public Laptop(String brandLaptop, int genLaptop, MotherBoard motherboard) {
		super();
		this.brandLaptop = brandLaptop;
		this.genLaptop = genLaptop;
//		this.motherboard = motherboard;
	}
	@Override
	public String toString() {
		return "Laptop [brandLaptop=" + brandLaptop + ", genLaptop=" + genLaptop + ", motherboard=" + motherboard + "]";
	}
	public String getBrandLaptop() {
		return brandLaptop;
	}
	public int getGenLaptop() {
		return genLaptop;
	}
	public void setBrandLaptop(String brandLaptop) {
		this.brandLaptop = brandLaptop;
	}
	public void setGenLaptop(int genLaptop) {
		this.genLaptop = genLaptop;
	}
	
	
}
public class Question_2 {
	public static void main(String[] args) {
		MotherBoard m1 = new MotherBoard(16, "1T", 235, 4);
		
		Laptop l1 = new Laptop("Dell", 5,m1);
		System.out.println(l1);
		
		Laptop l2 = new Laptop("hp", 5,m1);
		System.out.println(l2);
		
		Laptop l3 = new Laptop("Asus", 5,m1);
		System.out.println(l2);
	}
}

//Assignment :
//------------
//Person and Heart
//Laptop and Motherboard