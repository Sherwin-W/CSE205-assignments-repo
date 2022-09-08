public class Manager {
    private String firstName;
    private String lastName;
    private int yearsExperience;
    private String managingSince;

    //default constructor
    public Manager(){
        this.firstName = "";
        this.lastName = "";
        this.yearsExperience = 0;
        this.managingSince = "";
    }
    //constructor with variables
    public Manager(String firstName, String lastName, int yearsExperience, String managingSince){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsExperience = yearsExperience;
        this.managingSince = managingSince;
    }
    //getters
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getYearsExperience(){
        return this.yearsExperience;
    }
    public String getManagingSince(){
        return this.managingSince;
    }
    //setters
    public void setFirstName(String someFirstName){
        this.firstName = someFirstName;
    }
    public void setLastName(String someLastName){
        this.lastName = someLastName;
    }
    public void setYearsExperience(int someYears){
        this.yearsExperience = someYears;
    }
    public void setManagingSince(String someDate){
        this.managingSince = someDate;
    }
    public String toString(){
        return "\nLast Name:\t" + this.lastName + "\nFirst Name:\t" + 
                this.firstName + "\nYears of Experience:\t" + this.yearsExperience + 
                "\nManaging Since:\t" + this.managingSince + "\n";
    }
}
