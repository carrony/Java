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
	 * @throws DenominadorCeroException 
	 */
	public Fraccion(int num, int den) throws DenominadorCeroException {
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
	 * @throws DenominadorCeroException 
	 */
	public void setNum(int num) throws DenominadorCeroException {
		this.setFraccion(num, this.den);
	}

	/**
	 * @return el denminador
	 */
	public int getDen() {
		return den;
	}

	/**
	 * @param den el denominador a establecer
	 * @throws DenominadorCeroException 
	 */
	public void setDen(int den) throws DenominadorCeroException {
		this.setFraccion(this.num, den);
	}   
	
	public void setFraccion(int num,int den) throws DenominadorCeroException {
		if (den==0) {
			throw new DenominadorCeroException();
		}
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
		Fraccion res=new Fraccion();
		int denComun = this.den*f2.den;

		try {
			res.setFraccion(denComun/this.den*this.num + denComun/f2.den*f2.num, denComun);
		} catch (DenominadorCeroException e) {
			// No puede haber error, porque siempre se controla que 
			// el denominador sea diferente de 0
			e.printStackTrace();
		}
		return res;
	}
	
}
