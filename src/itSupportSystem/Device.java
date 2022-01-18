package itSupportSystem;

public class Device {
    protected String identificationCode;
    protected String nmakeAndModel;
    protected String owner;
    protected String problemDescription;
    protected String repairNotes;
    protected int priority;


    public Device(String identificationCode, String nmakeAndModel, String owner, String problemDescription, String repairNotes, int priority) {
        this.identificationCode = identificationCode;
        this.nmakeAndModel = nmakeAndModel;
        this.owner = owner;
        this.problemDescription = problemDescription;
        this.repairNotes = repairNotes;
        this.priority = priority;

    }

    @Override
    public String toString() {
        return "Device{" +
                "identificationCode='" + identificationCode + '\'' +
                ", nmakeAndModel='" + nmakeAndModel + '\'' +
                ", owner='" + owner + '\'' +
                ", problemDescription='" + problemDescription + '\'' +
                ", repairNotes='" + repairNotes + '\'' +
                ", priority=" + priority +
                '}';
    }

    public String getIdentificationCode() {
        return identificationCode;
    }

    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }

    public String getNmakeAndModel() {
        return nmakeAndModel;
    }

    public void setNmakeAndModel(String nmakeAndModel) {
        this.nmakeAndModel = nmakeAndModel;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getRepairNotes() {
        return repairNotes;
    }

    public void setRepairNotes(String repairNotes) {
        this.repairNotes = repairNotes;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
