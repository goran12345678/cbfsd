package com.example.cms;

import com.example.cms.db.DB;
import com.example.cms.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Customer Management System" );
        
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("jerry");
        customer.setPhone("12345678");
        customer.setEmail("jerry@gmail.com");
        customer.setAge(30);
        customer.setTemperature(75.3f);
        customer.setBirthDate("1990-01-01");
        
        System.out.println("Connecting to DB...");
        DB db = new DB();
        db.createConnection();
        
        db.createCustomer(customer);
        
        db.closeConnection();
    }
}
