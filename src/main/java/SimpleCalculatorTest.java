import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoShouldEqualFour(){

        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(calculator.add(2,2),4);

    }

    @Test
    void threePlusSevenShouldEqualTen(){

        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(calculator.add(3,7),10);

    }


}