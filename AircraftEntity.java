/* Assignment #: 5
    Name: Sherwin Wang
    StudentID: 1224486887
    Lecture: M W F 10:10 AM - 11:00 AM
    Description: This class is the parent class of FighterJet, Bomber, and CombatHelicopter.
*/
public class AircraftEntity {

    protected String entityName;
    protected int ammo;
    protected double range;
    protected int attackPower;

    public AircraftEntity(){
        this.entityName = "";
        this.ammo = 0;
        this.range = 0;
        this.attackPower = 0;
    }
    //default constructor

    public AircraftEntity(String entityName, int ammo, double range, int attackPower){
        this.entityName = entityName;
        this.ammo = ammo;
        this.range = range;
        this.attackPower = attackPower;
    }
    //constructor with variables

    public int getAttackPower(){
        return this.attackPower;
    }
    //getter

    public void computeAttackPower(){

    }
    //method so that subclasses can override with their own method

    public String toString(){
        return "Aircraft name:\t" + this.entityName + "\nCurrent Ammo:\t" + this.ammo + 
                "\nRange:\t" + this.range + "\nCurrent Attack Power:\t" + attackPower + "\n";
    }
    //displays information in desired format

}
