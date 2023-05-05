import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class MyFirstTest {
    @Test
    public void test1() {
        String expected = "CodeUp";
        String actual = "CodeUp";
        String actual2 = "CodeNotUp";
        assertEquals(expected, actual);
        assertNotEquals(expected, actual2);
    }
    @Test
    public void test2(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }
    @Test
    public void test3(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }
    @Test
    public void test4(){
        String language = "PHP";

        boolean yes = language.contains("H"); // use assertTrue for this statement
        boolean no = language.contains("J"); // use assertFalse for this statement

//        assertTrue(yes);
//        assertFalse(no);
        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
//        assertFalse(language.contains("P"));
        assertTrue(language.contains("P"));
    }
    @Test
    public void test5(){
        String language = null;
// assertNull on the language variable
        assertNull(language);
        language = "Java";
// assertNotNull on the language variable
        assertNotNull(language);
    }
}
