import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AmazingListTest {
    
    @Test
    void testListResizes() {
        AmazingList list = new AmazingList(1);
        list.add("s");
        list.add("s");

        int actual = list.capacity();

        assertEquals(2,actual);
    }

    @Test
    void testListDefaultSize() {
        AmazingList list = new AmazingList();

        int actual = list.capacity();
    
        assertEquals(8,actual);
    }

    @Test
    void testListSetIndexMatches() {
        AmazingList list = new AmazingList(4);

        list.add("a");
        list.add("b");
        list.add("c");
        list.set(2,"d");

        String actual = list.get(2);

        assertEquals("d", actual);
    }

    @Test
    void testListSetNoValuesLost() {
        AmazingList list = new AmazingList(4);

        list.add("a");
        list.add("b");
        list.add("c");
        list.set(2,"d");

        String actual = list.get(3);

        assertEquals("c", actual);
    }
}
