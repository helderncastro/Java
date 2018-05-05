package org.posJava.aula2;

public class Retangulo {
	private double length; 
	private double width;
	
	public Retangulo() {
		this.length = 1.0;
		this.width  = 1.0;
		
	}
	
	public Retangulo(double length, double width) {
		super();
		this.length = length ;
		this.width  = width  ;
	}
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if ((length>0) || (length<20) ){
			this.length = length;	
		} else
		{
			System.out.println("Valor lenght incorreto");
		}
		
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if ((width>0) || (width<20) ){
			this.width = width;
		} else
		{
			System.out.println("Valor width incorreto");
		}
	}
	
	public double calcularPerimetro() {
		return ((width * 2)+(length * 2));
	}
	
	public double calcularArea() {
		return width * length ;
	}
}
