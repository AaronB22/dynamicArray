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
        void testListSize(){
            AmazingList list = new AmazingList(8);
            list.add("b");
            list.add("y");
            list.add("t");
            
            int actual= list.size();

            assertEquals(3, actual);
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
    
    @Test
    void testListSetOutOfBounds() {
        AmazingList list = new AmazingList(4);

        list.add("a");
        list.add("b");
        list.add("c");
        list.set(2, "d");
        
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.set(4, "15");
        });

    }

    @Test
    void testListRemoveAtIndex(){
        AmazingList list = new AmazingList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.set(2, "d");

        String actual= list.remove(1);
        
        assertEquals("b", actual);
    }
    @Test
    void testListRemoveOutOfBounds(){
        AmazingList list = new AmazingList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.set(2, "d");
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(10);
        });
    }
    @Test 
    void testListGet(){
        AmazingList list = new AmazingList();
        list.add("a");
        list.add("b");

        String actual = list.get(1);

        assertEquals("b", actual);
    }
    
    @Test
    void testListGetOutOfBound() {
        AmazingList list = new AmazingList();
        list.add("a");
        list.add("b");

        assertThrows(IndexOutOfBoundsException.class, ()->{
            list.get(4);
        });
    }
}
