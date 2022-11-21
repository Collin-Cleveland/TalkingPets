import io.zipcoder.polymorphism.Pet;
import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void petConstructorTest() {
        Pet pet = new Pet("Rip");

        String expected = "Rip";
        String actual = pet.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        Pet pet = new Pet("Charles");

        String expected = "";
        String actual = pet.speak();

        Assert.assertEquals(expected, actual);
    }
}
