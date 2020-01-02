package com.springtrail.controller;

public class User {
	String name ;
    int id;
    double weight;
    double height;
    double BMI;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBMI() {
		return BMI;
	}
	public void setBMI(double bMI) {
		BMI = bMI;
	}
    
	public double calculateBMI(double wgt,double hgt)
	{
		
		
		BMI = wgt/(hgt*hgt);
		return BMI;
		
		
		
		
		
	}

}
