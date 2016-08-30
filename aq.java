
import java.io.*;
import java.util.Scanner;


public class holidayworkingday {
    public static void main(String[] args){
        findholiorwork obj=new findholiorwork();

        boolean b=obj.checkday("Monday");
        System.out.println(b);
    }
}
class findholiorwork {
    final String[] workingdays = new String[]{"Monday", "Tuesday", "wednesday",
            "Thursday", "Friday"};
    final String[] holidays = new String[]{"Sunday", "Satursay"};


    public boolean checkday(String s) {
        for (int i = 0; i <= 6; i++) {
            if (s == workingdays[i])
                return true;
            else {
                return false;
            }
        }

        return false;
    }
}
