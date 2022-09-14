/* Assignment #: 5
    Name: Sherwin Wang
    StudentID: 1224486887
    Lecture: M W F 10:10 AM - 11:00 AM
    Description: Subclass of AircraftEntity; minFlyingAltitude and stealthIndex is unique to this class.
*/
public class CombatHelicopter extends AircraftEntity{
    private double minFlyingAltitude;
    private int stealthIndex;

    public CombatHelicopter(){
        this.entityName = "";
        this.ammo = 0;
        this.range = 0.0;
        this.minFlyingAltitude = 0.0;
        this.stealthIndex = 0;
    }
    //default constructor

    public CombatHelicopter(String entityName, int ammo, double range, double minFlyingAltitude){
        this.entityName = entityName;
        this.ammo = ammo;
        this.range = range;
        this.minFlyingAltitude = minFlyingAltitude;

        if(this.minFlyingAltitude < 5){
            this.stealthIndex = 10;
        }
        else{
            this.stealthIndex = 7;
        }
    }
    //constructor with variables

    public void computeAttackPower(){
        this.attackPower = (int)((this.minFlyingAltitude + this.ammo + this.range) * this.stealthIndex);
    }

    public String toString(){
        return "Combat Helicopter:\nAircraft name:\t" + this.entityName + "\nCurrent Ammo:\t" + 
                this.ammo + "\nRange:\t" + this.range + "\nCurrent Attack Power:\t" + 
                this.attackPower + "\nStealth Index:\t" + this.stealthIndex + "\n";
    }
    //displays information in desired format
}
