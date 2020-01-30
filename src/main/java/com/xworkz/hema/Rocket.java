package com.xworkz.hema;

public class Rocket {
private Fuel fu;
private Satellite sat;
private String countryName;
public Rocket(Fuel fu) {
	this.fu=fu;
	System.out.println("created"+fu);
}
public void setSat(Satellite sat) {
	this.sat=sat;
	System.out.println(sat);
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
	System.out.println(countryName);
}
public void start() {
	this.fu.fire();
}
public void launch() {
this.sat.Launch(25);
	
}





}
