package com.springtrail.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;

@Service("Userservice")
public class UserService {

	public User BMICalculator()
	{
		// TODO Auto-generated method stub
		User u = new User();
		u.setName("Shreyas");
		u.calculateBMI(80, 1.80);
		return u;

	}

}
