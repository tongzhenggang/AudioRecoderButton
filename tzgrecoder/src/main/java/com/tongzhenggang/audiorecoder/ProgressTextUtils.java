package com.tongzhenggang.audiorecoder;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

/** 
 * description: 时间工具格式化
 * author: tongzhenggang@126.com
 * date: 2018/2/1 
*/
public class ProgressTextUtils {

    public static String getProgressText(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(time));
        double minute = calendar.get(Calendar.MINUTE);
        double second = calendar.get(Calendar.SECOND);

        DecimalFormat format = new DecimalFormat("00");
        return format.format(minute) + ":" + format.format(second);
    }
}
