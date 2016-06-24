//WAP showing try, multi-catch and finally blocks.
package ttnd;

public class E5 {

	public static void main(String[] args) {
		int c,a=10,b=0;
		try
		{
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException Exception");
		}
		catch(RuntimeException e)
		{
			System.out.println("Runtime Exception");
		}
		finally
		{
			System.out.println("Finally Block");
		}
		
	}

}
