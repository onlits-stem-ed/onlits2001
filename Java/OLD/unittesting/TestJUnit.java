import org.junit.Test;
import org.junit.Assert;

public class TestJUnit {
    @Test
    public void testAdd() {
        String str = "Junit is working fine";
        Assert.assertEquals("Junit is working fine", str);
    }
}