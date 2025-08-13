package Feb_16_2024_LabCode;

public class MyCalculator implements AdvancedArithmetic {
	private int num;
	
	private int sum = 0;
	
	public MyCalculator(int num) {
		super();
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "MyCalculator \n[num=" + num + ", sum=" + divisorSum(num) + "]";
	}

	@Override
	public int divisorSum(int num ) {
		this.num = num;
		for(int i = 1; i<=this.num; i++) {
			if(num % i == 0) {
//				System.out.println(i);
				this.sum += i;
			}
		}
		return this.sum;
	}

}
