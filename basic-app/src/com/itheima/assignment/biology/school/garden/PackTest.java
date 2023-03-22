package com.itheima.assignment.biology.school.garden;


import com.itheima.assignment.biology.animal.Human;
import com.itheima.assignment.biology.plant.Flower;

public class PackTest {
	public static void main(String[] args)
	   {
	       Human h=new Human("张三");
		   Flower f=new Flower("rose");
		   
		   h.eat();
		   h.sleep();
		   h.work();
		   
		   f.drink();
		   f.blossom();
	   
	   }

}
