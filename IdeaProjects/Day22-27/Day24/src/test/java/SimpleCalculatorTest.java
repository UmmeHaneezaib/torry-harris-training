import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    @Test
    public void add() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        Assert.assertEquals(6, simpleCalculator.add(4, 2));
    }

    @Test
    public void sub() {
        SimpleCalculator simpleCalculator= new SimpleCalculator();
        Assert.assertEquals(2, simpleCalculator.sub(4, 2));
    }

    @Test
    public void mul() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        Assert.assertEquals(8, simpleCalculator.mul(4, 2));
    }

    @Test
    public void div() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        Assert.assertEquals(2, simpleCalculator.div(4, 2));
    }
}