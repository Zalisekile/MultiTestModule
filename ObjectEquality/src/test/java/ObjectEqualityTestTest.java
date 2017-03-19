import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Zalisekile on 2017/03/19.
 */
public class ObjectEqualityTestTest extends MultiMod
{
    MultiMod.Dog dog = new Dog();
    @Test
    public void TestObjEquality() throws Exception
    {
        MultiMod.Dog dog1 = new Dog("PitBull","Zakes",'M',2,"black");
        MultiMod.Dog dog2 = new Dog("PitBull","Gina",'F',3,"white");

        assertFalse("Objects are equal",dog1.getClass() != dog2.getClass());
    }
}