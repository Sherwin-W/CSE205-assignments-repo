/* Assignment #: 5
    Name: Sherwin Wang
    StudentID: 1224486887
    Lecture: M W F 10:10 AM - 11:00 AM
    Description: This class is home to a method that accepts a string, splits it into an array, 
                then uses that to create FighterJets, Bombers, and CombatHelicopters.
*/
public class AircraftParser{

    public static AircraftEntity parseNewAircraft(String lineToParse){
        String[] info = lineToParse.split(",");
        String type = info[0];
        String name = info[1];
        int ammo = Integer.parseInt(info[2]);
        double range = Double.parseDouble(info[3]);
        //divdes the input string into accessible information

        AircraftEntity result;

        if(type.equals("Bomber")){
            boolean jetProp;
            if(info[4].equals("Jet")){
                jetProp = true;
            }
            else{
                jetProp = false;
            }
            result = new Bomber(name, ammo, range, jetProp);
        }
        //since only Bomber has a boolean
        else{
            double last = Double.parseDouble(info[4]);
            if(type.equals("FighterJet")){
                result = new FighterJet(name, ammo, range, last);
            }
            else{
                result = new CombatHelicopter(name, ammo, range, last);
            }
        }
        //FighterJet and CombatHelicopter both have a double as their last peice of information
        return result;
    }
}
