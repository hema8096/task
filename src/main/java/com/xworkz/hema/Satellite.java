package com.xworkz.hema;

public class Satellite {
 private int Launch;
 private String location;
 public Satellite() {
	 System.out.println("invoked satellite"+this.getClass().getSimpleName());
 }
 
 public void setLaunch(int Launch) {
	 System.out.println("Launch");
	 this.Launch=Launch;
	 
 }
 public void setlocation(String location) {
	 System.out.println("location");
this.location=location;

 }
 
 public void Launch(int time) {
	 System.out.println("invoked"+time);

 }

@Override
public String toString() {
	return "Satellite [Launch=" + Launch + ", location=" + location + "]";
}
 

}
