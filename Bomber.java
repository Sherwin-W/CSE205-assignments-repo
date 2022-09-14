public class Bomber extends AircraftEntity{
    private int bombCarryingCapacity;
    private double maxFlyingAltitude;
    private boolean isJet;

    public Bomber(String entityName, int ammo, double range, boolean isJet){
        entityName = this.entityName;
        ammo = this.ammo;
        range = this.range;
        isJet = this.isJet;

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
        if(isJet){
            type = "Jet Type";
        }
        else{
            type = "Propeller Type";
        }
        return "Bomber:\t" + type + "\nAircraft name:\t" + this.entityName + "\nCurrent Ammo:\t" + this.ammo + "\nRange:\t" + 
                this.range + "\nCurrent Attack Power:\t" + this.attackPower + "\nBomb Carrying Capacity:\t" + 
                this.bombCarryingCapacity +"%\n";
        
    }
}
