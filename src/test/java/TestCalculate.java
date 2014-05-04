import com.calculate.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

public class TestCalculate {
    private Calculate calculate;
    private Calculate string;

    @Before
    public void setupB() {
        calculate = new Calculate(5.5);
    }

   /* @Test
    public void testAdd() {
        double res = calculate.add(2);
        assertEquals(7.5, res);
    }*/

    @Test
    public void testSubtract() {
        double res = calculate.subtract(2);
        assertEquals(3.5, res);
    }

    @Test
    public void testMultiply() {
        double res = calculate.multiply(2);
        assertEquals(11.0, res);
    }

    @Test
    public void testDivide() {
        double res = calculate.divide(2);
        assertEquals(2.75, res);
    }
    @Test
    public void testDivideNull() {
        double res = calculate.divide(0);
        assertEquals(2.75, res);
    }
    @Test
    public void setup() {
        string = new Calculate("5.5,dd");
    }
    @Test
    public void testAdd() {
        string = new Calculate("5.5,dd");
        double res = string.add(2);
        assertEquals(7.5, res);
        System.out.println(string.getResult());
    }
}