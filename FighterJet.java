public class FighterJet extends AircraftEntity{
    private double maxSpeed;

    public FighterJet(String entityName, int ammo, double range, double maxSpeed){
        this.entityName = entityName;
        this.ammo = ammo;
        this.range = range;
        this.maxSpeed = maxSpeed;
    }

    public void computeAttackPower(){
        this.attackPower = (int)((ammo + range) * (maxSpeed/10));
    }

    public String toString(){
        return "Fighter Jet:\n + Aircraft name:\t" + this.entityName + "\nCurrent Ammo:\t" + 
                this.ammo + "\nRange:\t" + this.range + "\nCurrent Attack Power:\t" + 
                this.attackPower + "\nMaximum Speed:\t" + this.maxSpeed + "%\n";
    }
}
