package it.alessiacal.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CostruttoreTest {

	@Test
	void constructorTest() {
		Operazioni operazioni = new Operazioni();
		assertEquals(Operazioni.class, operazioni.getClass());
		
	}
}
