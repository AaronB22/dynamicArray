public class AmazingList implements StringList {
    private String[] array;
    public AmazingList() {
        this(8);
    }

    public AmazingList(int listSize){
        this.array= new String[listSize];
    }
    
}
