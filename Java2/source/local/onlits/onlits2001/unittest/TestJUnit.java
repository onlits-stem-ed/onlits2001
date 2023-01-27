package local.onlits.onlits2001.unittest;

import org.junit.Test;
import org.junit.Assert;

public class TestJUnit {
    public void testAdd() {
        String str = "Junit is working fine";
        Assert.assertEquals("Junit is working fine", str);
    }
}
