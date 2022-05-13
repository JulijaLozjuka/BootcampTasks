package tasks.friday13may;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestExampleTest {
    TestExample testExample = new TestExample();

    @Test
    public void testSumWithTwoIntegers() {
        int result = testExample.sum(5,4);
        assertEquals(9,result);
    }
}