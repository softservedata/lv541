package com.softserve.HomeWork1_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Call {
	public float c,t,count;
	public String name;
	public Call(String n) {
		name = n;	
	}

	public void get_count() throws ParseException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the units per minute for the "+name+" call = ");
		c = Float.parseFloat(br.readLine());
		
		SimpleDateFormat data_type= new SimpleDateFormat("HH:mm:ss");
		
		System.out.print("The "+name+" talk lasted from  ");
		Date t1F = data_type.parse(br.readLine());
		System.out.print(" to ");
		
		Date t1T = data_type.parse(br.readLine());
		t = (float)TimeUnit.MILLISECONDS.toSeconds(t1T.getTime()-t1F.getTime())/60; 
		count = c*t;
	}
	public static void main(String[] args) throws ParseException, IOException {
		Call call1 = new Call("first");
		Call call2 = new Call("second");
		Call call3 = new Call("third");	
		
		
		call1.get_count();
		call2.get_count();
		call3.get_count();
		
		
		System.out.println("calculations for the "+call1.name+" call = "+call1.count);
		System.out.println("calculations for the "+call2.name+" call = "+call2.count);
		System.out.println("calculations for the "+call3.name+" call = "+call3.count);
		System.out.println("together = "+(call1.count+call2.count+call3.count));
		

	}

}

