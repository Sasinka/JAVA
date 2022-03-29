package model;
import model.CarListNode;
import model.CarLinkedList;


public class Race {
    private int length;
    private Car car;
    CarLinkedList race;

    void addRacingCar(Car car){
        CarListNode (car.getSpeed(), car.getModelName()) = newCar;
       race.addNextNode(newCar, car.getSpeed(), car.getModelName());
    }

    public boolean getRaceResult(){

    }


    public void setLength(int length) {
        this.length = length;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setRace(CarLinkedList list){
        this.race = list;
    }

    public int getLength() {
        return length;
    }

    public Car getCar() {
        return car;
    }

    public CarLinkedList getRace(){
        return race;
    }


}
