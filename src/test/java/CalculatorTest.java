import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        Integer first = 1;
        Integer second = 2;
        Integer sum = calculator.add(first, second);
        assertEquals(3, sum);
    }
}