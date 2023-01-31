import org.junit.Assert;
import org.junit.Test;

public class AdditionTestCase {
    @Test
    public void testAdd() {
        Assert.assertEquals(4, Addition.add(2, 2));
        Assert.assertEquals(30, Addition.add(10, 20));
    }
}
