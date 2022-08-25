public class Errors
{
	public static void main(String args[])
	{
		try
		{
			String s1=args[0];
			String s2=args[1];
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			int result=a/b;
			System.out.println("Division is:"+result);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Pass Two CMD argument line arguments:"+e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Both argument must be Integer:"+e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("2nd Argument must be non-zero:"+e);
		}
		catch(Exception e)
		{
			System.out.println("General :"+e);
		}
		System.out.println("Main Method End");
		System.out.println("Good bye");
	}
}