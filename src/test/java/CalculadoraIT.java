import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraIT {
    @Test
    void testSumarIntegracion() {
        // En un proyecto real aquí arrancarías Spring, pero para simularlo en tu formato IT:
        Calculadora calc = new Calculadora();
        System.out.println("Simulando acceso a entornos o conexiones externas...");
        assertEquals(10, calc.sumar(7, 3));
    }
}
