import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInformation 
{
	public static void main(String[] args) throws Exception
	{
		
		Class cls = Class.forName(args[0]);
		System.out.println("Class Name is :"+cls.getName());
		System.out.println("Package Name is :"+cls.getPackageName());

		Method[] methods = cls.getDeclaredMethods();
		
		int count = 0;
		
		for(Method method : methods)
		{
			count++;
			System.out.println(method.getName());
		}
		System.out.println("Total number of methods :"+count);
		count = 0;
		
		Field[] fields = cls.getDeclaredFields();
		
		for(Field field : fields)
		{
			count++;
			System.out.println(field.getName());
		}
		System.out.println("Total number of fields :"+count);
	}

}