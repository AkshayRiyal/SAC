package ttnd;

class E4 implements Cloneable{  
int rollno;  
String name;  
  E4(int rollno,String name){  
this.rollno=rollno;  
this.name=name;  
}  
  
public Object clone()throws CloneNotSupportedException{  
	return super.clone();  
}   
  
public static void main(String args[]){  
try{  
E4 e1=new E4(101,"amit");  
  
E4 e2=(E4)e1.clone();  
  
System.out.println(e1.rollno+" "+e1.name);  
System.out.println(e2.rollno+" "+e2.name);  
  
}catch(CloneNotSupportedException c){}  
  
}  
}  
