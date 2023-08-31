import org.example.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ManTest1 {
    private Man man;

    @BeforeMethod
    public void setUp() {
        man = new Man("Leo", "Smith", 78, null);
    }

    @Test(dataProvider = "partners", dataProviderClass= WomanDP.class)
    public void testRegisteredPartnership(Man partner) {
        man.registeredPartner(partner);
        Assert.assertEquals(man.getPartner(), partner);
        Assert.assertEquals(man.getLastName(), partner.getLastName());
    }

    @Test(dataProvider = "partners", dataProviderClass= WomanDP.class)
    public void testDeregisteredPartnership(Man partner) {
        man.registeredPartner(partner);
        man.deregisterPartnership(false);
        Assert.assertNull(man.getPartner());
    }

    @Test
    public void testIsRetired() {
        Assert.assertTrue(man.isRetired());
    }
}
