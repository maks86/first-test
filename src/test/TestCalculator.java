import com.calculator.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.NumberFormat;
import java.util.Locale;

import static junit.framework.Assert.*;

public class TestCalculator {
    private Calculator calculator;
    @Before
    public void setup() {
        calculator = new Calculator("10.000,25");
    }
    @Test
    public void testAdd() {
        double res = calculator.add(2);
        assertEquals(10002.25, res);
    }

    @Test
    public void testSubtract() {
        double res = calculator.subtract(2);
        assertEquals(9998.25, res);
    }

    @Test
    public void testMultiply() {
        double res = calculator.multiply(2);
        assertEquals(20000.5, res);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivide()
    {
        calculator.divide(0);
    }
    @Test
    public void testToString(){
       String str=calculator.toString();
       assertEquals("10,000.25",str);
    }
}