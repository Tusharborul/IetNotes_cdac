package com.demo.beans;

public class Reactangle extends Shape{
	private float l,b;

	public Reactangle() {
		super();
	}

	public Reactangle(String colour,float l, float b) {
		super(colour);
		this.l = l;
		this.b = b;
	}

	public float getL() {
		return l;
	}

	public void setL(float l) {
		this.l = l;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return super.toString()+"Reactangle [l=" + l + ", b=" + b + "]";
	}
	
}
