package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by erickivet on 7/13/16.
 */
public class SnakeTest {
    Snake someSnake;

    @Test
    public void testSnakeSound() throws Exception{
        //create instance of Snake
        someSnake = new Snake (true);
        //create expected String
        String eString = "Hiss!!!";
        //get actual String
        String aString = someSnake.makeNoise();
        //compare
        assertEquals("Doesn't sound like snake",eString,aString);
    }
    //do the same thing with speed
    @Test
    public void testSnakeSpeed() throws Exception{
        someSnake = new Snake(true);
        int eSpeed = 5;
        int aSpeed = someSnake.getTopSpeed();

        assertEquals("Not the same speed as snake",eSpeed,aSpeed);
    }
}
