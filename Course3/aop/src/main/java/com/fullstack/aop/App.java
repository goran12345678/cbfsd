package com.fullstack.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fullstack.aop.bean.Order;
import com.fullstack.aop.bean.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello tp AOP demo" );
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Product product = context.getBean("pRef", Product.class);
        System.out.println(product);
        System.out.println();
        
        //product.purchaseProduct("Home", "6 PM Evening", "john@gmail.com");
        //product.purchaseNow();
        
        Order order = context.getBean("order", Order.class);
        order.submitOrder();
    }
}
