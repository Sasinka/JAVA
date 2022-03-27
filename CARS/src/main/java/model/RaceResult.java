package model;

import java.util.Date;
//Duration
//

public class RaceResult {
    private Car car;
    private Date timeSpan;

    public void setCar(Car car) {
        this.car = car;
    }

    public void setTimeSpan(Date timeSpan) {
        this.timeSpan = timeSpan;
    }

    RaceResult(Car car, Date timeSpan){
        setCar(car);
        setTimeSpan(timeSpan);
    }

    public Car getCar() {
        return this.car;
    }

    public Date getTimeSpan() {
        return this.timeSpan;
    }


}
