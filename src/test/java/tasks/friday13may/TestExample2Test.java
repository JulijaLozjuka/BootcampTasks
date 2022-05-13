package tasks.friday13may;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestExample2Test {
    TestExample2 testExample2 = new TestExample2();

    @Test
    public void difference() {
        int result = testExample2.difference(10,6);
        assertEquals(10,result);
    }
}