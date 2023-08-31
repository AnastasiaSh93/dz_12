import org.example.Woman;
import org.testng.annotations.DataProvider;

public class ManDP {
        @DataProvider(name = "partners")
        public Object[][] createPartners() {
            return new Object[][]{
                    {new Woman("Lisa", "Somename", 70, null, "Doe")},
                    {new Woman("Laura", "Williams", 72, null, "Smith-123")}
            };
        }
        }



