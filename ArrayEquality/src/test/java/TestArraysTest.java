import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import java.lang.Math.*;

/**
 * Created by Zalisekile on 2017/03/19.
 */
public class TestArraysTest extends MultiMod
{
    @Test
    public void ArrayEquality() throws Exception
    {
        int[] a = {1,2,3,4};
        int[] b = {1,2,3,4};

        assertArrayEquals(a,b);
    }
}