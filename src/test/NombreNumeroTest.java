package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import MontoEscrito.NombreNumero;

class NombreNumeroTest {

	@Test
	void test1cifra() {
		// Step 1. instantiate the tested class using the constructor method
		NombreNumero testedNombre = new NombreNumero(0);
		// Step 2. Create the expected value variable
		String expectedValue = "SIETE";
		// Step 3. Obtain the actual value
		String actualValue = testedNombre.Nombre(7);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void test2cifra() {
		// Step 1. instantiate the tested class using the constructor method
		NombreNumero testedNombre = new NombreNumero(0);
		// Step 2. Create the expected value variable
		String expectedValue = "TREINTA Y CINCO";
		// Step 3. Obtain the actual value
		String actualValue = testedNombre.Nombre(35);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void test3cifra() {
		// Step 1. instantiate the tested class using the constructor method
		NombreNumero testedNombre = new NombreNumero(0);
		// Step 2. Create the expected value variable
		String expectedValue = "CUATROCIENTOS TREINTA";
		// Step 3. Obtain the actual value
		String actualValue = testedNombre.Nombre(430);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void test4cifra() {
		// Step 1. instantiate the tested class using the constructor method
		NombreNumero testedNombre = new NombreNumero(0);
		// Step 2. Create the expected value variable
		String expectedValue = "NUEVE MIL QUINIENTOS";
		// Step 3. Obtain the actual value
		String actualValue = testedNombre.Nombre(9500);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

}
