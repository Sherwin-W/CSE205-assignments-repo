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

    public AircraftEntity(String entityName, int ammo, double range, int attackPower){
        this.entityName = entityName;
        this.ammo = ammo;
        this.range = range;
        this.attackPower = attackPower;
    }

    public int getAttackPower(){
        return this.attackPower;
    }

    public void computeAttackPower(){

    }

    public String toString(){
        return "Aircraft name:\t" + this.entityName + "\nCurrent Ammo:\t" + this.ammo + 
                "\nRange:\t" + this.range + "\nCurrent Attack Power:\t" + attackPower + "\n";
    }

}
