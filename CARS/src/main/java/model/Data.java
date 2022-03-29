package model;

public class Data {
    public boolean compareRaceResults(RaceResult raceResult1, RaceResult raceResult2){
        return raceResult1.getTimeSpan().getTotalSeconds() > raceResult2.getTimeSpan().getTotalSeconds() ? true : false;
    }
}
