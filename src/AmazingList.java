public class AmazingList implements StringList {

    private String[] array;
    private int valueCount = 0;

    public AmazingList() {
        this(8);
    }

    public AmazingList(int listSize){
        this.array = new String[listSize];
    }
    
    public String get(int index) {
        return "";
    }

    public void set(int index, String value) {

    }

    public void add(String value) {
        array[valueCount] = value;
        valueCount++;
        if (size() == capacity()) {
            // Expand static array
        }
    }

    public String remove(int index) {
        return "";
    }

    public int size() {
        return 0;
    }

    public int capacity() {
        return this.array.length;
    }

    private void arrayResize(){
        String[] newArr= new String[capacity()*2];
        for (int i=0;i<capacity();i++){
            newArr[i]=array[i];
        }
        array=newArr;
    }

}
