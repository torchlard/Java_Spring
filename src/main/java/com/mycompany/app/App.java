package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length > 0){
            System.out.println(args[0]);
        } else {
            System.out.println( "Hello World!" );
        }
    }
}
