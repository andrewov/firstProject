import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void valueSumm() {
        assertEquals(12, new Main().valueSumm(6,6));
    }

    @Test
    public void valueDiff() {
        assertEquals(5, new Main().valueDiff(12, 7));
    }

    @Test
    public void valueDivide() {
        assertEquals(7, new Main().valueDivide(21, 3) );
    }

    @Test
    public void valueMult() {
        assertEquals(125, new Main().valueMult(25, 5));
    }

    @Test
    public void velueDiv(){
        assertEquals(1, new Main().valueDiv(7,3));
    }
}