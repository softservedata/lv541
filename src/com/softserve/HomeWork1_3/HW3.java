package com.softserve.HomeWork1_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class HW3 {

	public static void main(String[] args) throws ParseException, IOException {
		float c1,c2,c3,t1,t2,t3;	
		SimpleDateFormat data_type= new SimpleDateFormat("HH:mm:ss");	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the units per minute:");
		System.out.print("c1 = ");
		c1 = Float.parseFloat(br.readLine());
		System.out.print("c2 = ");
		c2 = Float.parseFloat(br.readLine());
		System.out.print("c3 = ");
		c3 = Float.parseFloat(br.readLine());
		
		System.out.print("The first talks start from  ");
		Date t1F = data_type.parse(br.readLine());
		System.out.print(" to ");
		Date t1T = data_type.parse(br.readLine());
		t1 = (float)TimeUnit.MILLISECONDS.toSeconds(t1T.getTime()-t1F.getTime())/60;
		
		System.out.print("The second talks start from  ");
		Date t2F = data_type.parse(br.readLine());
		System.out.print(" to ");
		Date t2T = data_type.parse(br.readLine());
		t2 = (float)TimeUnit.MILLISECONDS.toSeconds(t2T.getTime()-t2F.getTime())/60;
		
		System.out.print("The third talks start from  ");
		Date t3F = data_type.parse(br.readLine());
		System.out.print(" to ");
		Date t3T = data_type.parse(br.readLine());
		t3 = (float)TimeUnit.MILLISECONDS.toSeconds(t3T.getTime()-t3F.getTime())/60;
		
		
		float count1 = c1*t1;
		float count2 = c2*t2;
		float count3 = c3*t3;
		System.out.println("calculations for the first call = "+count1);
		System.out.println("calculations for the second call = "+count2);
		System.out.println("calculations for the third call = "+count3);
		System.out.println("together = "+(count1+count2+count3));
		
			
		

	}

}
