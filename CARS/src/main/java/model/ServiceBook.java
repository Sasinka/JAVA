package model;

public class ServiceBook {
    String[] serviceRecors = new String[10];
    public Car Car;
    int numberOfServiceRecords;

    public ServiceBook(Car Car){
        this.Car = Car;
        numberOfServiceRecords = 0;
    }

    public void addRecord(String input){
        numberOfServiceRecords = numberOfServiceRecords+1;
        if(numberOfServiceRecords == 10){
            numberOfServiceRecords = 0;
        }
        this.serviceRecors[numberOfServiceRecords] = input;
    }

    public String[] getRecord(){
        return this.serviceRecors;
    }
}
