package ly.generalassemb.drewmahrt.oofundamentals;



import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by erickivet on 7/13/16.
 */
public class ZooTest {

    //create instance of zoo object
    Zoo someZoo;


    //run through methods of Zoo to see if they work
    @Test
    public void testIfZooAddsAnimal() throws Exception{

        //create an instance of zoo
        someZoo = Zoo.getInstance();

        //create an instance of some animal
        Snake eSnake = new Snake(true);

        //add animal
        someZoo.addAnimal(eSnake);

        //test whether animal was added by calling getter method
        //  at array position (0)
        Snake aSnake = (Snake) someZoo.getAnimals().get(0);

        //test whether objects are the same
        assertSame("Not the same",eSnake,aSnake);
    }

    @Test
    public void testIfZooRemovesAnimal() throws Exception{

        someZoo = Zoo.getInstance();

        //add animal
        Snake thisSnake = new Snake(true);
        //add snake to zoo
        someZoo.addAnimal(thisSnake);

        //get size of array (value should = 1)
        int zooSize = someZoo.getAnimals().size();

        //remove the animal by calling Zoo's remove animal method,
        //    (new method created)
        someZoo.removeAnimal(thisSnake);


        int eSize = zooSize - 1;
        int aSize = someZoo.getAnimals().size();

        assertEquals("Animal not removed",eSize,aSize);
    }
}
