package Mar_21_2024_ClassCode;

//DataOutputStream and DataInputStream
import java.io.*;
public class Question_1
{
    public static void main(String args[]) throws IOException
    {
		  var fout = new FileOutputStream("E:\\13-FileHandlingConcept\\one.txt");
          var dout = new DataOutputStream(fout);

		  try(fout ; dout)
		  {
        		dout.writeBoolean(true);
        		dout.writeChar('A');
        		dout.writeByte(Byte.MAX_VALUE);
        		dout.writeShort(Short.MAX_VALUE);
        		dout.writeInt(Integer.MAX_VALUE); 
        		dout.writeLong(Long.MAX_VALUE);
        		dout.writeFloat(Float.MAX_VALUE); 
        		dout.writeDouble(Math.PI);//PI is a final static variable
        		dout.writeBytes("Hello India...");
        		dout.flush();//For reuse purpose
        	  }
		  catch(IOException e)
		  {
			  e.printStackTrace();
		  }

		  System.out.println("Reading the Primitive data from the file!!!");
        
		  var fin = new FileInputStream("E:\\\\13-FileHandlingConcept\\\\one.txt");
          var din = new DataInputStream(fin);
		  try(fin ; din)
		  {
        		boolean f = din.readBoolean();
        		char c = din.readChar();
        		byte b = din.readByte();
        		short s = din.readShort();
        		int i = din.readInt();
        		long l = din.readLong();
        		float ft = din.readFloat();
        		double d = din.readDouble();
        		String str=  din.readLine();//for reading String (deprecated)

        		System.out.println(f +"\n"+c+"\n"+b+"\n"+s+"\n"+i+"\n"+l+"\n"+ft+"\n"+d+"\n"+str);
		  }
		  catch(IOException e)
		  {
			  e.printStackTrace();
		  }

    }
}