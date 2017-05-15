package com.invest.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static Date sysdate;

    DateUtils() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        sysdate = new Date();
        try {
            sysdate = dateFormat.parse(sysdate.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}