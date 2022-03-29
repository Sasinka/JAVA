package model;

public class CarListNode {
    CarListNode next;
    private int value; //toto bude TimeSpan getSeconds
    private String name;

    CarListNode(int value, String name){
        setValue(value);
        setName(name);
    }

    public CarListNode getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public String getName(){
        return name;
    }

    public void setNext(CarListNode next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name){
        this.name = name;
    }


}
