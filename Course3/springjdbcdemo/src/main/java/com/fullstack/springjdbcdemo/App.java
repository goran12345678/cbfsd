package com.fullstack.springjdbcdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fullstack.springjdbcdemo.db.DB;
import com.fullstack.springjdbcdemo.model.Dish;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring JDBC!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        DB dbRef = context.getBean("db", DB.class);
        
        Dish dish = new Dish();
        dish.setName("mydish");
        dish.setPrice(50);
        
        dbRef.insertDish(dish);
    }
}
