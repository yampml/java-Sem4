package bai3_Complex;

public class Complex {
	private float real;
	private float imaginary;
	
	public float getReal() {
		return real;
	}
	public void setReal(float real) {
		this.real = real;
	}
	public float getImaginary() {
		return imaginary;
	}
	public void setImaginary(float imaginary) {
		this.imaginary = imaginary;
	}
	
	public Complex(float real, float imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public static Complex add(Complex a, Complex b){
		float real = a.getReal() + b.getReal();
		float imaginary = a.getImaginary() + b.getImaginary();
		return new Complex(real, imaginary);
	}
	
	public static Complex sub(Complex a, Complex b){
		float real = a.getReal() - b.getReal();
		float imaginary = a.getImaginary() - b.getImaginary();
		return new Complex(real, imaginary);
	}
	
	public String toString(){
		return real + " + i*" + imaginary; 
	}
}