import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleCharacterFinderTest {


    @Test
    public void input350MiddleCharacter5() {
        //setup

        String result = MiddleCharacterFinder.calculator("350");

        Assert.assertEquals("5", result);

    }



}