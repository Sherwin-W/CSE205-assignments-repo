public class CombatHelicopter extends AircraftEntity{
    private double minFlyingAltitude;
    private int stealthIndex;

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

    public void computeAttackPower(){
        this.attackPower = (int)((this.minFlyingAltitude + this.ammo + this.range) * this.stealthIndex);
    }

    public String toString(){
        return "Combat Helicopter:\n + Aircraft name:\t" + this.entityName + "\nCurrent Ammo:\t" + 
                this.ammo + "\nRange:\t" + this.range + "\nCurrent Attack Power:\t" + 
                this.attackPower + "\nStealth Index:\t" + this.stealthIndex + "\n";
    }
}
