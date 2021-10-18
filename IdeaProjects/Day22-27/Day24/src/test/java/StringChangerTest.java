import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringChangerTest {
StringChanger stringChanger;
    @Test
    public void toCapitalLetters() {
        StringChanger stringChanger = new StringChanger();
        Assert.assertEquals("ABCD", stringChanger.toCapitalLetters("abcd"));
    }

    @Test
    public void toSmallLetters() {
        StringChanger stringChanger = new StringChanger();
        Assert.assertEquals("abcd", stringChanger.toSmallLetters("ABCD"));
    }
}