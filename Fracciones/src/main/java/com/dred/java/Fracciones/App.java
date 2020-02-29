package com.dred.java.Fracciones;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Fraccion f1=new Fraccion(4,8);
    	Fraccion f2 = new Fraccion(3,4);
    	Fraccion f3 = new Fraccion();
    	
    	f3=f1.suma(f2);
    	System.out.println("la fracción 1 es:  "+f1.getNum()+" / "+ f1.getDen());
    	System.out.println("la fracción 2 es:  "+f2.getNum()+" / "+ f2.getDen());
    	System.out.println("la suma es:  "+f3.getNum()+" / "+ f3.getDen());
    }
}
