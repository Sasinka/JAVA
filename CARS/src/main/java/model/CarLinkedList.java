package model;
import model.CarListNode;

public class CarLinkedList {
    private CarListNode first;
    private CarListNode last;
    private int length;
    int[] array = new int[length];

    CarLinkedList(){
        last = null;
        first = last;
        length = 0;
    }

    void addNextNode(CarListNode newFirst, int value, String name){
        newFirst.next = first;
        newFirst.setValue(value);
        newFirst.setName(name);
        first = newFirst;
        length++;
    }

    void toArray(){
        CarListNode now = first;
        for(int i = 0; i<length; i++){
            array[i] = now.getValue();
            now = now.next;
        }

    }

    public CarListNode getFirst() {
        return first;
    }

    public CarListNode getLast() {
        return last;
    }

    public int getLength() {
        return length;
    }

    public int[] getArray() {
        return array;
    }

    public void setFirst(CarListNode first) {
        this.first = first;
    }

    public void setLast(CarListNode last) {
        this.last = last;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

}
