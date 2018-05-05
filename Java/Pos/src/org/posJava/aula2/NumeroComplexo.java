package org.posJava.aula2;

public class NumeroComplexo {
	
	private double pReal, pImag;
	
	public double getpReal() {
		return pReal;
	}

	public void setpReal(double pReal) {
		this.pReal = pReal;
	}

	public double getpImag() {
		return pImag;
	}

	public void setpImag(double pImag) {
		this.pImag = pImag;
	}

	public NumeroComplexo(double d, double e) {
		// TODO Auto-generated constructor stub
		setpReal(d);
		setpImag(e);
	}

	public NumeroComplexo soma(NumeroComplexo n2) {
		// TODO Auto-generated method stub
		
		NumeroComplexo retorno = new NumeroComplexo(0,0);
		
		retorno.setpReal(this.getpReal() + n2.getpReal());
		retorno.setpImag(this.getpImag() + n2.getpImag());
		
		return retorno;
	}

	public NumeroComplexo subtrair(NumeroComplexo n2) {
		// TODO Auto-generated method stub
		
		NumeroComplexo retorno = new NumeroComplexo(0,0);
		
		retorno.setpReal(this.getpReal() - n2.getpReal());
		retorno.setpImag(this.getpImag() - n2.getpImag());
		
		return retorno;
	}                                                                                                                        
	
	
	@Override
	public String toString() {
		return pReal + " + " + pImag + "i";
	}

	
	
	
}
