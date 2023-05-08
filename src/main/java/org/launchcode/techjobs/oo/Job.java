package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }


    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String dan = "Data not available";
                if((name == null || name == "")&&
                        (employer == null || employer.getValue() == "") &&
                        (location == null || location.getValue() =="")&&
                        (positionType == null || positionType.getValue() =="")&&
                        (coreCompetency == null || coreCompetency.getValue() == "")

        ){
            return "OOPS! This job does not seem to exist.";
        }
        if (name == null || name == "") {
            name = dan;
        }
        if (employer == null || employer.getValue() == "") {
            employer.setValue(dan);
        }
        if(location == null || location.getValue() ==""){
            location.setValue(dan);
        }
        if (positionType == null || positionType.getValue() ==""){
            positionType.setValue(dan);
        }
        if(coreCompetency == null || coreCompetency.getValue() == ""){
            coreCompetency.setValue(dan);
        }
        return "\n" + "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Employer: " + employer + "\n" +
                "Location: " + location + "\n" +
                "Position Type: " + positionType + "\n" +
                "Core Competency: " + coreCompetency + "\n";
    }
//       String noData="Data not available";
//       String data="";
//        if((this.getName().equals(null) || this.getName().equals(""))&&
//                this.getEmployer().getValue().equals(null) ||this.getEmployer().getValue().equals("") &&
//                this.getLocation().getValue().equals(null) || this.getLocation().getValue().equals("")&&
//                this.getPositionType().getValue().equals(null) || this.getPositionType().getValue().equals("")&&
//                this.getCoreCompetency().getValue().equals(null) || this.getCoreCompetency().getValue().equals("")
//
//        ){
//            return "OOPS! This job does not seem to exist.";
//        }
//        else {
//             if (this.getName().equals("")) {
//                this.setName(noData);
//
//            } else if (this.getEmployer().getValue().equals("")) {
//
//                this.setEmployer(new Employer(noData));
//            } else if (this.getLocation().getValue().equals("")) {
//                //location=new Location(noData);
//                this.setLocation(new Location(noData));
//            } else if (this.getPositionType().equals("")) {
//                //positionType=new PositionType(noData);
//                this.setPositionType(new PositionType(noData));
//            } else if (this.getCoreCompetency().getValue().equals("")) {
//                //coreCompetency=new CoreCompetency(noData)
//                this.setCoreCompetency(new CoreCompetency(noData));
//            }
//        }
//
//        if (this.getId() <= 0) {
//            return
//                    '\n'+
//                     "ID: " + noData + +'\n'+
//                     "Name: " + this.getName() +'\n'+
//                    "Employer: " + this.getEmployer().getValue() +'\n'+
//                    "Location: " + this.getLocation().getValue() +'\n'+
//                    "Position Type: " + this.getPositionType().getValue() +'\n'+
//                    "Core Competency: " + this.getCoreCompetency().getValue()
//                     +'\n';
//        } else {
//            return '\n'+
//                    "ID: " + this.getId() +'\n'+
//                    "Name: " + this.getName() +'\n'+
//                    "Employer: " + this.getEmployer().getValue() +'\n'+
//                    "Location: " + this.getLocation().getValue() +'\n'+
//                    "Position Type: " + this.getPositionType().getValue() +'\n'+
//                    "Core Competency: " + this.getCoreCompetency().getValue()
//                    +'\n';
//        }

    }

