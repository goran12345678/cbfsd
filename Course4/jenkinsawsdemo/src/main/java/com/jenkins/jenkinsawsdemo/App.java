package com.jenkins.jenkinsawsdemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to AWS Code Build with Jenkins" );
        
        CabFareUtil util = new CabFareUtil();
        System.out.println(util.calculateCabFare(500, 5));
        System.out.println(util.calculateCabFare(1000, 20));
    }
}
