package org.kims.spring.SpringProject;

import org.joda.time.LocalTime;
import org.kims.spring.service.UserService;

/**
 * Hello world!
 *
 */
public class App
{

	public static void main(String[] args)
	{
		UserService user = new UserService();
		
		final long current = System.currentTimeMillis();
		
		
		LocalTime currentTime = new LocalTime();
		System.out.println("The Current local time is: " + currentTime);
		System.out.println("the current: " + current+"\n\n");
		
		user.getUserInfo();
	}

}
