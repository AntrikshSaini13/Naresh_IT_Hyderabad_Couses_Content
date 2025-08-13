package Jan_6;

//BLC

public class Address {
//	  Instance varisble
	  private String cityName;
	  private String districtName;
	  private String stateName;
	  
//	  parameter constructer
	public Address(String cityName, String districtName, String stateName) {
		super();
		this.cityName = cityName;
		this.districtName = districtName;
		this.stateName = stateName;
	}
	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", districtName=" + districtName + ", stateName=" + stateName + "]";
	}
}

//Create a class Address (Business Logic Class)
//Instance Variables: 
//   private String cityName;
//   private String districtName;
//   private String stateName;
//Create a parameterized constructor initialize the instance variable of the class.

