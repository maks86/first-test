import com.calculate.Calculate;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculate {
    @Test
    public void testAdd()  {
        Calculate calculate = new Calculate(5.5);
        double res=calculate.add(2);
        if (res==7.5) Assert.fail("!!!!");
    }
}
