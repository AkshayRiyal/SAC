//2. WAP to sorting string without using string Methods?.
package ttnd;

public class StringSort {

	public static void main(String[] args) {
		String str="hfhyds";
		int i,j; char temp;
		char ch[]=str.toCharArray();
		
		for(i=0;i<ch.length-1;i++)
		{
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[j]<ch[i])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		for(i=0;i<ch.length-1;i++)
		System.out.println(""+ch[i]);
			
		
	}

}
