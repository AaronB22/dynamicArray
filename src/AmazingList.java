public class AmazingList implements StringList {

    private String[] array;
    private int valueCount = 0;

    public AmazingList() {
        this(8);
    }

    public AmazingList(int listSize) {
        this.array = new String[listSize];
    }

    public String get(int index) {
        return array[index];
    }

    public void set(int index, String value) {

    }

    public void add(String value) {
        if (size() == capacity()) {
            arrayResize();
        }
        array[valueCount] = value;
        valueCount++;
    }

    public String remove(int index) {
        return "";
    }

    public int size() {
        return valueCount;
    }

    public int capacity() {
        return this.array.length;
    }

    private void arrayResize() {
        String[] newArr = new String[capacity() * 2];
        for (int i = 0; i < capacity(); i++) {
            newArr[i] = array[i];
        }
        array = newArr;
    }

}
