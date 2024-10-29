package com.demo.beans;

public class Triangle extends Shape {
	private float b,h,s1,s2;

	public Triangle() {
		super();
	}

	public Triangle(String colour,float b, float h, float s1, float s2) {
		super(colour);
		this.b = b;
		this.h = h;
		this.s1 = s1;
		this.s2 = s2;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getH() {
		return h;
	}

	public void setH(float h) {
		this.h = h;
	}

	public float getS1() {
		return s1;
	}

	public void setS1(float s1) {
		this.s1 = s1;
	}

	public float getS2() {
		return s2;
	}

	public void setS2(float s2) {
		this.s2 = s2;
	}

	@Override
	public String toString() {
		return super.toString()+"Triangle [b=" + b + ", h=" + h + ", s1=" + s1 + ", s2=" + s2 + "]";
	}



}
