package Ets;

import java.awt.Color;
import java.util.InputMismatchException;

public class Circulo {

	private int radio;
	private Color c;
	private int x;
	private int y;
	
	public Circulo(int radio, Color c, int x, int y) {
		this.radio = radio;
		this.c = c;
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "Radio: " + radio;
	}
	
	public boolean equals (Object o){
		Circulo c = (Circulo)o;
		 if (c.getRadio() == radio)
			 return true;
		 else
			 return false;
		
	}
	public double perimetro(){
		return  2 * Math.PI * radio;
		
	}
	public double area(){
		return Math.PI * radio * radio;	
	}
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		if(radio < 0)
			throw new InputMismatchException();
		else
			this.radio = radio;
	}
	public Color getC() {
		return c;
	}
	public void setC(Color c) {
		this.c = c;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}











