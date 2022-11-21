import io.zipcoder.polymorphism.Dog;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void dogConstructorTest() {
        Dog dog = new Dog("Ripley");

        String expected = "Ripley";
        String actual = dog.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogSpeakTest() {
        Dog dog = new Dog("Ripley");

        String expected = "woof";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }
}
