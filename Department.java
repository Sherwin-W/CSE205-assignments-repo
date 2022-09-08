/*
    Name: Sherwin Wang
    StudentID: 1224486887
    Lecture: M W F 10:10 AM - 11:00 AM
    Description: The class Department contructs the department object utilizing given 
                information as well as the manager object in order to output the given information in desired format.
*/

public class Department {
    private String name;
    private Manager manager;
    private String division;
    private String location;

    //default contructor
    public Department(){
        this.name = "";
        this.manager = new Manager();
        this.division = "";
        this.location = "";
    }
    //contructor with variables
    public Department(String name, Manager manager, String division, String location){
        this.name = name;
        this.manager = manager; 
        this.division = division;
        this.location = location;
    }
    //basic getters
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
    //basic setters
    public void setName(String someName){
        this.name = someName;
    }
    public void setDivision(String someDivision){
        this.division = someDivision;
    }
    public void setLocation(String someLocation){
        this.location = someLocation;
    }
    //calls on the manager contructor from class Manager
    public void setManager(String someFirstName, String someLastname, int someYearsExperience, String someManagingSince){
        this.manager = new Manager(someFirstName, someFirstName, someYearsExperience, someManagingSince);
    }
    //provides description in correct format
    public String toString(){
        return "Department Name:\t" + this.name + "\nDivision:\t" + this.division + "\nLocation:\t" + this.location + 
                "\nManager Information:" + this.manager.toString();
    }
}
