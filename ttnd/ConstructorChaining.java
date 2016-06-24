//WAP to make a demo class and define 3 contructer in it. no-args constructer and two parameterized contructor. Now use contructor chaining to call one constructor from another.

package ttnd;

public class ConstructorChaining {

	public static void main(String[] args) {
	new Student(101,80,"sumit");
	}

}
class Student
{   int rollno,marks; String name; 
	Student()
	{
		System.out.println("Default Constructor");
	}
	Student(int rollno,int marks)
	{        this();
	  this.rollno=rollno;
	  this.marks=marks;
	  
		System.out.println("Roll no and Marks stored");
	}
	Student(int rollno,int marks,String name)
	{        this(rollno,marks);
	   this.name=name;
		System.out.println("Name stored");
	}
}