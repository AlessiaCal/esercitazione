package it.alessiacal.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ZeroTest {

	@Test
    void createTest() {
        Operazioni operazioni = new Operazioni();
        IllegalArgumentException illegalArgumentException =
                assertThrows(IllegalArgumentException.class,
                        () -> operazioni.divisione(6, 0));

    }
}
