package model;

import java.sql.Time;
import java.util.UUID;

public class TimeSpan {


    private int hour;
    private int minute;
    private int second;

    public TimeSpan() {
    }

    public TimeSpan(int second) {
        setSecond(second);
    }

    public TimeSpan(int minute, int second) {
        setSecond(second);
        setMinute(minute);
    }

    public TimeSpan(int hour, int minute, int second) {
       setSecond(second);
       setMinute(minute);
       setHour(hour);
    }

    public TimeSpan(TimeSpan time){
        //tady očekávám že se daná proměná vytvoří do již správně zadefinovaných s,m ,h
        this.second = time.second;
        this.minute = time.minute;
        this.hour = time.hour;

    }

    public boolean equals(TimeSpan timeSpan){
        return (timeSpan.second == this.second && timeSpan.minute == this.minute && timeSpan.hour == this.hour);
    }

    //public UUID hashCode{
       // return
    //}

    public String toString(){
        return this.hour+" hours "+this.minute+" minutes "+this.second+" seconds";
    }

    public long getTotalSeconds(){
        return this.second+this.minute*60+this.hour*3600;
    }

    public TimeSpan add(int second){
        int temp = second + this.second;
        if(temp < 60){
            this.second = temp;
        }else if(temp < 3600){
            this.minute = this.minute + temp/60;
            this.second = temp - (temp/60)*60;
        }else{
            this.hour = this.hour + temp/3600;
            this.minute = this.minute + (temp- (temp/366)*3600)/60;
            this.second = temp -  (temp/366)*3600 - (temp- (temp/366)*3600)/60*60;
        }
        return this;
    }





    public void setHour(int hour) {
        if(hour < 0) {
            this.hour = 0;
        }else{
            this.hour = this.hour+ hour;
        }
    }

    public void setMinute(int minute) {
        int temporary = minute + this.minute;
        if(temporary < 60){
            this.minute = temporary;
        }else{
            setHour(temporary/60);
            this.minute = temporary - temporary/60;
        }
    }

    public void setSecond(int second) {

        if(0 <= second && second < 60 ) {
            this.second = second;
        }else if (second < 3600){
            setMinute(second/60);
            this.second = second - this.minute*60;
        }else{
            setHour(second/3600);
            setMinute((second-this.hour*3600)/60);
            this.second = second - this.minute*60 -this.hour*3600;
        }
    }



    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

}
