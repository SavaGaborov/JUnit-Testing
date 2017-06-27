package com.savagaborov.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import com.savagaborov.classes.Weapon;

public class WeaponTest {

	@Test
	public void testForWeaponClass_NameMatching(){
		
		Weapon weapon = new Weapon();
		List<String> lista = new ArrayList<String>();
		lista.add("Tesla");
		lista.add("Cvijic");
		
		assertEquals(lista, weapon.getWapon());
	}

}
