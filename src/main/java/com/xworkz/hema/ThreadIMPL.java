package com.xworkz.hema;

public class ThreadIMPL extends Thread {

	public void run() {
		System.out.println("RUNNING");
		
	}
	public void start() {
		System.out.println("invoked start");
	}
}
