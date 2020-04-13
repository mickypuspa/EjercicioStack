import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    private StackImplementation<Integer> stackLimite;

    @Before
    public void setUp() throws Exception
    {
        stackLimite = new StackImplementation(5);
        stackLimite.push(1);
        stackLimite.push(2);
    }

    @Test(expected = StackLlenoException.class)
    public void testPlena() throws Exception
    {
        stackLimite.push(3);
        stackLimite.push(4);
        stackLimite.push(5);
        stackLimite.push(3);
    }

    @Test(expected=StackVacioException.class)
    public void testBuida() throws Exception
    {
        stackLimite.pop();
        stackLimite.pop();
        stackLimite.pop();
        assertEquals(0, stackLimite.size());
    }


    @After
    public void setDown() throws Exception
    {
        stackLimite = null;
    }
}