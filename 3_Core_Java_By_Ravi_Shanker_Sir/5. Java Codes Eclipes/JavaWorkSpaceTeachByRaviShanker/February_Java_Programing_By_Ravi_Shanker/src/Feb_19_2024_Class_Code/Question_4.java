package Feb_19_2024_Class_Code;


@FunctionalInterface
interface Exam
{
	void writeExam();  //SAM	
}

public class Question_4 
{
	public static void main(String[] args) 
	{
		Exam java = new Exam()
		{
			@Override
			public void writeExam() 
			{
				System.out.println("Java students are writing exam");			
			}
			
		};
		
		Exam python = new Exam()
		{
			@Override
			public void writeExam() 
			{
				System.out.println("Python students are writing exam");			
			}
			
		};
		
		java.writeExam();   
		python.writeExam();
	}

}
