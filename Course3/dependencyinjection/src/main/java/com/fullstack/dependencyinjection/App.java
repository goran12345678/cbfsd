package com.fullstack.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fullstack.dependencyinjection.bean.Connection;
import com.fullstack.dependencyinjection.bean.Restaurant;
import com.fullstack.dependencyinjection.bean.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Welcomne to Spring IOC" );
        
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("context_2.xml"); //Sub interface of
		 * Application Context is the BeanFactory interface. The BeanFactory is the IOC
		 * container for our objects.
		 * System.out.println("Application Context IOC Container Created");
		 * 
		 * Connection c1 = (Connection) context.getBean("con1"); //casting Connection c2
		 * = context.getBean("con2", Connection.class); Connection c3 =
		 * context.getBean("con1", Connection.class);
		 * 
		 * System.out.println("c1 is " + c1); System.out.println("c2 is " + c2);
		 * System.out.println("c3 is " + c3)
		 */
        
        
        /************* DEPENDENCY INJECTION ***********************/
		/*
		 * System.out.println( "Welcomne to Depemdemcy Injection" ); ApplicationContext
		 * context = new ClassPathXmlApplicationContext("context.xml");
		 * 
		 * Restaurant restaurant = context.getBean("rRef", Restaurant.class);
		 * System.out.println(restaurant);
		 */
        
    	/********************* AutoWire ************************/
    	ApplicationContext context = new ClassPathXmlApplicationContext("autowirecontext.xml");
    	User uRef = context.getBean("user", User.class);
    	System.out.println(uRef);
    	
    	
    }
}
