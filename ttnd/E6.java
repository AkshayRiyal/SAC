//WAP to convert seconds into days, hours, minutes and seconds.
package ttnd;
public class E6 {
     static int min=60,hour=24,sec=60;
	public static void main(String[] args) {
	    int sec=12090905;
	    System.out.print(convert(sec));
	}
    static String convert(int s)
    {
    	
    	int seconds = s %sec;
        int tmin = s/sec;
        int minutes = tmin % min;
        int thours = tmin / min;
        int hours=thours%hour;
        int day=hours% hour;
        return day + "days " +hours+"hr "+minutes+"min "+seconds+ "sec";
    	
    }
}
