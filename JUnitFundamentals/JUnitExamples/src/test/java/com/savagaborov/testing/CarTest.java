package com.savagaborov.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.savagaborov.classes.Car;
import com.savagaborov.classes.Weapon;

public class CarTest {

	@Test
	public void testForCarClass_NameMatching(){
		
		Car car = new Car();
		car.setId(1);
		car.setName("Tesla");
		assertEquals("Tesla", car.getName());
		
	}
	
}
