import junit.framework.TestCase;

public class ValidParenthesesTest extends TestCase {

    public void testProfit1(){
        String s = "({[]})";
        boolean actual = Main.Solution.isValid(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    public void testProfit2(){
        String s = "({[])}";
        boolean actual = Main.Solution.isValid(s);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}