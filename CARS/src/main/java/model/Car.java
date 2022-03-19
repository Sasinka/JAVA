package model;

import java.util.UUID;
//import Engine;

public class Car {
    String manufacturer;
    String modelName;
    int year;
    UUID vinCode;
    String type;
    //private long privateCarAmount  = getNumberOfExistingCars();;
    Engine Engine;
    public ServiceBook ServiceBook;

    public Car(String manufacturer, String modelName, int year){
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.year = year;
        this.vinCode = UUID.randomUUID();
        //Main.getNumberOfExistingCars();
        //numberOfCars = numberOfCars +1;
    }

    public Car(String manufacturer, String modelName, int year, String type)
    {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.year = year;
        this.vinCode = UUID.randomUUID();
        this.Engine = new Engine(vinCode, type);
        this.ServiceBook = new ServiceBook(this);
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

    static long PublicNumberOfCar = 0;
    public static String getNumberOfExistingCars(){

        PublicNumberOfCar +=1;
        return Long.toString(PublicNumberOfCar);
    }


}
