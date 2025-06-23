package Feb_19_2024_Class_Code;

abstract class Demo
{
	public abstract void show();
	public abstract void run();
}

public class Question_2 
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo()
		{
			@Override
			public void show() 
			{
				System.out.println("Show method implemented");				
			}

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}			
		};
		d1.show();
		
		Demo d2 = new Demo() {
			@Override
			public void run()	{
				System.out.println("Run method implemented");
			}

			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}
		};
		d2.run();
	}

}
