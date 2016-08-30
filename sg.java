import java.util.Calendar;
 class Minutesdif
{
    public static void main(String[] args)
    {
 
        //Calendar1
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2011, 07, 4, 5, 0, 0);
 
        //Calendar2
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2011, 07, 4, 6, 1, 1);
 
        
        long milliSec1 = cal1.getTimeInMillis();
        long milliSec2 = cal2.getTimeInMillis();
 
        long timeDifInMilliSec;
        if(milliSec1 >= milliSec2)
        {
            timeDifInMilliSec = milliSec1 - milliSec2;
        }
        else
        {
            timeDifInMilliSec = milliSec2 - milliSec1;
        }
 
        long timeDifSeconds = timeDifInMilliSec / 1000;
        long timeDifMinutes = timeDifInMilliSec / (60 * 1000);
        long timeDifHours = timeDifInMilliSec / (60 * 60 * 1000);
        
 
        System.out.println("Time differences");
       
        System.out.println(timeDifSeconds + " Seconds");
        System.out.println(timeDifMinutes + " Minutes");
        System.out.println(timeDifHours + " Hours");
       
    }
}
