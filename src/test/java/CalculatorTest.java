import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    private static Calculator c;

    @BeforeClass
    public static void setup() {
        c = new Calculator();
    }

    @Test
    public void add() {
        Assert.assertEquals(c.add(1, 1), 2);
    }

    @Test
    public void subtract0() {
        Assert.assertEquals(c.subtract(0, 0), 0);
    }

    @Test
    public void subtract1() {
        Assert.assertEquals(c.subtract(2, 1), 1);
    }


    @Test
    public void isPositive() {
        Assert.assertTrue(c.isPositive(5));
        Assert.assertTrue(c.isPositive(0));
        Assert.assertFalse(c.isPositive(-5));

    }
}
