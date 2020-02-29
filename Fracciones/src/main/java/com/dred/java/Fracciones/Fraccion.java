package com.dred.java.Fracciones;

public class Fraccion {
	private int num; /** Almacenará el numerador */
    private int den; /** Almacenará el denominador */

    public Fraccion() {
        this.num=0;
        this.den=1;
    }
    
    

	/**
	 * @param num
	 * @param den
	 */
	public Fraccion(int num, int den) {
		this.setFraccion(num, den);
	}



	/**
	 * @return el numerador
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num es el numerador a establecer
	 */
	public void setNum(int num) {
		if (num != 0) {
			this.num = num;
		} else {
			System.out.println("eror, división por cero");
		}
	}

	/**
	 * @return el denminador
	 */
	public int getDen() {
		return den;
	}

	/**
	 * @param den el denominador a establecer
	 */
	public void setDen(int den) {
		this.den = den;
	}   
	
	public void setFraccion(int num,int den) {
		int mcd = Fraccion.mcd(num, den);
		this.num = num/mcd;
		this.den = den/mcd;
	}
    
	public static int mcd ( int num1, int num2) {
		int dividendo, divisor, resto;
		if (num1>num2) {
			dividendo=num1;
			divisor=num2;
		} else {
			dividendo=num2;
			divisor=num1;
		}
		do
        {            
            resto = dividendo % divisor;
            dividendo = divisor;
            if (resto != 0)
            	divisor = resto;            
        } while (resto != 0);
		return divisor;
	}
	
	public Fraccion suma(Fraccion f2) {
		Fraccion res ;
		int denComun = this.den*f2.den;
		
		res =  new Fraccion(denComun/this.den*this.num + denComun/f2.den*f2.num, denComun);
		return res;
	}
	
}
