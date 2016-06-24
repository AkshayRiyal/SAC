package ttnd;

interface LibraryInterface
{
   void issueBook();
   void returnBook();
    void report();
   
}
abstract class Book
{
	     int code; int price;
	     boolean status;
	     void setBook(int code,int price)
	     {
	    	 this.code=code;
	    	 this.price=price;
	    	 status=true;
	    	 System.out.println(code+" book registered successfully ");
	     }
	     String getBook()
	     {
	    	 return "Code:"+code+"\nPrice"+price;
	     }
	    
	   
	     
}
class Library extends Book implements LibraryInterface  {
		
	public void issueBook()
	   {
	       if(status)
		   {
		      System.out.println("book issued successfully");
			  status=false;
			  return;
		   }
		    System.out.println("book is already issued ");
	   }
	  public void returnBook()
	   {
	      if(!status)
		  {
		   System.out.println("book returned successfully");
		   status=true;
		   return;
		  }
	   }
	  public void report()
	   {  
	       System.out.println("\ncode: "+code+"\nprice: "+price);
		   
		   if(status)
		   { 
		      System.out.println("status:available");
		      return;
		   }
		     System.out.println("status:issued");
	   }
	
}

class E1
{
    public static void main(String s[])
	{ 
	   Library l1,l2;
	   
	   l1=new Library();
	   l2=new Library();
	   
	   l1.setBook(101,50);
	   l2.setBook(102,110);
	   
	   l1.getBook();
	   l2.getBook();
	   
	   l1.issueBook();
	   l2.issueBook();
	   
	   l1.returnBook();
	   
	   l1.report();
	   l2.report();
	   
	   
	   
	   
	   
	}
}

