package com.demo.beans;

	public class Circle extends Shape {
		private float r;

		public Circle() {
			super();
		}

		public Circle(String colour,float r) {
			super(colour);
			this.r = r;
		}

		public float getR() {
			return r;
		}

		public void setR(float r) {
			this.r = r;
		}

		@Override
		public String toString() {
			return super.toString()+"Circle [r=" + r + "]";
		}

	
	}
