import com.calculator.Calculate;
        import static org.junit.Assert.*;
        import org.junit.Test;

public class TestCalculate {
    @Test
    public void testAdd()  {
        Calculate calculate = new Calculate(5.5);
        double result = calculate.add(2);
        double res=7.5;
        assertEquals(result,res);    }
}
