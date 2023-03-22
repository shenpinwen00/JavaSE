package com.itheima.assignment.com.graphic;

public class Cylinder {
	private double r;
	private double h;
	private final static double PI=3.14;
	
	public Cylinder(double r,double h){
		this.r = r;
		this.h= h;
	}
	public void volume() {
		System.out.println("圆柱体体积：" + (PI*r*r*h));
	}

}
