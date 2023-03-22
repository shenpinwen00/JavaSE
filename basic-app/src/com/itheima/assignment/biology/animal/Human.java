package com.itheima.assignment.biology.animal;

public class Human {
	  String name;
	  double height,weight;
	  
	  public Human(String name){
		  this.name=name;
	  }
	  public void eat(){
		System.out.println(name+"is eating");
	  }
	  public void sleep(){
		System.out.println(name+"is sleeping");
	  }
	  public void work(){
		System.out.println(name+"is working");
	  }
}
