package com.apk;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Data {

	public static void main(String[] args) throws ParseException {
		// 创建表示当前时间的Date对象
	Date date1=new Date(System.currentTimeMillis());
	//获取当前时间后一秒的时间
	Date date2=new Date(System.currentTimeMillis()+1000);
	Date date3=new Date();
	System.out.println(date1);
	System.out.println(date2);
	System.out.println(date3);
	
	SimpleDateFormat sf=new SimpleDateFormat("Gyyy年MM月dd日  HH:mm:ss E");
	System.out.println(sf.format(date1));
	 
	Calendar rili=Calendar.getInstance();
	int year=rili.get(Calendar.YEAR);
	int Month=rili.get(Calendar.MONTH)+1;
	int Date=rili.get(Calendar.DATE);
	System.out.println("今天是"+year+"年"+Month+"月"+Date+"日");
	
	 rili.add(Calendar.DATE,100);
	 year=rili.get(Calendar.YEAR);
	 Month=rili.get(Calendar.MONTH)+1;
	 Date=rili.get(Calendar.DATE);
	System.out.println("100天以后是"+year+"年"+Month+"月"+Date+"日");
	
	SimpleDateFormat sf1=new SimpleDateFormat("yyyy-MM-dd");
	LocalDate ldt=LocalDate.now();
	//用sdf1对象来解析当前日期加大100天
	//SimpleDateFormat:parse方法将字符串解析为Date类的对象
	//SimpleDateFormat:format方法将Date累的对象格式化为字符串
	Date date4=sf1.parse(""+ldt.plusDays(100));
	SimpleDateFormat sf2=new SimpleDateFormat("yyyy年M月d日");
	System.out.println("100天以后是"+sf2.format(date4));
	
	SimpleDateFormat sf3=new SimpleDateFormat("yyyy-MM");
	Date date5=sf3.parse(""+YearMonth.now());
	SimpleDateFormat sf4=new SimpleDateFormat("yyyy年MM月");
	System.out.println("当前年月是"+sf4.format(date5));
	
	//输出系统时区
	ZoneId zoneId=ZoneId.systemDefault();
	System.out.println("当前系统时区是"+zoneId);
	
	//Instant:此刻
	Instant instant=Instant.now();
	System.out.println(""+instant);
	}
}
