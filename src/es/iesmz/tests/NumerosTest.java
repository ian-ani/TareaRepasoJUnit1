package es.iesmz.tests;

import es.iesmz.utils.Numeros;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumerosTest {
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvSource({"4,55,7,2", "14,23,27,2", "14,55,14,1", "14,14,33,1", "32,55,55,1", "329,329,329,0"})
    void sonIgualesTest(int a, int b, int c, int valorEsperado) {
        assertEquals(valorEsperado, Numeros.sonIguales(a, b, c));
    }
}
