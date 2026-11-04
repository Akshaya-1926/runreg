package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(15, c.add(10, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, c.subtract(10, 5));
    }
}
