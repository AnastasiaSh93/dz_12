import org.example.Man;
import org.testng.annotations.DataProvider;
public class WomanDP {
    @DataProvider(name = "partners")
    public Object[][] createPartners() {
        return new Object[][]{
                {new Man("John", "Doe", 79, null)},
                {new Man("Michael", "Smith", 72, null)}
        };
    }

    @DataProvider(name = "retiredAge")
    public Object[][] setRetiredAge() {
        return new Object[][]{
                {60},
                {61},
                {80}
        };
    }
}
