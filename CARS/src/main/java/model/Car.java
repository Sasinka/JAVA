package model;

import java.util.UUID;
//import Engine;

public class Car {
    private String manufacturer;
    private String modelName;
    private int year;
    private UUID vinCode;
    private String type;
    private Engine Engine;
    private ServiceBook ServiceBook;
    static long publicNumberOfCar = 0;
    private  int speed;

    public Car(String manufacturer, String modelName, int year){
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.year = year;
        this.vinCode = UUID.randomUUID();
        //Main.getNumberOfExistingCars();
        //numberOfCars = numberOfCars +1;
    }

    public Car(String manufacturer, String modelName, int year, String type, int speed)
    {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.year = year;
        this.vinCode = UUID.randomUUID();
        this.speed = speed;
        this.Engine = new Engine(vinCode, type);
        this.ServiceBook = new ServiceBook(this);
    }

    void setSpeed(int speed){
        if(speed>0){
            this.speed = speed;
        }else{
            this.speed = 0;
        }
    }

    int getSpeed(){
        return  this.speed;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public String getModelName(){
        return this.modelName;
    }

    public String[] getServiceBook(){
        return this.ServiceBook.getRecord();
    }

    //1. část
    /*
    public int hashCode(){
        return this.vinCode.hashCode();
    }

    public boolean equals(UUID vinCode){
        return (this.vinCode == vinCode);
    }
*/
    public String toString(){

        return this.manufacturer+" "+this.modelName+" year "+this.year+" VIN: "+this.vinCode;
    }


    public static String getNumberOfExistingCars(){

        publicNumberOfCar +=1;
        return Long.toString(publicNumberOfCar);
    }


}
