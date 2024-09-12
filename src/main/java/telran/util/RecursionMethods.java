package telran.util;

public class RecursionMethods {
    public static void f(int a) {
        if (a > 3) {
            f(a - 1);
        }
    }
    public static long factorial(int n) {
        // n! = 1 * 2 * 3 * ... * n
        if(n < 0) {
            n = -n;
        }
        return n == 0 ? 1 : n * factorial(n - 1);
    }
    /**
     * 
     * @param num - any integer number
     * @param degree - any positive number
     * @return num ^ degree
     * limitations:
     * 1. no cycles allowed
     * 2. arithmetic operators + ; - are allowed only
     * 3. bitwise operators like >>, <<, &&, etc disallowe
     */
    public static long pow(int num, int degree){
        if (degree < 0) {
            throw new IllegalArgumentException();
        }
        return degree == 0 ? 1 : multiply(num, pow(num, degree - 1));
    }

    private static long multiply(long num, long degree) {
        long res = 0;
        if (degree != 0) {
            res = degree > 0 ? num + multiply(num, degree - 1) : -multiply(num, -degree);
        }
        return res;
    }
    

    public static int sum(int [] array) {
        return sum(array, array.length);
    }
    private static int sum(int[] array, int length) {
        return length == 0 ? 0 : array[length - 1] + sum(array, length - 1);
    }
    /**
     * 
     * @param x
     * @return x ^ 2
     * limitations:
     * 1. no cycles
     * 2. arithemetic operators only + ; -
     * 3. no bitwise operators
     * 4. no standard and additional methods are allowed
     * 5. no additional fields of the class RecursionMethods are allowed
     */
    public static int square(int x) {
        x = x < 0 ? -x : x;
        return x == 0 ? 0 : x + x - 1 + square(x - 1);
    }
    /**
     * 
     * @param string
     * @param subString
     * @return true if subString is actually substring of the given string
     * limitations:
     * 1. no cycles
     * 2. the allowed methods of class String are
     *     2.1 charAt(int index)
     *     2.2 length()
     *     2.3 substring(int beginIndex)
     */
    public static boolean isSubstring(String string, String subString) {
        return subString.length() == 0 ? true : isSubstringRecursive(string, subString, 0, 0);
        
    }

    private static boolean isSubstringRecursive(String string, String subString, int stringIndex, int subStringIndex) {
        boolean result;
        if (subStringIndex == subString.length()) {
            result = true;
        } else if (stringIndex == string.length()) {
            result = false;
        } else {
            boolean charactersMatch = (string.charAt(stringIndex) == subString.charAt(subStringIndex));
            if (charactersMatch) {
                result = isSubstringRecursive(string, subString, stringIndex + 1, subStringIndex + 1);
            } else {
                result = isSubstringRecursive(string, subString, stringIndex + 1, 0);
            }
        }
        
        return result;
    }
    
}