import org.example.Man;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomanTest1 {
    private Woman woman;

    @BeforeMethod
    public void setUp() {
        woman = new Woman("Jane", "Smith", 50, null, "Smith");
    }

    @Test(dataProvider = "partners", dataProviderClass= WomanDP.class)
    public void testRegisteredPartnership(Man partner) {
        woman.registeredPartner(partner);
        Assert.assertEquals(woman.getPartner(), partner);
        Assert.assertEquals(woman.getLastName(), partner.getLastName());
    }

    @Test(dataProvider = "partners", dataProviderClass= WomanDP.class)
    public void testDeregisteredPartnership(Man partner) {
        woman.registeredPartner(partner);
        woman.deregisterPartnership(true);
        Assert.assertNull(woman.getPartner());
        Assert.assertEquals(woman.getLastName(), woman.getMaidenName());
    }

    @Test
    public void testIsRetired() {
        Assert.assertTrue(woman.isRetired());
    }
}
