package model;

import java.util.UUID;

public class Engine{
    String type;
    UUID vinCode;
    int hashCode;

    Engine(UUID vinCode, String type)
    {
        this.vinCode = vinCode;
        hashCode = hashCode();
        this.type = type;
    }

    public int hashCode(){
        return this.vinCode.hashCode();
    }

    public boolean equals(UUID vinCode){
        return (this.vinCode == vinCode);
    }

    /*
    public String toString(){

        return this.manufacturer+" "+this.modelName+" year "+this.year+" VIN: "+this.vinCode;
    }
     */
}
