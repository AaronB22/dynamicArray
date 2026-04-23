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
}
