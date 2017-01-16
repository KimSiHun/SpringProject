package org.kims.spring.SpringProject;

import org.joda.time.LocalTime;
import org.kims.spring.beans.User;

/**
 * Hello world!
 *
 */
public class App
{

	public static void main(String[] args)
	{
		LocalTime currentTime = new LocalTime();
		System.out.println("The Current local time is: "+ currentTime);
		
		
		User u = new User("sihunkim", "paradaise119@naver.com", "010", "3329", "1639");
		
	}
	
}
