public class Department {
    private String name;
    private Manager manager;
    private String division;
    private String location;

    public Department(){

    }
    public Department(String name, Manager manager, String division, String location){
        this.name = name;
        this.manager = manager; 
        this.division = division;
        this.location = location;
    }
    public String getName(){
        return this.name;
    }
    public Manager getManager(){
        return this.manager;
    }
    public String getDivision(){
        return this.division;
    }
    public String getLocation(){
        return this.location;
    }
    public void setName(String someName){
        this.name = someName;
    }
    public void setManager(String someFirstName, String someLastname, int someYearsExperience, String someManagingSince){
        this.manager = new Manager(someFirstName, someFirstName, someYearsExperience, someManagingSince);
    }
    public void setDivision(String someDivision){

    }
    public void setLocation(String someLocation){

    }
    public String toString(){
        return "Department Name:\t" + this.name + "\nDivision:\t" + this.division + "\nLocation:\t" + this.location + "\nManager Information:" + this.manager.toString();
    }
}
