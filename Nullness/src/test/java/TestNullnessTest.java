import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Zalisekile on 2017/03/19.
 */
public class TestNullnessTest extends MultiMod
{
    @Test
    public void TestNull() throws Exception
    {
        MultiMod.Dog dog = null;

        assertNull(dog);
    }
}