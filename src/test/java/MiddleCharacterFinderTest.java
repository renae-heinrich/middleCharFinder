import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleCharacterFinderTest {

    @Test
    public void inputEmptyMiddleCharacterEmpty() {
        //setup

        String result = MiddleCharacterFinder.calculator("");

        Assert.assertEquals("", result);

    }


    @Test
    public void input350MiddleCharacter5() {
        //setup

        String result = MiddleCharacterFinder.calculator("350");

        Assert.assertEquals("5", result);

    }

    @Test
    public void input1001MiddleCharacter00() {
        //setup

        String result = MiddleCharacterFinder.calculator("1001");

        Assert.assertEquals("00", result);

    }


}