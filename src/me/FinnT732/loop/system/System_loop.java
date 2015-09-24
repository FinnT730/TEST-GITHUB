package me.FinnT732.loop.system;

import java.applet.Applet;
import java.util.Random;

public class System_loop  {
	
	private int[] number;
	
	private String[] name;
	
	public void Main(String[] args) {
		
	}
	
	public static void PrintText(Applet app,Random random) {
		app.setSize(500,500);
		app.add(app, random.nextInt(55));
	}
	
	private static void Test() {
		System.out.println("THIS IS AN TEST!!");
	}

}
