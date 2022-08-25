class Checked_Exception
{
	public static void main(String arg[])
	{
		try
		{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(""+c);
		}catch(ArithmeticException e)
		{
			System.out.println("Zero cannot divided by any number");
		}
	}
}