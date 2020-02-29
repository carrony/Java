package com.dred.java.Fracciones;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner leerTeclado = new Scanner(System.in);
    	Fraccion f1 = new Fraccion();
    	int num, den;
    	
    	System.out.println("Introduce el numerador: ");
    	num=leerTeclado.nextInt();
    	System.out.println("Introduce el denominador: ");
    	den=leerTeclado.nextInt();
    	try {
			f1.setFraccion(num,den);
		} catch (DenominadorCeroException e) {
			System.out.println("Error: "+e.getMessage());
		}
    	System.out.println("la fracción 1 es:  "+f1.getNum()+" / "+ f1.getDen());

    }
}
