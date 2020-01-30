package com.xworkz.hema;

public class labour {
 private String name;
 private int experence;
 private ThreadIMPL threadIMPL;
 
 public labour(String name) {
	 this.name=name ;
	 System.out.println("created"+name);
 }
 public void setExperence(int experence) {
	 this.experence=experence;
	 System.out.println("created"+experence);
	 
 }
 public void setThreadIMPL(ThreadIMPL threadIMPL) {
	 this.threadIMPL=threadIMPL;
	 System.out.println("created"+threadIMPL);
 }
 public void work() {
	 this.threadIMPL.start();
	 this.threadIMPL.run();
 }
 
}
