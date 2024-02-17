package com.hanifsapp.hisabee.utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetDate {
    public static String date = "";
    public static Calendar calendar = Calendar.getInstance();
    public static String getDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yy hh:mm:ss");
        return dateFormat.format(calendar.getTime());
    }


    public static String getDate(int modify){
        calendar.add(Calendar.DAY_OF_MONTH, modify);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yy");
        date = dateFormat.format(calendar.getTime());
        return date;
    }
}
