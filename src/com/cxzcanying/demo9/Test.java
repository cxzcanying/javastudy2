package com.cxzcanying.demo9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

    public static long parseDate(String dateStr) {
        try {
            Date date = sdf.parse(dateStr);
            return date.getTime();
        } catch (ParseException e) {
            System.err.println("日期解析失败: " + dateStr);
            e.printStackTrace();
            return -1;
        }
    }

    public static void main(String[] args) {
        String start = "2024年11月11日 0:0:0";
        String end = "2024年11月11日 0:10:0";
        String xj = "2024年11月11日 0:07:20";
        String xp = "2024年11月11日 1:00:00";

        long startTime = parseDate(start);
        long endTime = parseDate(end);
        long xjTime = parseDate(xj);
        long xpTime = parseDate(xp);

        if (startTime == -1 || endTime == -1 || xjTime == -1 || xpTime == -1) {
            System.out.println("时间解析错误，程序退出");
            return;
        }

        if (xjTime >= startTime && xjTime <= endTime) {
            System.out.println("小佳秒杀成功");
        } else {
            System.out.println("小佳秒杀失败");
        }

        if (xpTime >= startTime && xpTime <= endTime) {
            System.out.println("小平秒杀成功");
        } else {
            System.out.println("小平秒杀失败");
        }
    }
}