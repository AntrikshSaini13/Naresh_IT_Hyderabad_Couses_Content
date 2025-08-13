package Mar_22_2024_ClassCode;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

//BLC
public class Product implements Serializable
{
	private transient int productId;
	private transient String productName;
	private double productPrice;
	private LocalDate manufactureDate;

	public Product(int productId, String productName, double productPrice, LocalDate manufactureDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.manufactureDate = manufactureDate;
	}
	
	public static Product getProductObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Product Id :");
		int id = sc.nextInt();
		System.out.print("Enter Product Name :");
		String name = sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter Product Price :");
		double price = sc.nextDouble();
		LocalDate d = LocalDate.now();
		return new Product(id, name, price, d);
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", manufactureDate=" + manufactureDate + "]";
	}
	
	

}
