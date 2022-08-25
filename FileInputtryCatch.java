import java.io.*;

class FileInputtryCatch
{
	static void read()
	{
		try
		{
			FileInputStream f=new FileInputStream("Throws_Keyword\\abc.txt");
			int size=f.available();
			byte data[]=new byte[size];
			f.read(data,0,size);
			String str=new String(data,0,size);
			System.out.println(str);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String arg[])
	{
		read();
	System.out.println("Good bye");
	}
}