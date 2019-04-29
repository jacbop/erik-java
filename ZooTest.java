

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ZooTest
{

    public ZooTest()
    {
    }


    @Before
    public void setUp()
    {
    }

    @Test
    public void testZoo()
    {
        Zoo zut = new Zoo();
        Animal[] animals = zut.getListAnimals();
        assertTrue(animals.length == 7);
    }
 
    @After
    public void tearDown()
    {
    }
}
