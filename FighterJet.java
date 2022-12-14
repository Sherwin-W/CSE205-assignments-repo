import java.text.DecimalFormat;

/* Assignment #: 5
    Name: Sherwin Wang
    StudentID: 1224486887
    Lecture: M W F 10:10 AM - 11:00 AM
    Description: Subclass of AircraftEntity; maxSpeed is unique to this class.
*/
public class FighterJet extends AircraftEntity{
    private double maxSpeed;

    public FighterJet(){
        this.entityName = "";
        this.ammo = 0;
        this.range = 0.0;
        this.maxSpeed = 0.0;
    }
    //default constructor

    public FighterJet(String entityName, int ammo, double range, double maxSpeed){
        this.entityName = entityName;
        this.ammo = ammo;
        this.range = range;
        this.maxSpeed = maxSpeed;
    }
    //constructor with variables

    public void computeAttackPower(){
        this.attackPower = (int)((ammo + range) * (maxSpeed/10));
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat();
        return "Fighter Jet:\n" + super.toString() + "Maximum Speed:\t" + df.format(this.maxSpeed) + "%\n";
    }
    //displays information in desired format
}