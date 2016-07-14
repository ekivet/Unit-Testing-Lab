package ly.generalassemb.drewmahrt.oofundamentals;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by erickivet on 7/13/16.
 */
public class LionTest {
    Lion someLion;

    @Test
    public void testLionSound()throws Exception{
        someLion = new Lion(true);

        String eString = "Roar!!!";
        String aString = someLion.makeNoise();

        assertEquals("Doesn't sound like Lion",eString,aString);
    }

    @Test
    public void testLionSpeed()throws Exception{
        someLion = new Lion(true);

        int eSpeed = 50;
        int aSpeed = someLion.getTopSpeed();

        assertEquals("Doesn't have the speed of a Lion",eSpeed,aSpeed);
    }
}
