import java.io.*;
class Checked_UnCheckTest
{
	public static void main(String arg[])
	{
		DataInputStream key=new DataInputStream(System.in);
	System.out.println("Enter Your Name");
	try
	{
		String s1=key.readLine();//Checked_Exception
		int a=Integer.parseInt(s1);//UnChecked_Exception
		System.out.println("Enter Second Name");
		String s2=key.readLine();//Checked_Exception
		int b=Integer.parseInt(s2);//UnChecked_Exception
		int c=a/b;
		System.out.println("Division is:"+c);
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	System.out.println("Good Bye");
	}
}