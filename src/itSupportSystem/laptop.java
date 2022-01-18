package itSupportSystem;


import java.util.ArrayList;

public class laptop extends Device {

    public laptop(String identificationCode, String nmakeAndModel, String owner, String problemDescription, String repairNotes, int priority) {
        super(identificationCode, nmakeAndModel, owner, problemDescription, repairNotes, priority);
    }

    @Override
    public String toString() {
        return "laptop{" +
                "identificationCode='" + identificationCode + '\'' +
                ", nmakeAndModel='" + nmakeAndModel + '\'' +
                ", owner='" + owner + '\'' +
                ", problemDescription='" + problemDescription + '\'' +
                ", repairNotes='" + repairNotes + '\'' +
                ", priority=" + priority +
                '}';
    }



}