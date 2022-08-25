import java.io.*;
class UnChecked_Exception
{
	public static void main(String arg[])
	{
		
		DataInputStream ob=new DataInputStream(System.in);
		System.out.println("Enter Your name?");
		String s=null;
		try
		{
		s=ob.readLine();
		}
		catch(IOException e){
			System.out.println(e);
		}
		System.out.println("NAme is:"+s);
		
		}
}