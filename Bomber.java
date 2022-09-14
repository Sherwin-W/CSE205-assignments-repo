public class Bomber extends AircraftEntity{
    private int bombCarryingCapacity;
    private double maxFlyingAltitude;
    private boolean isJet;

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
        if(!this.isJet){
            type = "Propeller Type";
        }
        else{
            type = "Jet Type";
        }
        return "Bomber:\t" + type + "\nAircraft name:\t" + this.entityName + "\nCurrent Ammo:\t" + this.ammo + "\nRange:\t" + 
                this.range + "\nCurrent Attack Power:\t" + this.attackPower + "\nBomb Carrying Capacity:\t" + 
                this.bombCarryingCapacity +"%\n";
    }
}
