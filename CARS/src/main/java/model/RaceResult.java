package model;

import model.TimeSpan;

import java.sql.Time;

public class RaceResult {
    private Car car;
    private TimeSpan timeSpan;



    RaceResult(Car car, TimeSpan timeSpan) {
        setCar(car);
        setTimeSpan(timeSpan);
    }




    public void setCar(Car car) {
        this.car = car;
    }

    public void setTimeSpan(TimeSpan timeSpan) {
        this.timeSpan = timeSpan;
    }

    public Car getCar() {
        return this.car;
    }

    public TimeSpan getTimeSpan() {
        return this.timeSpan;
    }


}
