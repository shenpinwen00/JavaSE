package com.itheima.d13_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class api_time {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss EEE a");
//        System.out.println(sdf.format(time));

        String startTime = "2021-11-11 00:00:00";
        String endTime = "2021-11-11 00:10:00";
        String xiaopi = "2021-11-11 00:09:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf.parse(startTime);
        Date d2 = sdf.parse(endTime);
        Date d3 = sdf.parse(xiaopi);
        System.out.println(d1.getTime());

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

    }
}
