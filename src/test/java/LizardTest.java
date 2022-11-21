import io.zipcoder.polymorphism.Lizard;
import org.junit.Assert;
import org.junit.Test;

public class LizardTest {

    @Test
    public void lizardConstructorTest() {
        Lizard lizard = new Lizard("Sammy");

        String expected = "Sammy";
        String actual = lizard.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lizardSpeakTest() {
        Lizard lizard = new Lizard("Sammy");

        String expected = "ssss";
        String actual = lizard.speak();

        Assert.assertEquals(expected, actual);
    }
}
