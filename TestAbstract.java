package javaEclipseTest;

abstract class TestAbstract {
	public String carName = "Toyota";
	public String plateNum = "22Ae";
	
	public abstract void displayInfo(); //<-- wala talagang body kasi ganon syntax. nasa subclass ang body ng method.
}
//abstract classes