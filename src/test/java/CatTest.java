import io.zipcoder.polymorphism.Cat;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void catConstructorTest() {
        Cat cat = new Cat("Charles");

        String expected = "Charles";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catSpeakTest() {
        Cat cat = new Cat("Charles");

        String expected = "prrrr";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }
}
