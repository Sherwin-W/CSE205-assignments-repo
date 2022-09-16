/* Assignment #: 5
    Name: Sherwin Wang
    StudentID: 1224486887
    Lecture: M W F 10:10 AM - 11:00 AM
    Description: Subclass of AircraftEntity, isJet, bombCarryingCapacity, and maxFlyingAltitude is unique to this class.
*/

import java.text.DecimalFormat;

public class Bomber extends AircraftEntity{
    private int bombCarryingCapacity;
    private double maxFlyingAltitude;
    private boolean isJet;

    public Bomber(){
        this.entityName = "";
        this.ammo = 0;
        this.range = 0.0;
        this.isJet = true;
        this.bombCarryingCapacity = 0;
        this.maxFlyingAltitude = 0.0;
    }
    //default constructor

    public Bomber(String entityName, int ammo, double range, boolean isJet){
        this.entityName = entityName;
        this.ammo = ammo;
        this.range = range;
        this.isJet = isJet;

        if(isJet){
            this.bombCarryingCapacity = 100;
            this.maxFlyingAltitude = 45.5;
        }
        else{
            this.bombCarryingCapacity = 75;
            this.maxFlyingAltitude = 34.0;
        }
    }
    //contructor with variables

    public void computeAttackPower(){
        if(this.maxFlyingAltitude >= 40.0){
            this.attackPower = (int)((this.maxFlyingAltitude + this.ammo) * (this.bombCarryingCapacity/100));
        }
        else{
            this.attackPower = (int)((this.ammo + this.range) * (this.bombCarryingCapacity/100));
        }
    }

    public String toString(){
        String type;
        DecimalFormat df = new DecimalFormat();
        if(!this.isJet){
            type = "Propeller Type";
        }
        else{
            type = "Jet Type";
        }

        return "Bomber:\t" + type + "\n" + super.toString() + "Bomb Carrying Capacity:\t" + 
                df.format(this.bombCarryingCapacity) +"%\n";
    }
    //displays information in desired format
}
