//3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
package ttnd;

public class E3 {

	public static void main(String[] args) {
		try{
			Class.forName("abc");
			
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("ClassNotFoundException obtained");
		}
		//NoClassDefFound error arises when a class is available at compile time but unable to load at runtime
		/*try{
			E3S t=new E3S();
		}
		catch(NoClassDefFoundError e)
		{
			System.out.println("NoClassDefFoundError obtained");
		}
		*/
            
            
	}

}
