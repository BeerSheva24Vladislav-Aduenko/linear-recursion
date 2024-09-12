package telran.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static telran.util.RecursionMethods.*;

public class RecoursionMethodsTest {
    @Test
    void ftest() {
        f(400);
    }
    @Test
    void factorialTest() {
        assertEquals(6, factorial(3));
        assertEquals(24, factorial(4));
        assertEquals(6, factorial(-3));
    }
    @Test
    void powTest() {
        assertEquals(-32, pow(-2, 5));
        assertEquals(64, pow(-2, 6));
        assertEquals(100, pow(10, 2));
        assertEquals(100, pow(-10, 2));
        assertEquals(1000, pow(10, 3));
        assertEquals(-1000, pow(-10, 3));
        assertThrowsExactly(IllegalArgumentException.class, () -> pow(10, -3));
    }
    @Test
    void sumTest() {
        int[] ar = {1, 2, 3, 4, 5};
        assertEquals(15, sum(ar));
    }

    @Test 
    void squareTest() {
        assertEquals(100, square(10));
        assertEquals(100, square(-10));
        assertEquals(0, square(0));
    }

    @Test
    void isSubstringTest() {
        String string = "Recoursion";
        assertTrue(isSubstring(string, "coursion"));
        assertTrue(isSubstring(string, "Recoursion"));
        assertTrue(isSubstring(string, ""));
        assertFalse(isSubstring(string, "recoursion"));
        assertFalse(isSubstring(string, "coursionn"));


    }
}