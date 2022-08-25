class Nexted_Try_Catch
{
	public static void main(String arg[])
	{
		try
		{
			String s1=arg[0];
			String s2=arg[1];
			try
			{
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
				try
				{
					int result=a/b;
					System.out.println("Division:"+result);
				}catch(ArithmeticException e)
				{
					System.out.println("2nd Argument must be Non-Zero"+e);
				}
				System.out.println("After ArithmeticException..");
				
			}catch(NumberFormatException e)
			{
				System.out.println("Both Must be Integer Type:"+e);
			}
			System.out.println("Aftre NumberFormatException:");
		}catch(ArrayIndexOutOfBoundsException e)
		{
				System.out.println("Pass Two CMD line Argument:"+e);
		}
		System.out.println("Aftre ArrayIndexOutOfBoundsException");
		System.out.println("Good Bye");
	}
}